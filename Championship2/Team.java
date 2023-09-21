/**
 * The Team class represents a team in a championship, storing information such as name, total points,
 * total victories, goal difference, and goals scored.
 */
package Championship2;

public class Team {
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
}
