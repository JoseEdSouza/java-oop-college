/**
 * The `App` class is a Java program that acts as a command-line interface for interacting with a
 * pencil object.
 */
package Pencil;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class App {
    static Pencil lap = new Pencil(0.5f);

    public static void main(String[] args) {
        chain.put("init", () -> lap = new Pencil(Float.parseFloat(ui.get(1))));
        chain.put("insert",
                () -> lap.insert(new Lead(Float.parseFloat(ui.get(1)), ui.get(2), Integer.parseInt(ui.get(3)))));
        chain.put("remove", () -> lap.RemoveGrafite());
        chain.put("write", () -> lap.WritePage());
        chain.put("show", () -> System.out.println(lap.toString()));
        execute(chain, ui);
    }

    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Runnable> chain = new HashMap<>();
    static ArrayList<String> ui = new ArrayList<>();

    /**
     * The function `execute` takes a HashMap of commands and corresponding actions, and an ArrayList
     * of user input, and executes the appropriate action based on the user input until the user enters
     * "end".
     * 
     * @param chain The `chain` parameter is a `HashMap` that maps `String` keys to `Runnable` values.
     * It is used to store a collection of commands and their corresponding actions.
     * @param ui The `ui` parameter is an `ArrayList` of `String` objects. It is used to store the user
     * input, which is split by spaces and added to the `ui` list. This allows the program to easily
     * access and process individual command arguments.
     */
    static void execute(HashMap<String, Runnable> chain, ArrayList<String> ui) {
        while (true) {
            ui.clear();
            String line = scanner.nextLine();
            Collections.addAll(ui, line.split(" "));
            System.out.println("$" + line);
            if (ui.get(0).equals("end")) {
                break;
            } else if (chain.containsKey(ui.get(0))) {
                chain.get(ui.get(0)).run();
            } else {
                System.out.println("fail: comando invalido");
            }
        }
    }
}
