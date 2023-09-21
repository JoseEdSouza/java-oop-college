/**
 * The App class is the main class of a board game program that takes user commands and performs
 * actions based on those commands.
 */
package BoardGame;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Jogo game = new Jogo(0, 0);

        while (true) {
            String comand = sc.nextLine();
            System.out.println("$" + comand);
            String cmd[] = comand.split(" ");

            if (cmd[0].equals("fim"))
                break;
            else if (cmd[0].equals("iniciar")) {
                int NumJogadores = Integer.parseInt(cmd[1]);
                int numCasas = Integer.parseInt(cmd[2]);
                game = new Jogo(NumJogadores, numCasas);
            } else if (cmd[0].equals("mover")) {
                int dice1 = Integer.parseInt(cmd[1]);
                int dice2 = Integer.parseInt(cmd[2]);
                game.addMove(dice1, dice2);
            } else if (cmd[0].equals("armadilha")) {
                int place = Integer.parseInt(cmd[1]);
                game.addTrap(place);
            } else if (cmd[0].equals("mostra"))
                System.out.println(game);
            else
                System.out.println("**ERROR:Comando inválido.");
        }
        sc.close();
    }
}
