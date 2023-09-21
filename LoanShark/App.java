/**
 * The App class is a Java program that serves as the main entry point for running an LoanShark
 * application.
 */
package LoanShark;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoanShark ag = new LoanShark(0);
        String comando;
        String[] cmd;
        while (true) {
            comando = sc.nextLine();
            System.out.println("$" + comando);
            cmd = comando.split(" ");
            if (cmd[0].equals("end"))
                break;
            else if (cmd[0].equals("init")) {
                ag = new LoanShark(toInt(cmd[1]));
            } else if (cmd[0].equals("addCli")) {
                ag.addCli(cmd[1], toInt(cmd[2]));
            } else if (cmd[0].equals("lend")) {
                ag.lend(cmd[1], toInt(cmd[2]));
            } else if (cmd[0].equals("receive")) {
                ag.receive(cmd[1], toInt(cmd[2]));
            } else if (cmd[0].equals("kill")) {
                ag.kill(cmd[1]);
            } else if (cmd[0].equals("show")) {
                System.out.println(ag);
            } else
                System.out.println("fail: comando invalido");
        }
        sc.close();

    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }
}
