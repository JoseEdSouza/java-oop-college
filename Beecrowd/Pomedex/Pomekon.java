/**
 * The Pomekon class represents a Pomekon with a name and keeps track of the number of different types
 * of Pomekons.
 */
package Pomedex;

import java.util.ArrayList;

public class Pomekon {
    private String name;
    private static ArrayList<String> tipos = new ArrayList<String>();

    Pomekon(String name) {
        this.name = name;
        if (!tipos.contains(name)) {
            tipos.add(name);
        }
    }

    // *getters */

    public String getName() {
        return name;
    }

    // *funções */

    // retorna quantos tipos de pomekons tem.
    /**
     * The function "tiposPomekons" returns the number of types of Pomekons.
     * 
     * @return The number of elements in the "tipos" list.
     */
    static public int tiposPomekons() {
        return tipos.size();
    }
}