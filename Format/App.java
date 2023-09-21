/**
 * The App class is a Java program that allows the user to create and manipulate shapes such as circles
 * and rectangles.
 */
/**
 * The App class is a Java program that allows the user to create and manipulate shapes such as circles
 * and rectangles.
 */
package Format;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        ArrayList<Shape> lista = new ArrayList<Shape>();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        while (true) {
            String line = sc.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            if (line.equals("end")) {
                break;
            } else if (ui[0].equals("circulo")) {
                double x = toDouble(ui[1]);
                double y = toDouble(ui[2]);
                double r = toDouble(ui[3]);
                Point2D pc = new Point2D(x, y);
                lista.add(new Circle(pc, r));

            } else if (ui[0].equals("retangulo")) {
                double x1 = toDouble(ui[1]);
                double y1 = toDouble(ui[2]);
                double x2 = toDouble(ui[3]);
                double y2 = toDouble(ui[4]);
                Point2D p1 = new Point2D(x1, y1);
                Point2D p2 = new Point2D(x2, y2);
                lista.add(new Rect(p1, p2));

            } else if (ui[0].equals("area")) {
                double areaTotal = 0;
                for (Shape i : lista) {
                    areaTotal += i.area();
                }
                System.out.println(String.format("area total: %.2f", areaTotal));
            } else if (ui[0].equals("perimetro")) {
                double perimetroTotal = 0;
                for (Shape i : lista) {
                    perimetroTotal += i.perimetro();
                }
                System.out.println(String.format("perimetro total: %.2f", perimetroTotal));
            } else if (ui[0].equals("inside")) {
                Point2D p = new Point2D(toDouble(ui[1]),toDouble(ui[2]));
                for(Shape i : lista){
                    i.inside(p);
                }
                
            } else if (ui[0].equals("mostra")) {
                System.out.println("Figura:");
                for (Shape i : lista) {
                    System.out.println(i);
                }
            } else {
                System.out.println("fail: comando invalido");
            }
        }
        sc.close();

    }

    static double toDouble(String str) {
        return Double.parseDouble(str);
    }

}
