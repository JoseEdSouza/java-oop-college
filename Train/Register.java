/**
 * The Register class manages the registration and movement of passengers in a train system.
 */
package Train;

import java.util.ArrayList;

public class Register {
    private ArrayList<Passenger> passList = new ArrayList<>();
    private ArrayList<Movment> fluxo = new ArrayList<>();

    Register() {

    }

    // *getters */

    public ArrayList<Passenger> getPassList() {
        return passList;
    }

    public ArrayList<Movment> getFluxo() {
        return fluxo;
    }

    // *funções */

    /**
     * The function "cadastrar" adds a Passenger object to a list called "passList".
     * 
     * @param p The parameter "p" is of type Passenger.
     */
    public void cadastrar(Passenger p) {
        passList.add(p);
    }

    /**
     * The function "Movimentar" checks if a passenger is registered and adds their movement in a
     * specific direction to a list.
     * 
     * @param passName The passName parameter is a String that represents the name of the passenger.
     * @param dir The "dir" parameter is of type "Direction". It represents the direction in which the
     * passenger wants to move.
     */
    public void Movimentar(String passName, Direction dir) {
        Passenger p = new Passenger(passName);
        if(passList.contains(p)){
            fluxo.add(new Movment(p, dir));
        }
        else
            System.out.println("fail: passageiro não cadastrado");
    }
}
