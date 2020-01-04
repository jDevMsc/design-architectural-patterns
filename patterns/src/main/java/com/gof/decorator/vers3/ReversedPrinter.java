package com.gof.decorator.vers3;

import java.util.ArrayList;
import java.util.List;

public class ReversedPrinter extends PrinterDecorator {

    public ReversedPrinter(Printer printer) {
        super(printer);
    }

    private static List<Character> string2CharList(String str) {
        char[] chars = str.toCharArray();
        List<Character> reversed = new ArrayList<>();
        for(char character : chars) {
            reversed.add(0,character);
        }
        return reversed;
    }

    private static String list2String(List<Character> reversed) {
        StringBuilder builder = new StringBuilder();
        for(char character : reversed) {
            builder.append(character);
        }
        return builder.toString();
    }

    public void print(String str) {
    super.print(list2String(string2CharList(str)));
    }

}
