package com.gof.decorator.vers3;

public class UpperCasePrinter  extends  PrinterDecorator{
    public UpperCasePrinter(Printer printer) {
        super(printer);
    }
    public void print(String str) {
        super.print(str.toUpperCase());
    }
}
