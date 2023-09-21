/**
 * The Item class represents an item in a piggy bank, with a name and volume.
 */
package PigBank;

public class Item {
    private String nome;
    private int volume;

    Item(String nome, int volume){
        this.nome=nome;
        this.volume=volume;
    }

    //*getters */
    
    public String getNome() {
        return nome;
    }

    public int getVolume() {
        return volume;
    }

    //*setters */

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //*funções */

    public String toString(){
        return nome;
    }
}
