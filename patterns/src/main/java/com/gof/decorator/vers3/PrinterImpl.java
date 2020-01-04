package com.gof.decorator.vers3;

/**
 *  Basic action print str
 */
public class PrinterImpl implements Printer {

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
