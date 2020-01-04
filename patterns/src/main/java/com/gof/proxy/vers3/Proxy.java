package com.gof.proxy.vers3;

public class Proxy implements Subject {

    private final Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doIt() {
        System.out.println("DoIt callLoger");
        subject.doIt();
    }
}
