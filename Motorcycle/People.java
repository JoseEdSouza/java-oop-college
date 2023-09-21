/**
 * The People class represents a person with a name and age.
 */
package Motorcycle;

public class People {
    private int idade;
    private String nome;

    People(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    // *getters */

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    // *funções */

    public String toString() {
        return nome + ":" + idade;
    }
}
