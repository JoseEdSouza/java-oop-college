package Balance;

public class Pessoa {
    private String nome;
    private double massa;
    // `private Planeta planet;` is declaring a private instance variable `planet`
    // of type `Planeta` in
    // the `Pessoa` class. This variable is used to store the planet on which the
    // person's mass is
    // measured.
    private Planeta planet;

    Pessoa(String nome, double massa, Planeta planet) {
        this.nome = nome;
        this.massa = massa;
        this.planet = planet;
    }

    // *getters */

    public double getMassa() {
        return massa;
    }

    public Planeta getPlanet() {
        return planet;
    }

    // *funções */

    /**
     * The function calculates the equivalent mass on another planet based on the
     * gravitational force.
     * 
     * @param otherPlanet The parameter "otherPlanet" is an object of type
     *                    "Planeta". It represents
     *                    another planet for which we want to calculate the
     *                    equivalent mass.
     * @return The method is returning a double value.
     */
    public double massaEquivalente(Planeta otherPlanet) {
        System.out.println(
                String.format("A forca gravitacional no planeta %s é %.2f", otherPlanet, otherPlanet.gravidade()));
        return massa * (otherPlanet.gravidade() / planet.gravidade());
    }

    /**
     * The toString() function returns a formatted string representation of an
     * object's name, mass, and
     * planet.
     * 
     * @return The method is returning a formatted string that includes the values
     *         of the variables
     *         "nome", "massa", and "planet".
     */
    public String toString() {
        return String.format("nome: %s mass: %.2f planeta: %s", nome, massa, planet);
    }

}
