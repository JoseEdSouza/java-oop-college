/**
 * The "CompareTeam" class is a Java implementation of the Comparator interface used to compare Team
 * objects based on their total points, victories, goal difference, and goals scored.
 */
package Championship2;

import java.util.Comparator;

/**
 * The class "CompareTeam" is a Java implementation of the Comparator interface used to compare Team
 * objects based on their total points, victories, goal difference, and goals scored.
 */
public class CompareTeam implements Comparator<Team> {
    @Override
    public int compare(Team o, Team e) {
        // compara pontos
        if (o.getTotalPontos() > e.getTotalPontos())
            return -1;
        else if (o.getTotalPontos() < e.getTotalPontos())
            return 1;
        else {// compara vitórias
            if (o.getTotalVitorias() > e.getTotalVitorias())
                return -1;
            else if (o.getTotalVitorias() < e.getTotalVitorias())
                return 1;
            else {// compara saldo de gols
                if (o.getSaldoGols() > e.getSaldoGols())
                    return -1;
                else if (o.getSaldoGols() < e.getSaldoGols())
                    return 1;
                else {// compara gols pró
                    if (o.getGolsPro() > e.getGolsPro())
                        return -1;
                    else if (o.getGolsPro() < e.getGolsPro())
                        return 1;
                    else {
                        System.out.println("Informações insuficientes");
                        return 0;
                    }
                }
            }
        }
    }
}
