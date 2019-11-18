package com.other.consumer.nativejava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Pattrn produce-consumer implemented through native Java methods
 */
public class Test {

  public static void main(String[] args) throws InterruptedException {
    final ProducerConsumer consumer = new ProducerConsumer();

    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          consumer.produce();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          consumer.consumer();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    thread.start();
    thread1.start();

    thread.join();
    thread1.join();
  }
}

class ProducerConsumer {

  private Queue<Integer> queue = new LinkedList<>();
  private final int LIMIT = 10;
  private Object lock = new Object();

  public void produce() throws InterruptedException {
    int value = 0;

    while (true) {
      synchronized (lock) {
        while (queue.size() == LIMIT) {
          lock.wait();
        }
        queue.offer(value++);
        lock.notify();
      }
    }
  }

  public void consumer() throws InterruptedException {
    while (true) {
      synchronized (lock) {
        while (queue.size() == 0) {
          lock.wait();
        }
        int value = queue.poll();
        System.out.println(value);
        System.out.println("Queue size is " + queue.size());
        lock.notify();
      }
      Thread.sleep(1000);
    }
  }
}
