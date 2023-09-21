/**
 * The Circle class represents a circle in a 2D space and provides methods to calculate its area,
 * perimeter, and check if a point is inside the circle.
 */
package Format;

import java.lang.Math;

public class Circle extends Shape {
    private Point2D centro;
    private double raio;

    Circle(Point2D centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    // *funções */

   /**
    * The above function calculates the area of a circle using the formula A = πr^2.
    * 
    * @return The method is returning the area of a circle, which is calculated by multiplying the
    * value of pi (Math.PI) by the square of the radius (raio * raio).
    */
    public double area() {
        return Math.PI * raio * raio;
    }

    /**
     * The function calculates the perimeter of a circle using the formula 2 * π * radius.
     * 
     * @return The method is returning the perimeter of a circle, which is calculated by multiplying
     * the radius by 2 and then multiplying it by the value of pi (π).
     */
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    /**
     * The function checks if a given point is inside a circle.
     * 
     * @param p The parameter "p" is of type Ponto2D, which represents a 2D point.
     */
    public void inside(Point2D p) {
        if(centro.distancia(p)<=raio)
            System.out.println("true");
        else
            System.out.println("false");
    }

    public String toString() {
        return String.format("Círculo com centro em (%.1f,%.1f) e raio %.1f", centro.getX(), centro.getY(), raio);
    }

}

