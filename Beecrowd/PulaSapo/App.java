/**
 * The App class in the PulaSapo package is a Java program that takes user input to create a game and
 * add obstacles to it.
 */
package PulaSapo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comando = sc.nextLine();
        String[] cmd = comando.split(" ");
        Jogo game = new Jogo(toInt(cmd[0]), toInt(cmd[1]));
        comando = sc.nextLine();
        cmd = comando.split(" ");
        for (int i = 0; i < game.getNumObstaculos(); i++) {
            game.addObstaculo(toInt(cmd[i]));
        }
        game.GameOver();
        sc.close();
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }
}