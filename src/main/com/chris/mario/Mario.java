/**
 *
 * @author Chris Minich
 *         cfminich@gmail.com
 */

package com.chris.mario;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;

public class Mario {

    /**
     * @param args: output-file
     *
     * Without output-file argument, prints to console.
     */

    public static void main(String[] args) throws IOException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Mario mario = (Mario) applicationContext.getBean("mario");
        mario.runApp(args);
    }

    private Printer filePrinter;

    private Printer consolePrinter;

    private void runApp(String[] args) throws IOException {
        System.out.println("We pulled the Mario bean");
        Pyramid pyr = new Pyramid();
        Printer printer;
        if (args.length > 0) {
            printer = filePrinter;
        } else {
            printer = consolePrinter;
        }
        printer.print(pyr.toString());
    }

    public void setConsolePrinter(Printer consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public void setFilePrinter(Printer filePrinter) {
        this.filePrinter = filePrinter;
    }
}
