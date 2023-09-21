/**
 * The App class reads input from the user to create a backpack of Pomekons and then calculates the
 * number of missing Pomekons out of a total of 151.
 */
//  https://www.beecrowd.com.br/judge/pt/problems/view/2174

package Pomedex;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mochila backpack = new Mochila(Integer.parseInt(sc.nextLine()));
        for (int i = 0; i < backpack.getQntdItens(); i++) {
            backpack.addPomekon(sc.nextLine());
        }
        System.out.println(String.format("Falta(m) %d pomekon(s).", (151 - Pomekon.tiposPomekons())));
        sc.close();
    }
}
