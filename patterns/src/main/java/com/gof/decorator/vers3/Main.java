package com.gof.decorator.vers3;

public class Main {

    public static void main(String[] args) {
        //basic
        Printer normalPrinter = new PrinterImpl();
        normalPrinter.print("Test");

        //Decorator
        Printer decorator = new PrinterDecorator(normalPrinter);
        decorator.print("Decorator does nothing");

        //does nothing only add action in basic
        Printer reversedPrinter = new ReversedPrinter(normalPrinter);
        Printer upperCasePrinter = new UpperCasePrinter(normalPrinter);

        normalPrinter.print("Wrapper in the Decorator pattern");
        reversedPrinter.print("ReverseWrapper in the Decorator pattern");
        upperCasePrinter.print("Wrapper in the Decorator pattern");
        System.out.println();

        Printer urPrinter = new UpperCasePrinter(reversedPrinter);
        urPrinter.print("UpReverseWrapper in the Decorator pattern");

        Printer upperReverseUnderscorePrinter = new UnderscorePrinter(urPrinter);
        upperReverseUnderscorePrinter.print("All printers");

    }

}
