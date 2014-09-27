package com.chris.mario;

/**
 * Created by chris on 9/26/14.
 */
public class ConsolePrinter implements Printer {



    private ConsolePrinter() {
    }

    private static ConsolePrinter instance;

    public void print(String s) {
        System.out.print(s);
    }

    public static Printer getInstance() {
        if (instance == null) {
            instance = new ConsolePrinter();
        }
        return instance;
    }
}
