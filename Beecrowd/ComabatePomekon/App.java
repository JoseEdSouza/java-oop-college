/**
 * The App class in the ComabatePomekon package is used to simulate battles between trainers and their
 * Pomekons.
 */
//https://www.beecrowd.com.br/judge/pt/problems/view/2221

package ComabatePomekon;

import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Combate> duelos = new ArrayList<Combate>();
        String comando = "";
        String[] cmd;
        Scanner sc = new Scanner(System.in);
        int qntdDuelos = toInt(sc.nextLine());
        for (int i = 0; i < qntdDuelos; i++) {
            int bonus = toInt(sc.nextLine());
            comando = sc.nextLine();
            cmd = comando.split(" ");
            Pomekon p1 = new Pomekon(toInt(cmd[0]), toInt(cmd[1]));
            Treinador t1 = new Treinador(p1, toInt(cmd[2]));
            comando = sc.nextLine();
            cmd = comando.split(" ");
            Pomekon p2 = new Pomekon(toInt(cmd[0]), toInt(cmd[1]));
            Treinador t2 = new Treinador(p2, toInt(cmd[2]));
            duelos.add(new Combate(t1, t2, bonus));
        }
        for (Combate i : duelos) {
            i.duelo();
        }
        sc.close();
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }
}
