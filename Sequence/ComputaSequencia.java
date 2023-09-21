/**
 * The `ComputaSequencia` class allows users to add or remove numbers from a list and calculate the sum
 * of all the numbers in the list.
 */
package Sequence;

import java.util.ArrayList;
import java.util.Arrays;

public class ComputaSequencia {
    private ArrayList <Integer> Numeros = new ArrayList<Integer>();
    private int NotaToAdd;

    //*setters */

    public boolean setNotaToAdd(int notaToAdd) {
        if(notaToAdd<0){
            System.out.println("**ERROR-NÚMERO INVÁLIDO.");
            return false;
        }
        else{
            NotaToAdd = notaToAdd;
            return true;
        }
    }

    //*getters */

    public int getNotaToAdd() {
        return NotaToAdd;
    }

    //*funções */

    
    /**
     * The function "cadastra" adds or removes a value from a list based on certain conditions.
     * 
     * @param valor The parameter "valor" is an integer value that is passed to the method "cadastra".
     */
    public void cadastra(int valor){
        if(valor==0){
            Numeros.remove(Numeros.size()-1);
        }
        else if(setNotaToAdd(valor)){
            Numeros.add(getNotaToAdd());
        }
    }

    
    /**
     * The function `computa` calculates the sum of all the numbers in the `Numeros` list.
     * 
     * @return The method is returning the sum of all the numbers in the "Numeros" list.
     */
    public int computa(){
        int soma=0;
        for(int i=0;i<Numeros.size();i++){
            soma+=Numeros.get(i);
        }
        return soma;
    }

    public String toString(){
        return "valores =  " + Arrays.toString(Numeros.toArray());
    }
}
