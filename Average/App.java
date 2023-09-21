package Average;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MediaNotas m = new MediaNotas();
        while (true) {
            String comando = sc.nextLine();
            String cmd[] = comando.split(" ");
            System.out.println("$" + comando);
            if (cmd[0].equals("end"))
                break;
            else if (cmd[0].equals("mudar")) {
                int index = Integer.parseInt(cmd[1]);
                double nota = Double.parseDouble(cmd[2]);
                m.mudaNota(index, nota);
            } else if (cmd[0].equals("addNota")) {
                m.addNota(Double.parseDouble(cmd[1]));
            } else if (cmd[0].equals("removeNota")) {
                m.removeNota(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("maiorNota")) {
                System.out.println(m.maiorNota());
            } else if (cmd[0].equals("menorNota")) {
                System.out.println(m.menorNota());
            } else if (cmd[0].equals("media")) {
                System.out.printf(Locale.US, "%.2f\n", m.media());
            } else if (cmd[0].equals("parametriza")) {
                m.parametriza();
            } else if (cmd[0].equals("show")) {
                System.out.println(m);
            } else {
                System.out.println("fail: comando invalido");
            }
        }
        sc.close();
    }
}
