/**
 * The Shell class is a Java class that provides a command-line interface for executing commands based
 * on user input.
 */
package Motorcycle;

import java.util.*;

public class Shell {

    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Runnable> chain = new HashMap<>();
    private ArrayList<String> ui = new ArrayList<>();

    public Shell() {
        Locale.setDefault(new Locale("en", "US"));
    }

    public void setfn(String key, Runnable value) {
        chain.put(key, value);
    }

    public String par(int index) {
        return ui.get(index);
    }

    /**
     * The function executes a loop that takes user input, splits it into individual words, checks if
     * the first word is a valid command, and runs the corresponding command if it exists in the chain
     * map.
     */
    public void execute() {
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
