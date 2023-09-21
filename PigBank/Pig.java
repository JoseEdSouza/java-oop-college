/**
 * The Pig class represents a container that can hold coins and items, with methods to add coins and
 * items, break the container, and retrieve the value of the coins and the items inside.
 */
package PigBank;

public class Pig {
    private int volume = 0;
    private double valor = 0;
    private boolean quebrado = false;
    private int volumeMax;
    private String itens = "";

    Pig(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    // *getters */

    public int getVolume() {
        return volume;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public boolean isBroken() {
        return quebrado;
    }

    // *funções */


    /**
     * The addCoin function checks if a coin can be added to a container based on its volume and
     * whether the container is broken or full.
     * 
     * @param moeda The parameter "moeda" is an object of type Coin.
     * @return The method is returning a boolean value.
     */
    public boolean addCoin(Coin moeda) {
        if (!quebrado && (volume + moeda.getVolume()) <= volumeMax) {
            this.valor += moeda.getValor();
            this.volume += moeda.getVolume();
            return true;
        } else if (quebrado) {
            System.out.println("**ERROR - ESTA QUEBRADO.");
            return false;
        } else {
            System.out.println("**ERROR - ESTA CHEIO.");
            return false;
        }
    }

    /**
     * The function "addItem" checks if an item can be added to a container based on its volume and
     * whether the container is broken or full, and returns true if the item can be added and false
     * otherwise.
     * 
     * @param item The parameter "item" is an object of type "Item".
     * @return The method is returning a boolean value.
     */
    public boolean addItem(Item item) {
        if (!quebrado && (volume + item.getVolume() <= volumeMax)) {
            this.volume += item.getVolume();
            if (!itens.equals(""))
                this.itens += " ";
            this.itens += item.getNome();
            return true;
        } else if (quebrado) {
            System.out.println("**ERROR - ESTA QUEBRADO.");
            return false;
        } else {
            System.out.println("**ERROR - ESTA CHEIO.");
            return false;
        }
    }

    /**
     * The function "breakPig" checks if the container is broken and returns false if it is, otherwise
     * it breaks the container and returns true.
     * 
     * @return The method is returning a boolean value.
     */
    public boolean breakPig() {
        if (quebrado) {
            System.out.println("**ERROR - JA QUEBRADO.");
            return false;
        } else {
            quebrado = true;
            return true;
        }

    }

    /**
     * The function "getCoins" checks if the container is broken and returns the value of the coins
     * inside if it is, otherwise it prints an error message and returns 0.
     * 
     * @return The method is returning a double value.
     */
    public double getCoins() {
        if (quebrado) {
            double valouAux = this.valor;
            this.valor = 0;
            return valouAux;
        } else {
            System.out.println("You must break the pig first");
            return 0;
        }
    }

    /**
     * The function "getItens" checks if the container is broken and returns the items inside if it is,
     * otherwise it prints an error message and returns an empty string.
     * 
     * @return The method is returning a string value.
     */
    public String getItens() {
        if (quebrado) {
            if (this.itens.equals("")) {
                System.out.println("Empty Pig");
                return "";
            }
            String retorno = "";
            String ListItens[] = this.itens.split(" ");
            int cont = 0;
            for (String i : ListItens) {
                if (cont == 0) {
                    retorno += i;
                    cont++;
                } else
                    retorno += (", " + i);
            }
            return retorno;
        } else {
            System.out.println("You must break the pig first");
            return "";
        }
    }

    public String toString() {
        String RetornoItens = "";
        if (!this.itens.equals("")) {
            String[] ListItens = this.itens.split(" ");
            int cont = 0;
            for (String i : ListItens) {
                if (cont == 0) {
                    RetornoItens += i;
                    cont++;
                } else
                    RetornoItens += ", " + i;
            }
        }
        return ("I:(" + RetornoItens + ")" + " M:(" + this.valor + ")" + " V:" + this.volume + "/" + this.volumeMax
                + " EQ:" + quebrado);

    }
}
