/**
 * The Point2D class represents a point in a two-dimensional space and provides a method to calculate
 * the distance between two points.
 */
package Format;

public class Point2D {
    private double x;
    private double y;

    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // *funções */

    /**
     * The function calculates the distance between two 2D points using the Euclidean distance formula.
     * 
     * @param p p is an object of type Ponto2D, which represents a point in a two-dimensional space.
     * The method calculates the distance between the current point (represented by the coordinates
     * this.x and this.y) and the point represented by the coordinates p.getX() and p.getY(). The
     * distance is calculated using
     * @return The method is returning the distance between the current point (this) and the point
     * passed as a parameter (p).
     */
    public double distancia(Point2D p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    // *getters */

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
