package BankAccount;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ArrayList<Account> contas = new ArrayList<Account>();
        while (true) {
            String comando = sc.nextLine();
            String cmd[] = comando.split(" ");
            System.out.println("$" + comando);
            if (cmd[0].equals("fim"))
                break;
            else if (cmd[0].equals("iniciar"))
                contas.add(new Account(cmd[1]));
            else if (cmd[0].equals("depositar")) {
                int NumConta = Integer.parseInt(cmd[1]);
                double valor = Double.parseDouble(cmd[2]);
                Account.depositar(contas.get(NumConta), valor);
            } else if (cmd[0].equals("sacar")) {
                int NumConta = Integer.parseInt(cmd[1]);
                double valor = Double.parseDouble(cmd[2]);
                Account.sacar(contas.get(NumConta), valor);
            } else if (cmd[0].equals("transferir")) {
                int NumContaOrigem = Integer.parseInt(cmd[1]);
                int NumContaDestino = Integer.parseInt(cmd[2]);
                double valor = Double.parseDouble(cmd[3]);
                Account.transferir(contas.get(NumContaOrigem), contas.get(NumContaDestino), valor);
            } else if (cmd[0].equals("mostra")) {
                int NumConta = Integer.parseInt(cmd[1]);
                System.out.println(contas.get(NumConta));
            } else
                System.out.println("**ERROR-Comando inválido.");
        }
        sc.close();
    }
}
