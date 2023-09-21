/**
 * The "Combate" class represents a battle between two trainers and calculates the winner based on the
 * strength of their Pokémon attacks.
 */
package ComabatePomekon;

public class Combate {
    private Treinador treinador1;
    private Treinador treinador2;
    private int bonus;
    
    Combate(){
        this.treinador1=null;
        this.treinador2=null;
        this.bonus=0;
    }
    
    Combate(Treinador treinador1, Treinador treinador2, int bonus) {
        this.treinador1 = treinador1;
        this.treinador2 = treinador2;
        this.bonus = bonus;
    }

    

    // *getters */

    public Treinador getTreinador1() {
        return treinador1;
    }

    public Treinador getTreinador2() {
        return treinador2;
    }

    public int getBonus() {
        return bonus;
    }

    // *setters */

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setTreinador1(Treinador treinador1) {
        this.treinador1 = treinador1;
    }

    public void setTreinador2(Treinador treinador2) {
        this.treinador2 = treinador2;
    }

    // *funções */

    // analisa os ataques e printa o ganhador.
    /**
     * The "duelo" function calculates the strength of two trainers' Pokémon attacks and determines the
     * winner based on the higher attack power.
     */
    public void duelo() {
        double golpe1 = treinador1.getPomekon().golpe() + (((treinador1.getLevel() % 2) == 0) ? bonus : 0);
        double golpe2 = treinador2.getPomekon().golpe() + (((treinador2.getLevel() % 2) == 0) ? bonus : 0);
        if (golpe1 > golpe2)
            System.out.println("Dabriel");
        else if (golpe2 > golpe1)
            System.out.println("Guarte");
        else
            System.out.println("Empate");
    }

}
