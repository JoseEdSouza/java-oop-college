/**
 * The Train class represents a train and provides methods to add wagons, board and disembark
 * passengers, and track passenger movements.
 */
package Train;

import java.util.ArrayList;

public class Train {
    private int maxWagonNumber;
    private int totalVagoes = 0;
    private ArrayList<Wagon> Vagoes = new ArrayList<>();
    Register registro = new Register();

    Train(int maxVagoes) {
        this.maxWagonNumber = maxVagoes;
    }

    // *funções */

    /**
     * The function "addVagao" adds a wagon to a list of wagons if the maximum number of wagons has not
     * been reached.
     * 
     * @param vagao The parameter "vagao" is of type "Wagon".
     */
    public void addVagao(Wagon vagao) {
        if (totalVagoes != maxWagonNumber) {
            Vagoes.add(vagao);
            totalVagoes++;
        } else
            System.out.println("fail: limite de vagões atingido");
    }

    /**
     * The function "embarcar" checks if a passenger is already on the train, if not, it registers the
     * passenger and then tries to find an available wagon to board the passenger onto.
     * 
     * @param p The parameter "p" is of type "Passenger", which represents a passenger who wants to
     * board the train.
     */
    public void embarcar(Passenger p) {
        if (!registro.getPassList().contains(p)) {
            registro.cadastrar(p);
        }
        int cont = 0;
        if (!exists(p)) {
            for (Wagon v : Vagoes) {
                if (!v.isFull()) {
                    if (v.embarcar(p))
                        registro.Movimentar(p.getNome(), Direction.IN);
                    break;
                } else
                    cont++;
                if (cont == totalVagoes)
                    System.out.println("fail: trem lotado");
            }
        } else
            System.out.printf("fail: %s já está no trem\n", p.getNome());

    }

    /**
     * The function "desembarcar" is used to remove a passenger from a train and update the passenger's
     * movement record.
     * 
     * @param p The parameter "p" is of type "Passenger".
     */
    public void desembarcar(Passenger p) {
        int cont = 0;
        if (exists(p)) {
            for (Wagon v : Vagoes) {
                if (v.getTotalPassageiros() != 0) {
                    if (v.desembarcar(p)) {
                        registro.Movimentar(p.getNome(), Direction.OUT);
                        break;
                    } else
                        continue;
                } else
                    cont++;
                if (cont == totalVagoes)
                    System.out.println("fail: trem vazio");
            }
        } else
            System.out.printf("fail: %s nao esta no trem\n", p.getNome());
    }

    /**
     * The function checks if a passenger exists in any of the wagons.
     * 
     * @param pass The parameter "pass" is of type "Passenger".
     * @return The method is returning a boolean value. It returns true if the passenger exists in any
     * of the wagons, and false if the passenger does not exist in any of the wagons.
     */
    public boolean exists(Passenger pass) {
        for (Wagon v : Vagoes) {
            if (v.exists(pass))
                return true;
        }
        return false;
    }

    /**
     * The function "cadastro" prints the names of all passengers in the "registro" object.
     */
    public void cadastro() {
        for (Passenger p : registro.getPassList())
            System.out.println(p.getNome());
    }

    /**
     * The function "movimentos" prints out each movement in the "registro" object's "fluxo" list.
     */
    public void movimentos() {
        for (Movment m : registro.getFluxo()) {
            System.out.println(m);
        }
    }

    @Override
    public String toString() {
        String retorno = "Trem ";
        for (Wagon v : Vagoes) {
            retorno += v;
        }
        return retorno;
    }
}
