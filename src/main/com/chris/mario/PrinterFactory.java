package com.chris.mario;

/**
 * Created by chris on 9/26/14.
 */
public class PrinterFactory {

    private PrinterFactory() {}

    private static PrinterFactory instance;

    public static PrinterFactory getInstance() {
        if (instance == null) {
            instance = new PrinterFactory();
        }
        return instance;
    }

    public Printer getConsolePrinter() {
        return ConsolePrinter.getInstance();
    }

    public Printer getFilePrinter(String fileName) {
        return new FilePrinter(fileName);
    }


}
