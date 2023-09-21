/**
 * The `Movment` class represents a movement of a passenger in a specific direction.
 */
package Train;

public class Movment {
    private Passenger pass;
    private Direction dir;

    Movment(Passenger pass, Direction dir) {
        this.pass = pass;
        this.dir = dir;
    }

    // *funções */

    @Override
    public String toString() {
        return pass.getNome() + " " + dir.getValue();
    }
}
