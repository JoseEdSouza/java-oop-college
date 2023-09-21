/**
 * The App class reads input data for a number of teams in a championship, creates Team objects with
 * the data, sorts the teams based on certain criteria, and then prints the sorted teams.
 */
package Championship2;

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Team[] equipes = new Team[n];

        String nome;
        int totalPontos, totalVitorias, saldoGols, golsPro;

        for (int i = 0; i < n; i++) {
            nome = sc.next();
            totalPontos = sc.nextInt();
            totalVitorias = sc.nextInt();
            saldoGols = sc.nextInt();
            golsPro = sc.nextInt();
            equipes[i] = new Team(nome, totalPontos, totalVitorias, saldoGols, golsPro);
        }

        Arrays.sort(equipes, new CompareTeam());

        for (int i = 0; i < n; i++) {
            System.out.println(equipes[i]);
        }

        sc.close();
    }
}
