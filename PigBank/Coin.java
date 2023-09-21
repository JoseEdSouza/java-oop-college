// The code you provided is defining an enum called `Coin` in the `Cofrinho` package. An enum is a
// special type in Java that represents a fixed set of constants.
package PigBank;

public enum Coin {

    M10(0.10, 1), M25(0.25, 2), M50(0.50, 3), M100(1.00, 4);

    public double valor;
    public int volume;

    private Coin(double valor, int volume) {
        this.valor = valor;
        this.volume = volume;
    }

    // *getters */

    public int getVolume() {
        return volume;
    }

    public double getValor() {
        return valor;
    }

    // *funções */

    public String getDescription() {
        return "Coin: " + valor;
    }

    public String toString() {
        return "Coin: " + valor + "Volume: " + valor;
    }

}
