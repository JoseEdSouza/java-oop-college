/**
 * The Treinador class represents a trainer in the ComabatePomekon game, with a Pomekon and a level.
 */
package ComabatePomekon;


public class Treinador {
    private Pomekon pomekon;
    private int level;

    Treinador(Pomekon pomekon, int level){
        this.pomekon=pomekon;
        this.level=level;
    }

    //*getters */

    public int getLevel() {
        return level;
    }

    public Pomekon getPomekon() {
        return pomekon;
    }

    //*setters */

    public void setPomekon(Pomekon pomekon) {
        this.pomekon = pomekon;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
