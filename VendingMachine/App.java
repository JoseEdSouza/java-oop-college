/**
 * The App class is a Java program that implements a vending machine, allowing users to interact with
 * it through a command-line interface.
 */
package VendingMachine;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        VendingMachine vm = new VendingMachine(0);
        // The code snippet is implementing a loop that continuously reads user input and performs
        // actions based on the input until the user enters "end".
        while (true) {
            int index = 0;
            String line = sc.nextLine();
            System.out.println("$" + line);
            String[] param = line.split(" ");

            if (param[0].equals("end")) {
                break;
            }
            float cash;

            switch (param[0]) {
                case "init":
                    int capacity = Integer.parseInt(param[1]);
                    vm = new VendingMachine(capacity);
                    break;
                case "show":
                    System.out.printf(vm.toString());
                    break;
                case "set":
                    index = Integer.parseInt(param[1]);
                    String name = param[2];
                    int quantity = Integer.parseInt(param[3]);
                    float price = Float.parseFloat(param[4]);
                    vm.setSlot(index, new Slot(name, quantity, price));
                    break;
                case "limpar":
                    index = Integer.parseInt(param[1]);
                    vm.clearSlot(index);
                    break;
                case "dinheiro":
                    cash = Float.parseFloat(param[1]);
                    vm.insertCash(cash);
                    break;
                case "troco":
                    cash = vm.withdrawCash();
                    System.out.printf("voce recebeu %.2f RS\n", cash);
                    break;
                case "comprar":

                    index = Integer.parseInt(param[1]);
                    vm.buyItem(index);
                    break;
            }
        }
        sc.close();
    }
}