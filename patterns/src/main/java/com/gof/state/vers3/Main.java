package com.gof.state.vers3;

/**
 * Client
 */
public class Main {

    public static void main(String[] args) {
        StateContext context = new StateContext(new UpperCaseState());

        /**
         * Depending on where I am, I translate the letter to either upper case or lower case
         */
        String str = "MAY the foRce BE WiTh you";
        for(Character character : str.toCharArray()) {
            context.print(character);
        }
    }
}
