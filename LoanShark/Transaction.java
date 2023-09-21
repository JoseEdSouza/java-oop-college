/**
 * The Transaction class represents a transaction made by a client, with properties such as the
 * transaction ID, client ID, and transaction value.
 */
package LoanShark;

public class Transaction {
    private int value;
    private String clientId;
    private int id;

    Transaction(int id, String clientId, int value) {
        this.clientId = clientId;
        this.value = value;
        this.id = id;
    }

    // *getters */

    public String getClientId() {
        return clientId;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    // *setters */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return String.format("- id:%d %s:%d", id, clientId, value);
    }
}
