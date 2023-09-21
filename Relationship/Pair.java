package Relationship;

import java.util.Objects;

public class Pair {
    private int x;
    private int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // * getters */

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // * funções */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair other = (Pair) obj;
        return ((other.getX() == this.x) && (other.getY() == this.y));
    }

    
    /**
     * The hashCode() function in Java returns the hash code value for the object based on the values
     * of its x and y properties.
     * 
     * @return The method is returning the hash code of the object, which is calculated based on the
     * values of the "x" and "y" properties of the object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.x,this.y);
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

}