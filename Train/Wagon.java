/**
 * The Wagon class represents a wagon in a train, with a certain capacity and the ability to embark and
 * disembark passengers.
 */
package Train;

import java.util.ArrayList;

public class Wagon {
    private ArrayList<Passenger> cadeiras = new ArrayList<>();
    private int totalPassageiros = 0;
    private int capacidade;

    Wagon(int capacidade) {
        this.capacidade = capacidade;
        for (int i = 0; i < capacidade; i++) {
            cadeiras.add(null);
        }
    }

    // *getters */

    public int getTotalPassageiros() {
        return totalPassageiros;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public ArrayList<Passenger> getCadeiras() {
        return cadeiras;
    }

    /**
     * The function checks if the capacity of a vehicle is equal to the total number of passengers.
     * 
     * @return The method is returning a boolean value.
     */
    public boolean isFull() {
        return (capacidade == totalPassageiros);
    }

    // *funções */

    /**
     * The function "embarcar" checks if there is available space in a vehicle and assigns a passenger
     * to a seat if there is.
     * 
     * @param pass The parameter "pass" is of type "Passenger", which represents a passenger object.
     * @return The method is returning a boolean value. It returns true if the passenger was
     * successfully embarked and false otherwise.
     */
    public boolean embarcar(Passenger pass) {
        if (totalPassageiros != capacidade) {
            if (!exists(pass)) {
                totalPassageiros++;
                for (int i = 0; i < capacidade; i++) {
                    if (cadeiras.get(i) == null) {
                        cadeiras.set(i, pass);
                        return true;
                    }
                }
            }
        }
        return false;
    }   

    /**
     * The function "desembarcar" is used to remove a passenger from a list of passengers and update
     * the number of total passengers.
     * 
     * @param pass The parameter "pass" is of type "Passenger", which represents a passenger object.
     * @return The method is returning a boolean value. It returns true if the passenger is
     * successfully disembarked and false otherwise.
     */
    public boolean desembarcar(Passenger pass) {
        if (totalPassageiros != 0) {
            if (exists(pass)) {
                totalPassageiros--;
                for (int i = 0; i < capacidade; i++) {
                    if (cadeiras.get(i) == null)
                        continue;
                    if (cadeiras.get(i).equals(pass)) {
                        cadeiras.set(i, null);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * The exists function checks if a passenger exists in a list of chairs.
     * 
     * @param pass The parameter "pass" is of type "Passenger", which represents a passenger object.
     * @return The method is returning a boolean value.
     */
    public boolean exists(Passenger pass) {
        return cadeiras.contains(pass);
    }

    @Override
    public String toString() {
        String retorno = "[ ";
        for (Passenger i : cadeiras) {
            if (i == null)
                retorno += "- ";
            else
                retorno += String.format("%s ", i.getNome());
        }
        retorno += "]";
        return retorno;
    }
}
