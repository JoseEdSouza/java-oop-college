/**
 * The Sapo class represents a frog that can jump over obstacles based on its jump height and the
 * height of the obstacle.
 */
package PulaSapo;

public class Sapo {
    private int jumpHeight;
    private int height = 1;

    Sapo(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    // *getters */

    public int getHeight() {
        return height;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    // *setters */

    public void setHeight(int height) {
        this.height = height;
    }

    // *funções */

    /**
     * The function checks if an object can jump over an obstacle based on its height and jump height.
     * 
     * @param obstacle The parameter "obstacle" is of type "Obstaculo", which is a class representing
     * an obstacle.
     * @return The method is returning a boolean value.
     */
    public boolean jump(Obstaculo obstacle) {
        if ((this.height + this.jumpHeight) >= obstacle.getSize()
                && (Math.abs(this.height - obstacle.getSize())) <= this.jumpHeight) {
            this.height = obstacle.getSize();
            return true;
        } else
            return false;
    }
}
