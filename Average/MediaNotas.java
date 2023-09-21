/**
 * The `MediaNotas` class in Java represents a collection of grades and provides methods to manipulate
 * and calculate statistics on the grades.
 */
package Average;

import java.util.ArrayList;
import java.util.Collections;

public class MediaNotas {

    private ArrayList<Double> notas = new ArrayList<Double>();
    double nota;

    // *setters
    /**
     * The function "setNota" in Java checks if a given grade is valid and sets it if it is within the
     * range of 0 to 10.
     * 
     * @param nota The parameter "nota" is a double value representing the grade or score.
     * @return The method is returning a boolean value. If the nota is valid (between 0 and 10), it
     * will return true. If the nota is invalid, it will return false.
     */
    public boolean setNota(double nota) {
        if (nota > 10 || nota < 0) {
            System.out.println("**ERROR - NOTA INVÁLIDA.");
            return false;
        } else {
            this.nota = nota;
            return true;
        }
    }

    // *getters
    public double getNota() {
        return nota;
    }

    // The `addNota` method is used to add a new note to the list of notes. It takes a `double`
    // parameter `nota` representing the new note to be added.
    public void addNota(double nota) {
        if (setNota(nota)) {
            notas.add(getNota());
        }
    }

    
    /**
     * The function removes a note from a list of notes at the specified index.
     * 
     * @param index The index parameter represents the position of the note that needs to be removed
     * from the list of notes. It is an integer value that indicates the position of the note in the
     * list, starting from 1.
     */
    public void removeNota(int index) {
        if (index < 1 || index > (notas.size()))
            System.out.println("**ERROR - NOTA INVÁLIDA OU INEXISTENTE.");
        else
            notas.remove(index - 1);
    }

    
    /**
     * The function "maiorNota" returns the highest value from a list of notes, or -1 if the list is
     * empty.
     * 
     * @return The method is returning the highest value from the "notas" list.
     */
    public double maiorNota() {
        if (notas.size() != 0) {
            return Collections.max(notas);
        } else {
            System.out.println("**ERROR - QUANTIDADE DE NOTAS INSUFICIENTE.");
            return -1;
        }
    }

    /**
     * The function "menorNota" returns the smallest value from a list of notes, or -1 if the list is
     * empty.
     * 
     * @return The method is returning the smallest value in the "notas" list.
     */
    public double menorNota() {
        if (notas.size() != 0) {
            return Collections.min(notas);
        } else {
            System.out.println("**ERROR - QUANTIDADE DE NOTAS INSUFICIENTE.");
            return -1;
        }
    }

    /**
     * The function "mudaNota" updates a specific note in a list of notes, given an index and a new
     * value.
     * 
     * @param index The index parameter represents the position of the note in the list of notes. It is
     * used to identify which note should be changed.
     * @param nota The "nota" parameter is a double value representing the new grade that needs to be
     * assigned.
     */
    public void mudaNota(int index, double nota) {
        if (setNota(nota) && index <= notas.size() && index >= 1) {
            notas.set(index - 1, getNota());
        } else
            System.out.println("**ERROR - NOTA INEXISTENTE.");

    }

    /**
     * The function calculates the average of a list of numbers.
     * 
     * @return The method is returning the average (mean) of the values in the "notas" list.
     */
    public double media() {
        double soma = 0;
        for (int i = 0; i < notas.size(); i++) {
            soma += notas.get(i);
        }
        return (soma / notas.size());
    }

    /**
     * The function "parametriza" scales the values in the "notas" list to a range of 0 to 10 based on
     * the highest value in the list.
     */
    public void parametriza() {
        double maiorNota = this.maiorNota();
        for (int i = 0; i < notas.size(); i++) {
            notas.set(i, (notas.get(i) / maiorNota) * 10);
        }
    }

    /**
     * The toString() function returns a string representation of the list of notes, formatted with two
     * decimal places and enclosed in square brackets.
     * 
     * @return The method is returning a string representation of the list of notes. If the list is
     * empty, it returns null. Otherwise, it returns a string in the format "[note1, note2, ...]" where
     * each note is formatted to two decimal places.
     */
    public String toString() {
        if(notas.size()==0)
            return null;
        String Retorno = "[";
        Retorno += String.format("%.2f", notas.get(0));
        for (int i = 1; i < notas.size(); i++) {
            Retorno += String.format(", %.2f", notas.get(i));
        }
        Retorno += "]";
        return Retorno;
    }
}
