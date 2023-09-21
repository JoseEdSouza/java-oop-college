/**
 * The "Mercantil" class represents a mercantile establishment with multiple cashiers, a queue of
 * people waiting to be served, and methods to manage the queue and cashiers.
 */
package SuperMarket;

import java.util.ArrayList;

public class Mercantil {

    private int qntdCaixas;
    private ArrayList<Pessoa> fila = new ArrayList<Pessoa>();
    private Pessoa[] caixas;

    Mercantil(int qntdCaixas) {
        this.qntdCaixas = qntdCaixas;
        caixas = new Pessoa[qntdCaixas];
    }

    /**
     * The function "chegar" adds a person to a queue.
     * 
     * @param pessoa The parameter "pessoa" is of type "Pessoa", which represents a
     *               person.
     */
    public void chegar(Pessoa pessoa) {
        fila.add(pessoa);

    }

    /**
     * The function "chamar" checks if a given index is valid, assigns a value from
     * a queue to a
     * specific index in an array, and returns true if successful.
     * 
     * @param index The index parameter represents the index of a box in an array of
     *              boxes.
     * @return The method is returning a boolean value.
     */
    public boolean chamar(int index) {
        if (index > qntdCaixas - 1 || index < 0) {
            System.out.println("fail: index inválido");
            return false;
        }
        if (caixas[index] == null && fila.size() > 0) {
            caixas[index] = fila.get(0);
            fila.remove(0);
            return true;
        } else if (fila.size() <= 0) {
            System.out.println("fail: fila vazia");
            return false;
        } else if (caixas[index] != null) {
            System.out.println("fail: caixa em atendimento");
            return false;
        } else {
            System.out.println("fail: caixa vazio");
            return false;
        }
    }

    /**
     * The function "finalizarAtendimento" in Java finalizes the service of a person
     * at a specific
     * index in an array of cashiers and returns the person who was served.
     * 
     * @param index The index parameter represents the position of the caixa (box)
     *              in an array called
     *              "caixas". The method finalizarAtendimento(int index) is used to
     *              finalize the attendance of a
     *              person at the specified caixa.
     * @return The method is returning the object of type "Pessoa" that was removed
     *         from the "caixas"
     *         array at the specified index.
     */
    public Pessoa finalizarAtendimento(int index) {
        if (index > qntdCaixas || index < 0) {
            System.out.println("fail: index inválido");
            return null;
        }
        Pessoa pessoaAtendida = caixas[index];
        caixas[index] = null;
        return pessoaAtendida;
    }

    /**
     * The toString() function returns a string representation of the object,
     * including the contents of
     * an array and a queue.
     * 
     * @return The method is returning a string representation of the object.
     */
    public String toString() {
        String retorno = "|";
        for (int i = 0; i < qntdCaixas; i++) {
            retorno += String.format("%d:", i);
            if (caixas[i] != null)
                retorno += caixas[i];
            else
                retorno += "-----";
            retorno += "|";
        }
        retorno += "\n";
        retorno += "Espera: " + fila.toString();
        return retorno;
    }
}
