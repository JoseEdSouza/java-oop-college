/**
 * The Rect class represents a rectangle and provides methods to calculate its area, perimeter, and
 * check if a point is inside the rectangle.
 */
package Format;

public class Rect extends Shape {
    private Point2D infEsq;
    private Point2D supDir;

    Rect(Point2D infEsq, Point2D supDir) {
        this.infEsq = infEsq;
        this.supDir = supDir;
    }

    // *funções */

    /**
     * The function calculates and returns the area of a rectangle given the coordinates of its
     * top-right and bottom-left corners.
     * 
     * @return The area of a rectangle.
     */
    public double area() {
        double altura = supDir.getY() - infEsq.getY();
        double largura = supDir.getX() - infEsq.getX();
        return altura * largura;
    }

    /**
     * The function calculates and returns the perimeter of a rectangle.
     * 
     * @return The method is returning the perimeter of a rectangle.
     */
    public double perimetro() {
        double altura = supDir.getY() - infEsq.getY();
        double largura = supDir.getX() - infEsq.getX();
        return 2 * (altura + largura);
    }

    /**
     * The function checks if a given point is inside a rectangle defined by two points.
     * 
     * @param p The parameter "p" is a Point2D object, which represents a point in a two-dimensional
     * coordinate system.
     */
    public void inside(Point2D p) {
        if ((infEsq.getX() <= p.getX()) && (p.getX() <= supDir.getX()) && (infEsq.getY() <= p.getY())
                && (p.getY() <= supDir.getY()))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public String toString() {
        return String.format("Retângulo com cantos (%.1f,%.1f) e (%.1f,%.1f)", infEsq.getX(), infEsq.getY(), supDir.getX(),
                supDir.getY());
    }
}

