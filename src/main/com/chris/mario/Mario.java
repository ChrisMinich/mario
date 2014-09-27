/**
 *
 * @author Chris Minich
 *         cfminich@gmail.com
 */

package com.chris.mario;
import java.io.*;

public class Mario {

    /**
     * @param args: output-file
     *
     * Without output-file argument, prints to console.
     */

    public static void main(String[] args) throws IOException {
        Pyramid pyr = new Pyramid();
        Printer printer;
        if (args.length > 0) {
            printer = PrinterFactory.getInstance().getFilePrinter(args[0]);
        }
        else {
            printer = PrinterFactory.getInstance().getConsolePrinter();
        }
        printer.print(pyr.toString());

    }

}
