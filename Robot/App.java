/**
 * The App class in the robo package takes user input, creates a Robo object, and prints out the valid
 * words from the input.
 */
package Robot;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Robot r = new Robot(s);
        for (String palavra : r.palavrasValidas()) {
            System.out.println(palavra);
        }
        sc.close();
    }
}
