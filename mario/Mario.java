/**
 *
 * @author Chris Minich
 *         cfminich@gmail.com
 */

package mario;
import java.io.*;

public class Mario {

    /**
     * @param args: output-file
     *
     * Without output-file argument, prints to console.
     */

    public static void main(String[] args) throws IOException {
        Pyramid pyr = new Pyramid();
        if (args.length > 0) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(args[0])))
            {
                bw.write(pyr.toString());
            } catch (IOException exc) {
                System.out.println(String.format("I/O Error: %s", exc));
            }
        }
        else {
            System.out.print(pyr.toString());
        }

    }

}
