/**
 * The App class in the Campeonato package is a Java program that takes input for a number of teams and
 * their statistics, sorts them based on their total points, and then prints them out in descending
 * order.
 */
package Championship;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Team> equipes = new ArrayList<Team>();

        int n = sc.nextInt();

        String nome;
        int totalPontos, totalVitorias, saldoGols, golsPro;

        for (int i = 0; i < n; i++) {
            nome = sc.next();
            totalPontos = sc.nextInt();
            totalVitorias = sc.nextInt();
            saldoGols = sc.nextInt();
            golsPro = sc.nextInt();
            equipes.add(new Team(nome, totalPontos, totalVitorias, saldoGols, golsPro));
        }
        
        Collections.sort(equipes,Collections.reverseOrder());

        for (Team i : equipes) {
            System.out.println(i);
        }
        sc.close();
    }
}
