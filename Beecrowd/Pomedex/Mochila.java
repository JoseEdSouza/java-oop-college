/**
 * The Mochila class represents a backpack that can store Pomekon objects, with the ability to add
 * Pomekons to the backpack.
 */
package Pomedex;

import java.util.ArrayList;

public class Mochila {
    private int qntdItens;
    private ArrayList<Pomekon> pomekons = new ArrayList<Pomekon>();

    Mochila(int qntdItens) {
        this.qntdItens = qntdItens;
    }

    // *getters */

    public int getQntdItens() {
        return qntdItens;
    }

    // *funções */

    // add um pomekon na mochila
    /**
     * The addPomekon function adds a new Pomekon object to the pomekons list.
     * 
     * @param pomekon The parameter "pomekon" is a String that represents the name of a Pomekon.
     */
    public void addPomekon(String pomekon) {
        pomekons.add(new Pomekon(pomekon));
    }

}
