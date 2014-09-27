package com.chris.mario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chris on 9/26/14.
 */
public class FilePrinter implements Printer {
    public String fileName;
    public FilePrinter(String fileName) {
        this.fileName = fileName;

    }
    public void print(String s) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(s);
        } catch (IOException exc) {
            System.out.println(String.format("I/O Error: %s", exc));
        }
    }
}
