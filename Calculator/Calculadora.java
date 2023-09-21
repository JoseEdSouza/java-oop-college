/**
 * The Calculadora class represents a calculator with a display, battery, and various mathematical
 * operations.
 */
package Calculator;

import java.text.*;

public class Calculadora {
    private int battery;
    private int batteryMax;
    public float display;

    Calculadora(int MaxBattery) {
        batteryMax = MaxBattery;
        battery = batteryMax;
        display = 0;
    }

    /**
     * The function adds two integers and assigns the result to a variable if there is enough battery
     * power.
     * 
     * @param a An integer representing the first number to be added.
     * @param b The parameter "b" is an integer that represents the second number to be added.
     */
    public void plus(int a, int b) {
        if (useBattery())
            display = (float) (a + b);
    }

    
    /**
     * The function "div" divides two numbers and displays the result, unless the second number is zero
     * or the battery is low.
     * 
     * @param a The parameter "a" represents the dividend in the division operation.
     * @param b The parameter "b" represents the divisor in the division operation.
     */
    public void div(int a, int b) {
        if (b == 0)
            System.out.println("**ERROR-Não é possível dividir por 0.");
        else if (useBattery())
            display = (float) a / (float) b;
    }

    /**
    * The chargeBattery function increases the battery level by a given amount, up to the maximum
    * battery capacity.
    * 
    * @param carga The parameter "carga" represents the amount of charge to be added to the battery.
    */
    public void chargeBattery(int carga) {
        battery = (((battery + carga) >= batteryMax) ? batteryMax : (battery + carga));
    }

    /**
     * The function "useBattery" checks if there is enough battery and decrements it if there is,
     * returning true, otherwise it prints an error message and returns false.
     * 
     * @return The method is returning a boolean value. If the battery is greater than 0, it will
     * decrement the battery and return true. If the battery is 0 or less, it will print an error
     * message and return false.
     */
    public boolean useBattery() {
        if (battery > 0) {
            battery--;
            return true;
        } else {
            System.out.println("**ERROR-Bateria insuficiente.");
            return false;
        }
    }

    /**
     * The toString() function formats and returns a string representation of the display and battery
     * values.
     * 
     * @return The method is returning a string representation of the object's state. The returned
     * string includes the value of the "display" variable formatted to two decimal places, and the
     * value of the "battery" variable.
     */
    public String toString() {
        DecimalFormat form = new DecimalFormat("0.00");
        return "display = " + form.format(this.display).replace(",", ".") + " , battery = " + this.battery;
    }
}
