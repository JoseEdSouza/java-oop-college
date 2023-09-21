/**
 * The App class is a Java program that allows users to interact with a virtual pet by entering
 * commands through the console.
 */
package Tamagochi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet tamaPet = new Pet(0, 0, 0);
        while (true) {
            String comando = sc.nextLine();
            System.out.println("$" + comando);
            String cmd[] = comando.split(" ");
            if (cmd[0].equals("fim"))
                break;
            else if (cmd[0].equals("mostra"))
                System.out.println(tamaPet);
            else if (cmd[0].equals("iniciar")) {
                int energia = Integer.parseInt(cmd[1]);
                int fome = Integer.parseInt(cmd[2]);
                int banho = Integer.parseInt(cmd[3]);
                tamaPet = new Pet(energia, fome, banho);
            } else if (cmd[0].equals("brincar"))
                tamaPet.brincar();
            else if (cmd[0].equals("comer"))
                tamaPet.comer();
            else if (cmd[0].equals("limpar"))
                tamaPet.limpar();
            else if (cmd[0].equals("dormir"))
                tamaPet.dormir();
            else
                System.out.println("**ERROR-comando inválido");
        }
        sc.close();
    }
}