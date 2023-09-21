/**
 * The Team class represents a team in a championship, with attributes such as name, total points,
 * total victories, goal difference, and goals scored.
 */
package Championship;

import java.lang.Comparable;

public class Team implements Comparable<Team> {

    private String name;
    private int totalPontos;
    private int totalVitorias;
    private int saldoGols;
    private int golsPro;

    Team(String name, int totalPontos, int totalVitorias, int saldoGols, int golsPro) {
        this.name = name;
        this.totalPontos = totalPontos;
        this.totalVitorias = totalVitorias;
        this.saldoGols = saldoGols;
        this.golsPro = golsPro;
    }

    // * getters */

    public String getName() {
        return name;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public int getGolsPro() {
        return golsPro;
    }

    // * funções */

    @Override
    public String toString() {
        return String.format("Equipe [nome=%s, totalPontos=%d, totalVitorias=%d, saldoGols=%d, golsPro=%d]", name,
                totalPontos, totalVitorias, saldoGols, golsPro);
    }

    @Override
    public int compareTo(Team e) {
        // compara pontos
        if (this.totalPontos > e.getTotalPontos())
            return 1;
        else if (this.totalPontos < e.getTotalPontos())
            return -1;
        else {// compara vitórias
            if (this.totalVitorias > e.getTotalVitorias())
                return 1;
            else if (this.totalVitorias < e.getTotalVitorias())
                return -1;
            else {// compara saldo de gols
                if (this.saldoGols > e.getSaldoGols())
                    return 1;
                else if (this.saldoGols < e.getSaldoGols())
                    return -1;
                else {// compara gols pró
                    if (this.golsPro > e.getGolsPro())
                        return 1;
                    else if (this.golsPro < e.getGolsPro())
                        return -1;
                    else {
                        System.out.println("Informações insuficientes");
                        return 0;
                    }
                }
            }
        }
    }
}
