/**
 * The App class reads user input, finds the corresponding item in the Cardapio enum, and calculates
 * the total cost based on the quantity entered.
 */
// https://www.beecrowd.com.br/judge/pt/problems/view/1038

package Cantina;

import java.util.Scanner;

/**
 * The App class reads user input, splits it into command and quantity, finds the corresponding item in
 * the Cardapio enum, and calculates the total cost.
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comando = sc.nextLine();
        String[] cmd = comando.split(" ");
        int cod = Integer.parseInt(cmd[0]);
        int qntd = Integer.parseInt(cmd[1]);
        Cardapio Lanche = null;
        for (Cardapio i : Cardapio.values()) {
            if (i.getCod() == cod)
                Lanche = i;
        }
        System.out.println(String.format("Total: R$ %.2f", Lanche.conta(qntd)));
        sc.close();
    }
}
