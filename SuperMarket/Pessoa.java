/**
 * The class "Pessoa" represents a person with a name attribute and getter and setter methods for the
 * name.
 */
package SuperMarket;

public class Pessoa {
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return nome;
    }

}
