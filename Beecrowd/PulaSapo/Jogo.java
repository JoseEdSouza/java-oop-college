/**
 * The "Jogo" class represents a game that consists of a frog character jumping over obstacles.
 */
package PulaSapo;

import java.util.ArrayList;

public class Jogo {
    private int numObstaculos;
    private Sapo sapo;
    private ArrayList<Obstaculo> obstaculos = new ArrayList<Obstaculo>();

    Jogo(int sapoJumpHeight, int numObstaculos){
        this.sapo = new Sapo(sapoJumpHeight);
        this.numObstaculos = numObstaculos;
    }

    //*getters */

    public int getNumObstaculos() {
        return numObstaculos;
    }

    public Sapo getSapo() {
        return sapo;
    }

    //*funções */

    /**
     * The function adds an obstacle of a given size to a list of obstacles.
     * 
     * @param obstacleSize The parameter "obstacleSize" represents the size of the obstacle that is
     * being added.
     */
    public void addObstaculo(int obstacleSize){
        obstaculos.add(new Obstaculo(obstacleSize));
    }

    /**
     * The function checks if the game is over by iterating through a list of obstacles and determining
     * if the player's character can jump over each obstacle.
     * 
     * @return The method is returning a boolean value. If the player wins the game, it returns true.
     * If the player loses the game, it returns false.
     */
    public boolean GameOver(){
        this.sapo.setHeight(obstaculos.get(0).getSize());
        for(int i=1;i<obstaculos.size();i++){
            if(sapo.jump(obstaculos.get(i)))
                continue;
            else{
                System.out.println("GAME OVER");
                return false;
            }
        }
        System.out.println("YOU WIN");
        return true;
    }
}
