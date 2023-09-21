/**
 * The App class is a Java program that allows the user to interact with a Watch object by entering
 * commands through the console.
 */
package Watch;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Watch time = new Watch(0, 0, 0);
        while (true) {
            String comand = sc.nextLine();
            System.out.println("$" + comand);
            String cmd[] = comand.split(" ");
            if (cmd[0].equals("fim"))
                break;
            else if (cmd[0].equals("setar")) {
                int hora = Integer.parseInt(cmd[1]);
                int minuto = Integer.parseInt(cmd[2]);
                int segundo = Integer.parseInt(cmd[3]);
                time.setHora(hora);
                time.setMinuto(minuto);
                time.setSegundo(segundo);
            } else if (cmd[0].equals("next"))
                time.proxSegundo();
            else if (cmd[0].equals("mostra"))
                System.out.println(time);
            else
                System.out.println("**ERROR-Comando inválido.");
        }
        sc.close();
    }

}
