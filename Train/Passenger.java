/**
 * The Passenger class represents a passenger with a name in a train system.
 */
package Train;

public class Passenger {
    private String nome;

    Passenger(String nome) {
        this.nome = nome;
    }

    // *getters */

    public String getNome() {
        return nome;
    }

    // *funções */

    @Override
    public String toString() {
        return String.format("nome: %s", nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Passenger other = (Passenger) obj;
        return (this.nome.equals(other.getNome()));

    }
}
