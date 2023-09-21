package Balance;



import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa p = new Pessoa("", 0, Planeta.EARTH);

        while (true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);
            if (ui[0].equals("end")) {
                break;
            } else if (ui[0].equals("init")) {
                p = new Pessoa(ui[1],
                        Double.parseDouble(ui[2]),
                        Planeta.valueOf(ui[3]));
            } else if (ui[0].equals("massaEquivalente")) {
                System.out.printf(Locale.US, "%.2f\n", p.massaEquivalente(Planeta.valueOf(ui[1])));
            } else if (ui[0].equals("show")) {
                System.out.println(p);
            } else {
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}
