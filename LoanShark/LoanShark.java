package LoanShark;

import java.util.HashMap;
import java.util.Map;

public class LoanShark {

    private int saldo;
    static private int nextTride = 0;
    private Map<String, Client> repCli = new HashMap<String, Client>();
    private Map<Integer, Transaction> repTr = new HashMap<Integer, Transaction>();

    LoanShark(int saldo) {
        this.saldo = saldo;
    }

    // *funções */

    /**
     * The function "pushTransaction" adds a new transaction to a repository with a
     * given code name and
     * value.
     * 
     * @param codenome The codenome parameter is a string that represents the code
     *                 name associated with
     *                 the transaction.
     * @param valor    The "valor" parameter represents the value or amount of the
     *                 transaction.
     */
    public void pushTransaction(String codenome, int valor) {
        repTr.put(nextTride, new Transaction(nextTride, codenome, valor));
        nextTride++;
    }

    /**
     * The function returns a Client object based on the given name.
     * 
     * @param name The parameter "name" is a String that represents the name of the
     *             client.
     * @return The method is returning a Client object.
     */
    public Client getClient(String name) {
        return repCli.get(name);
    }

    /**
     * The function "addCli" adds a new client to a repository if the client does
     * not already exist.
     * 
     * @param name    The name of the client to be added.
     * @param credito The "credito" parameter represents the credit amount for the
     *                client.
     */
    public void addCli(String name, int credito) {
        if (!repCli.containsKey(name))
            repCli.put(name, new Client(name, credito));
        else
            System.out.println("fail: cliente ja existe");
    }

    /**
     * The function "kill" removes a client and all associated transactions from a
     * repository.
     * 
     * @param name The parameter "name" is a String that represents the name of a
     *             client.
     */
    public void kill(String name) {
        if (!repCli.containsKey(name))
            System.out.println("fail: cliente nao existe");
        else {
            repCli.remove(name);
            int size = repTr.size();
            for (int i = 0; i < size; i++) {
                if (repTr.get(i).getClientId().equals(name))
                    repTr.remove(i);
            }
        }
    }

    /**
     * The function "receive" checks if a client exists, and if so, deducts a
     * specified value from their
     * balance and adds it to the overall balance, while also updating the
     * transaction history.
     * 
     * @param nome  The parameter "nome" represents the name of the client.
     * @param valor The parameter "valor" represents the amount of money to be
     *              received from a client.
     */
    public void receive(String nome, int valor) {
        if (!repCli.containsKey(nome))
            System.out.println("fail: cliente nao existe");
        else if (valor <= getClient(nome).getSaldo()) {
            saldo += valor;
            getClient(nome).setSaldo(getClient(nome).getSaldo() - valor);
            pushTransaction(nome, -valor);
        } else
            System.out.println("fail: valor maior que a divida");
    }

    /**
     * The function "lend" checks if a client exists, if there are sufficient funds,
     * and if the credit
     * limit is not exceeded before lending a certain amount of money to the client.
     * 
     * @param nome  The parameter "nome" represents the name of the client to whom
     *              the lending operation
     *              is being performed.
     * @param valor The parameter "valor" represents the amount of money that is
     *              being lent to a
     *              client.
     */
    public void lend(String nome, int valor) {
        if (!repCli.containsKey(nome))
            System.out.println("fail: cliente nao existe");
        else if (saldo < valor)
            System.out.println("fail: fundos insuficientes");
        else if ((valor + getClient(nome).getSaldo()) <= getClient(nome).getCredito()) {
            saldo -= valor;
            getClient(nome).setSaldo(getClient(nome).getSaldo() + valor);
            pushTransaction(nome, valor);
        } else
            System.out.println("fail: limite excedido");
    }

    /**
     * The toString() function returns a string representation of the clients,
     * transactions, and
     * balance.
     * 
     * @return The method is returning a string representation of the clients,
     *         transactions, and
     *         balance.
     */
    public String toString() {
        String retorno = "clients:\n";
        for (Client i : repCli.values()) {
            retorno += i.toString() + "\n";
        }
        retorno += "transactions:\n";
        for (Transaction i : repTr.values()) {
            retorno += i.toString() + "\n";
        }
        retorno += String.format("balance: %d", saldo);
        return retorno;
    }

}
