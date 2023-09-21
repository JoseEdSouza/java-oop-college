/**
 * The App class is a Java program that allows users to interact with a train system by entering
 * commands through the console.
 */
package Train;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Train trem = null;

        while (true) {
            String comand = sc.nextLine();
            String[] cmd = comand.split(" ");

            System.out.println("$" + comand);

            if (cmd[0].equals("end")) {
                break;
            } else if (cmd[0].equals("init")) {
                int maxVagoes = Integer.parseInt(cmd[1]);
                trem = new Train(maxVagoes);
            } else if (cmd[0].equals("nwvag")) {
                int capacidade = Integer.parseInt(cmd[1]);
                trem.addVagao(new Wagon(capacidade));
            } else if (cmd[0].equals("la")) {
                System.out.println(trem);
            } else if (cmd[0].equals("entrar")) {
                String myString = cmd[1];
                trem.embarcar(new Passenger(myString));
            } else if (cmd[0].equals("sair")) {
                trem.desembarcar(new Passenger(cmd[1]));
            } else if (cmd[0].equals("cadastro")) {
                trem.cadastro();
            } else if (cmd[0].equals("movimentacao")) {
                trem.movimentos();
            } else
                System.out.println("fail: comando invalido");
        }
        sc.close();
    }
}