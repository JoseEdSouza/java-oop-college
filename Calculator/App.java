/**
 * The App class is a Java program that acts as a calculator, taking user input and performing various
 * mathematical operations.
 */
package Calculator;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora(0);
        while (true) {
            String linha = sc.nextLine();
            System.out.println("$" + linha);
            String cmd[] = linha.split(" ");
            if (linha.equals("fim"))
                break;
            else if (cmd[0].equals("iniciar")) {
                // ajustando battery max
                calc = new Calculadora(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("mostra"))
                System.out.println(calc);
            else if (cmd[0].equals("soma")) {
                int a = Integer.parseInt(cmd[1]);
                int b = Integer.parseInt(cmd[2]);
                calc.plus(a, b);
            } else if (cmd[0].equals("divida")) {
                int a = Integer.parseInt(cmd[1]);
                int b = Integer.parseInt(cmd[2]);
                calc.div(a, b);
            } else if (cmd[0].equals("carrega")) {
                int carga = Integer.parseInt(cmd[1]);
                calc.chargeBattery(carga);
            } else
                System.out.println("**ERROR-Comando Inválido");
        }
        sc.close();
    }
}
