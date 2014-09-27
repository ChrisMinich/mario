/**
 *
 * @author Chris Minich
 *         cfminich@gmail.com
 */

package com.chris.mario;
import java.io.*;

class Pyramid extends Shape {
    private String pyramid;

    public Pyramid() throws IOException {
        pyramid = build(promptToSetDimensions());
    }

    protected int promptToSetDimensions() throws IOException {
        int height = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(String.format("Enter height (2 - 23): "));
        do {
            try{
                height = Integer.parseInt(br.readLine());
            }
            catch (NumberFormatException nfe) {
                System.err.println(String.format("Invalid Format!"));
            }
        } while ((height < 2) || (height > 23));
        return height;
    }

    protected String build(int height) {
        StringBuilder structure = new StringBuilder();

        for (int row = 1; row <= height; row++) {
            int spaces = height - row;
            for (int col = 1; col <= height; col++) {
                if (col <= spaces) structure.append(" ");
                else structure.append("#");
            }
            structure.append("#\n");
        }
        return structure.toString();
    }

    @Override
    public String toString() {
        return pyramid;
    }

}
