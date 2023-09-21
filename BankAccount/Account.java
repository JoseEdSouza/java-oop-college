/**
 * The Account class represents a bank account and provides methods for depositing, withdrawing, and
 * transferring money between accounts.
 */
package BankAccount;

public class Account {
    private String titular;
    private double saldo;
    private int NumConta;
    private static int TotalContas = 0;

    Account(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.NumConta = TotalContas;
        TotalContas++;
    }

    // *getters

    public double getSaldo() {
        return saldo;
    }

    // *funções

    
    /**
     * The function "depositar" in Java increases the value of the "saldo" variable by the specified
     * "valor" amount.
     * 
     * @param valor The parameter "valor" is of type double and represents the amount of money to be
     * deposited into an account.
     */
    public void depositar(double valor) {
        this.saldo += valor;
    }

    /**
     * The function "depositar" takes a "Conta" object and a double value as parameters and deposits
     * the specified amount into the account.
     * 
     * @param origemConta The parameter "origemConta" is of type "Conta", which represents a bank
     * account. It is the account from which the deposit is being made.
     * @param valor The parameter "valor" is of type double and represents the amount of money to be
     * deposited into the account.
     */
    public static void depositar(Account origemConta, double valor) {
        origemConta.depositar(valor);
    }

    
    /**
     * The function "sacar" in Java checks if the account balance is sufficient to withdraw a given
     * amount and updates the balance accordingly, returning true if successful and false if the
     * account balance becomes zero.
     * 
     * @param valor The parameter "valor" represents the amount of money that is being withdrawn from
     * the account.
     * @return The method is returning a boolean value.
     */
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.printf("**ERROR-conta zerada após saque de %.2f\n", saldo);
            this.saldo = 0;
            return false;
        }
    }

    /**
     * The function "sacar" takes a "Conta" object and a double value as parameters and calls the
     * "sacar" method of the "origemConta" object, returning the result.
     * 
     * @param origemConta The parameter "origemConta" is of type "Conta", which represents a bank
     * account.
     * @param valor The parameter "valor" represents the amount of money that needs to be withdrawn
     * from the account.
     * @return The method is returning a boolean value.
     */
    public static boolean sacar(Account origemConta, double valor) {
        return origemConta.sacar(valor);
    }

    
    /**
     * The transferir function transfers a specified amount of money from one account to another.
     * 
     * @param destinConta The parameter "destinConta" is of type "Conta", which represents a bank
     * account. It is the account to which the transfer is being made.
     * @param valor The parameter "valor" represents the amount of money that is being transferred from
     * one account to another.
     * @return The method is returning a boolean value.
     */
    public boolean transferir(Account destinConta, double valor) {
        double saldoAux = this.saldo;
        if (sacar(this, valor)) {
            depositar(destinConta, valor);
            return true;
        } else {
            depositar(destinConta, saldoAux);
            return false;
        }
    }


    /**
    * The function transfers a specified amount of money from one account to another.
    * 
    * @param origemConta The origemConta parameter is of type Conta, which represents the account from
    * which the transfer is being made.
    * @param destinConta The parameter "destinConta" is of type "Conta", which represents a bank
    * account.
    * @param valor The parameter "valor" represents the amount of money that is being transferred from
    * the "origemConta" (source account) to the "destinConta" (destination account).
    * @return The method is returning a boolean value.
    */
    public static boolean transferir(Account origemConta, Account destinConta, double valor) {
        return origemConta.transferir(destinConta, valor);
    }

    public String toString() {
        return String.format("Nro da conta: %d, Titular: %s, Saldo: %.2f", NumConta, titular, saldo);
    }

}
