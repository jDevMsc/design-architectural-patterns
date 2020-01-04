package com.gof.decorator.vers3;

public class UnderscorePrinter extends PrinterDecorator {
    public UnderscorePrinter(Printer printer) {
        super(printer);
    }

    public void print(String str) {
        StringBuilder builder = new StringBuilder();
        for(char c : str.toCharArray()) {
            builder.append(c).append('_');
        }
        super.print(builder.toString());
    }
}
