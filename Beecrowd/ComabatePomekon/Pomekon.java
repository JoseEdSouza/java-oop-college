/**
 * The Pomekon class represents a Pomekon with attack and defense attributes, and includes a method to
 * calculate the strength of its attack.
 */
package ComabatePomekon;

public class Pomekon {
    private int ataque;
    private int defesa;

    Pomekon(int ataque,int defesa){
        this.ataque=ataque;
        this.defesa=defesa;
    }

    //*getters */

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    //*funções */

    public int golpe(){
        return (ataque+defesa)/2;
    }
}
