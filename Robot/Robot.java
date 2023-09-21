
/** The Robot class takes a string as input, generates all possible combinations by replacing '?' with
 * 'a' and 'b', filters out invalid combinations, and returns a sorted collection of valid
 * combinations.
 */
package Robot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class Robot {
    private String palavraRecebida;

    Robot(String palavraRecebida) {
        this.palavraRecebida = palavraRecebida;
    }

    // *getters */

    /**
     * The function "getCharArray" returns the character array representation of the string
     * "palavraRecebida".
     * 
     * @return The method is returning a char array.
     */
    public char[] getCharArray() {
        return palavraRecebida.toCharArray();
    }

    /**
     * The function "getCharSet" converts a received string into an ArrayList of characters.
     * 
     * @return The method is returning an ArrayList of characters.
     */
    private ArrayList<Character> getCharSet() {
        ArrayList<Character> retorno = new ArrayList<Character>();
        char[] charArray = palavraRecebida.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            retorno.add(charArray[i]);
        }
        return retorno;
    }

    
    /**
     * The function "indexInterrogationsList" takes in a list of characters and returns a list of the
     * indices where the character '?' appears.
     * 
     * @param charSet The parameter `charSet` is an ArrayList of Characters.
     * @return The method is returning an ArrayList of Integers.
     */
    private ArrayList<Integer> indexInterrogationsList(ArrayList<Character> charSet) {
        ArrayList<Integer> retorno = new ArrayList<Integer>();
        for (int i = 0; i < charSet.size(); i++) {
            if (charSet.get(i) == '?') {
                retorno.add(i);
            }
        }
        return retorno;
    }

    /**
     * The function takes in a list of characters and recursively replaces each occurrence of '?' with
     * 'a' and 'b' to generate all possible combinations.
     * 
     * @param charList The `charList` parameter is an `ArrayList` of `Character` objects.
     * @return The method is returning a HashMap<String, ArrayList<Character>>.
     */
    private HashMap<String, ArrayList<Character>> substitui(ArrayList<Character> charList) {
        ArrayList<Character> auxCharListA = new ArrayList<Character>(charList);
        ArrayList<Character> auxCharListB = new ArrayList<Character>(charList);
        ArrayList<Integer> indexList = indexInterrogationsList(charList);
        Iterator<Integer> it = indexList.iterator();
        HashMap<String, ArrayList<Character>> retorno = new HashMap<String, ArrayList<Character>>();
        StringBuilder stringToAdd = new StringBuilder();
        auxCharListA.set(it.next(), 'a');
        if (it.hasNext()) {
            retorno.putAll(substitui(auxCharListA));
        } else {
            for (int i = 0; i < auxCharListA.size(); i++) {
                stringToAdd.append(auxCharListA.get(i));
            }
            retorno.put(stringToAdd.toString(), auxCharListA);
            stringToAdd = new StringBuilder();
        }
        it = indexList.iterator();
        stringToAdd = new StringBuilder();
        auxCharListB.set(it.next(), 'b');
        if (it.hasNext()) {
            retorno.putAll(substitui(auxCharListB));
        } else {
            for (int i = 0; i < auxCharListB.size(); i++) {
                stringToAdd.append(auxCharListB.get(i));
            }
            retorno.put(stringToAdd.toString(), auxCharListB);
            stringToAdd = new StringBuilder();
        }
        return retorno;
    }

    // The `palavrasValidas()` method in the `Robo` class generates all possible combinations of the
    // input string by replacing '?' with 'a' and 'b'. It then filters out invalid combinations and
    // returns a sorted collection of valid combinations.
    public Collection<String> palavrasValidas() {
        HashMap<String, ArrayList<Character>> wordCombinations = substitui(getCharSet());
        ArrayList<Character> charList;
        ArrayList<String> wordCombinationsStrings = new ArrayList<String>(wordCombinations.keySet());
        for (String i : wordCombinationsStrings) {
            charList = new ArrayList<Character>(wordCombinations.get(i));
            for (int j = 0; j < charList.size(); j++) {
                if (j == 0) {
                    if (charList.get(j) == 'a' && charList.get(j + 1) == 'a') {
                        wordCombinations.remove(i);
                        continue;
                    }
                } else if (j == charList.size() - 1) {
                    if (charList.get(j) == 'a' && charList.get(j - 1) == 'a') {
                        wordCombinations.remove(i);
                        continue;
                    }
                } else {
                    if ((charList.get(j) == 'a' && charList.get(j + 1) == 'a')
                            || (charList.get(j) == 'a' && charList.get(j - 1) == 'a')) {
                        wordCombinations.remove(i);
                        continue;
                    }
                }
            }
        }
        ArrayList<String> retorno = new ArrayList<String>(wordCombinations.keySet());
        Collections.sort(retorno, Comparator.naturalOrder());
        return retorno;
    }
}
