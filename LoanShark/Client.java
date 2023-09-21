/**
 * The Client class represents a client in an Agiota system, with attributes for name, credit, and
 * balance.
 */
package LoanShark;

public class Client {
    private int saldo;
    private String nome;
    private int credito;

    Client(String nome, int credito) {
        this.nome = nome;
        this.credito = credito;
    }

    // *getters */

    public int getCredito() {
        return credito;
    }

    public String getNome() {
        return nome;
    }

    public int getSaldo() {
        return saldo;
    }

    // *setters */

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    // *funções */

    public String toString() {
        return String.format("- %s:%d/%d", nome, saldo, credito);
    }
}
