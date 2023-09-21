/**
 * The above class is a Java program that implements a simple shell interface for a boteco (a Brazilian
 * bar) where users can call, finish, arrive, and show information about the bar.
 */
package SuperMarket;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Locale;

public class App {
    static Shell sh = new Shell();
    static Mercantil mercantil = new Mercantil(0);

    public static void main(String[] args) {
        sh.setfn("init", () -> mercantil = new Mercantil(toInt(sh.par(1))));
        sh.setfn("call", () -> mercantil.chamar(toInt(sh.par(1))));
        sh.setfn("finish", () -> mercantil.finalizarAtendimento(toInt(sh.par(1))));
        sh.setfn("arrive", () -> mercantil.chegar(new Pessoa(sh.par(1))));
        sh.setfn("show", () -> System.out.println(mercantil));
        sh.execute();
    }

    static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

/**
 * The Shell class is a Java class that provides a command-line interface for executing commands and
 * storing a chain of commands to be executed.
 */
class Shell {
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
     * the first word is a valid command, and runs the corresponding command if it exists in a chain.
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
