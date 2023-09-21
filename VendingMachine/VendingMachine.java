/**
 * The VendingMachine class represents a vending machine with slots to store items, and it allows users
 * to insert cash, buy items, and manage the machine's inventory and profit.
 */
package VendingMachine;

import java.util.Locale;

public class VendingMachine {
    private Slot[] slots;
    private float profit = 0;
    private float cash = 0;
    private int capacity;

    VendingMachine(int capacity) {
        this.capacity = capacity;
        slots = new Slot[capacity];
        for (int i = 0; i < capacity; i++) {
            slots[i] = new Slot();
        }
    }

    // *getters */

    public Slot geSlot(int index) {
        return slots[index];
    }

    public float getCash() {
        return cash;
    }

    public float getProfit() {
        return profit;
    }

    // *setters */

    public void setSlot(int index, Slot s) {
        if (0 <= index && index < capacity) {
            slots[index] = s;
        } else
            System.out.println("fail: indice nao existe");
    }

    // *funções */

    /**
     * The clearSlot function clears the slot at the specified index in an array, or prints an error
     * message if the index is out of bounds.
     * 
     * @param index The parameter "index" represents the position of the slot that needs to be cleared.
     * It is an integer value that indicates the index of the slot in the "slots" array.
     */
    public void clearSlot(int index) {
        if (0 <= index && index < capacity) {
            slots[index] = new Slot();
        } else
            System.out.println("fail: indice nao existe");
    }

    public void insertCash(float cash) {
        this.cash += cash;
    }

    /**
     * The function withdrawCash() returns the current value of the cash variable and sets it to 0.
     * 
     * @return The method is returning the value of the variable "aux", which is the amount of cash
     * that was withdrawn.
     */
    public float withdrawCash() {
        float aux = cash;
        cash = 0;
        return aux;
    }

    /**
     * The function "buyItem" allows a user to purchase an item from a vending machine, updating the
     * cash, profit, and quantity of the item accordingly.
     * 
     * @param index The index parameter represents the index of the item in the slots array that the
     * user wants to buy.
     */
    public void buyItem(int index) {
        if (0 <= index && index < capacity) {
            Slot s = slots[index];
            if (s.getQuantity() == 0)
                System.out.println("fail: espiral sem produtos");
            else if ((cash - s.getPrice()) < 0)
                System.out.println("fail: saldo insuficiente");
            else {
                cash -= s.getPrice();
                profit += s.getPrice();
                s.setQuantity(s.getQuantity() - 1);
                System.out.printf("voce comprou um %s\n", s.getName());
            }
        } else
            System.out.println("fail: indice nao existe");
    }

    @Override
    public String toString() {
        String retorno = String.format(Locale.US, "saldo: %.2f\n", cash);
        for (int i = 0; i < capacity; i++) {
            retorno += String.format(Locale.US, "%d %s\n", i, slots[i]);
        }
        return retorno;
    }
}
