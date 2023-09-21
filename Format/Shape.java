/**
 * The Shape class is an abstract class that defines methods for calculating the area and perimeter of
 * a shape, as well as checking if a point is inside the shape.
 */
package Format;

public abstract class Shape {
    public abstract double area();

    public abstract double perimetro();

    public abstract void inside(Point2D P);
}
