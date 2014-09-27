package com.chris.mario;

/**
 * Created by chris on 9/26/14.
 */
public class PrinterFactory {

    public Printer getConsolePrinter() {
        return new ConsolePrinter();
    }

    public Printer getFilePrinter(String fileName) {
        return new FilePrinter(fileName);
    }


}
