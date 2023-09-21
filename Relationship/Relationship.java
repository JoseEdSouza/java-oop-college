/**
 * The Relationship class represents a mathematical relationship between elements in a domain,
 * providing methods to add pairs, check for transitivity, symmetry, and reflexivity, and generate a
 * string representation of the relationship.
 */
package Relationship;

import java.util.HashSet;
import java.util.Set;

public class Relationship {
    private Set<Integer> dominio = new HashSet<>();
    private Set<Pair> pares = new HashSet<>();

    Relationship(Set<Integer> dominio) {
        this.dominio = dominio;
    }

    /**
     * The isChecked function checks if both x and y are present in the domain and throws an
     * InvalidPairException if either x or y is missing.
     * 
     * @param x The parameter x represents a value that needs to be checked if it is in the domain.
     * @param y The parameter "y" is an integer value that represents a value to be checked if it is in
     * the domain.
     * @return The method is returning a boolean value.
     */
    private boolean isChecked(int x, int y) throws InvalidPairException {
        if (dominio.contains(x)) {
            if (dominio.contains(y)) {
                return true;
            } else {
                InvalidPairException erro = new InvalidPairException(String.format("%d is not in domain", y));// com x e
                                                                                                              // sem y
                throw erro;
            }
        } else {
            if (dominio.contains(y)) {
                InvalidPairException erro = new InvalidPairException(String.format("%d is not in domain", x));// sem x
                                                                                                              // com y
                throw erro;
            } else {
                InvalidPairException erro = new InvalidPairException(
                        String.format("%d and %d are not in domain", x, y));// sem x e sem y
                throw erro;
            }
        }
    }

    /**
     * The function adds a pair of integers to a list if they pass a certain condition.
     * 
     * @param x An integer representing the first value of the pair.
     * @param y The parameter "y" is an integer value representing the second value of the pair.
     */
    public void addPair(int x, int y) throws InvalidPairException {
        if (isChecked(x, y)) {
            Pair p = new Pair(x, y);
            pares.add(p);
        }
    }

    /**
     * The function checks if a pair of integers exists in a collection of pairs.
     * 
     * @param x An integer representing the first value of the pair.
     * @param y The parameter "y" is an integer value.
     * @return The method is returning a boolean value.
     */
    public boolean hasPair(int x, int y) {
        try {
            if (isChecked(x, y)) {
                Pair p = new Pair(x, y);
                return pares.contains(p);
            }
        } catch (InvalidPairException ipe) {
            return false;
        }
        return false;
    }

    /**
     * The function checks if a relation is transitive by iterating through all possible pairs of
     * elements and checking if the transitive property holds.
     * 
     * @return The method isTransitive() returns a boolean value.
     */
    public boolean isTransitive() {
        boolean isTransitive = true;
        int tam = dominio.size();
        Integer[] aux = new Integer[2000];
        aux = dominio.toArray(aux);
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                for (int w = 0; w < tam; w++) {
                    boolean first = hasPair(aux[i], aux[j]);
                    boolean second = hasPair(aux[j], aux[w]);
                    boolean third = hasPair(aux[i], aux[j]);
                    if ((first && second && !third)) {
                        isTransitive = false;
                    }
                }
            }
        }
        return isTransitive;
    }

    /**
     * The function checks if a collection of pairs is symmetric.
     * 
     * @return The method is returning a boolean value, which indicates whether the given pairs are
     * symmetric or not.
     */
    public boolean isSymmetric() {
        boolean isSymmetric = true;
        for (Pair p : pares) {
            if (hasPair(p.getY(), p.getX()))
                continue;
            else {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

    /**
     * The function checks if a relation is reflexive by iterating through the domain and checking if
     * each element has a pair with itself.
     * 
     * @return The method isReflexive() returns a boolean value.
     */
    public boolean isReflexive() {
        boolean isReflexive = true;
        for (Integer i : dominio) {
            if (hasPair(i, i))
                continue;
            else {
                isReflexive = false;
                break;
            }
        }
        return isReflexive;
    }

    /**
     * The function checks if a relation is transitive by iterating through all possible pairs of
     * elements and checking if the transitive property holds for each pair.
     */
    public void checkTransitive() {
        boolean isTransitive = true;
        int tam = dominio.size();
        Integer[] aux = new Integer[0];
        aux = dominio.toArray(aux);
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                for (int w = 0; w < tam; w++) {
                    boolean first = hasPair(aux[i], aux[j]);
                    boolean second = hasPair(aux[j], aux[w]);
                    boolean third = hasPair(aux[i], aux[w]);
                    System.out.println(String.format("hasPair(%d,%d) = %b, hasPair(%d,%d) = %b, hasPair(%d,%d) = %b",
                            aux[i], aux[j], first,
                            aux[j], aux[w], second, aux[i], aux[w], third));
                    if ((first && second && !third)) {
                        isTransitive = false;
                        break;
                    }
                }
                if (!isTransitive)
                    break;
            }
            if (!isTransitive)
                break;
        }
        if (isTransitive) {
            System.out.println("Relation is transitive");
        } else
            System.out.println("Relation is not transitive");
    }

    /**
     * The function checks if a relation is symmetric by iterating through all pairs of elements and
     * checking if the pair and its reverse both exist in the relation.
     */
    public void checkSymmetric() {
        boolean isSymmetric = true;
        int tam = dominio.size();
        Integer[] aux = new Integer[0];
        aux = dominio.toArray(aux);
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                boolean first = hasPair(aux[i], aux[j]);
                boolean second = hasPair(aux[j], aux[i]);
                System.out.println(String.format("hasPair(%d,%d) = %b, hasPair(%d,%d) = %b", aux[i], aux[j], first,
                        aux[j], aux[i], second));
                if((first ^ second)){
                    isSymmetric=false;
                    break;
                }
            }
            if (!isSymmetric)
                break;
        }
        if (isSymmetric) {
            System.out.println("Relation is symmetric");
        } else
            System.out.println("Relation is not symmetric");
    }

    /**
     * The function checks if a relation is reflexive by iterating through the domain and checking if
     * each element has a pair with itself.
     */
    public void checkReflexive() {
        boolean isReflexive = true;
        for (Integer i : dominio) {
            boolean aux = hasPair(i, i);
            System.out.println(String.format("hasPair(%d,%d) = %b", i, i, aux));
            if (aux)
                continue;
            else {
                isReflexive = false;
                break;
            }
        }
        if (isReflexive) {
            System.out.println("Relation is reflexive");
        } else
            System.out.println("Relation is not reflexive");
    }

    /**
     * The toString() function returns a string representation of an object, including the values of
     * its domain and pairs.
     * 
     * @return The method is returning a string representation of an object.
     */
    @Override
    public String toString() {
        int flag = 0;
        String retorno = "";
        retorno += "domain : [";
        for (Integer i : dominio) {
            if (flag == 0) {
                retorno += String.format("%d", i);
                flag++;
            } else
                retorno += ", " + i;
        }
        flag = 0;
        retorno += "], pairs : {";
        for (Pair i : pares) {
            if (flag == 0) {
                retorno += i;
                flag++;
            } else
                retorno += "," + i;
        }
        retorno += "}";
        return retorno;
    }
}
