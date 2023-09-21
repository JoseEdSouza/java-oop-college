/**
 * The Slot class represents a slot in a vending machine, with properties such as name, price, and
 * quantity.
 */
package VendingMachine;

import java.util.Locale;

public class Slot {
    private String name = "empty";
    private float price = 0;
    private int quantity = 0;

    Slot() {

    }

    Slot(String name, int quantity, float price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // *getters */

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // *setters */

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // *funções */

    @Override
    public String toString() {
        return String.format(Locale.US, "[%8s : %d U : %.2f RS]", name, quantity, price);
    }
}
