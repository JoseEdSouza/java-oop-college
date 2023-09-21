/**
 * The Motorcycle class represents a motorcycle with attributes such as power, time available for
 * riding, and a person who can ride it.
 */
package Motorcycle;

public class Motorcycle {
    private People person; // piloto
    private int potencia; // potência da moto
    private int time; // tempo disponível para andar na moto

    Motorcycle(int potencia) {
        this.potencia = potencia;
        this.time = 0;
        this.person = null;
    }

    // *getters */

    public People getPerson() {
        return person;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getTime() {
        return time;
    }

    // *funções */

    /**
     * The buyTime function adds a specified amount of time to the current time.
     * 
     * @param addTime The addTime parameter is an integer that represents the amount of time to be
     * added to the current time.
     */
    public void buyTime(int addTime) {
        this.time += addTime;
    }


    /**
     * The drive function checks if the motorcycle is empty, if the person's age is less than or equal
     * to 10, and if there is enough time remaining to drive, and prints error messages accordingly.
     * 
     * @param driveTime The parameter "driveTime" represents the amount of time (in minutes) that the
     * person wants to drive the vehicle.
     */
    public void drive(int driveTime) {
        if (this.person == null)
            System.out.println("**ERROR - MOTOCA VAZIA.");
        else {
            if (this.person.getIdade() <= 10) {
                if (getTime() == 0)
                    System.out.println("**ERROR - COMPRE TEMPO ANTES.");
                else if (getTime() - driveTime >= 0)
                    this.time -= driveTime;
                else {
                    System.out.println("**ERROR - TEMPO ACABOU DEPOIS DE " + getTime() + ".");
                    this.time = 0;
                }
            } else {
                System.out.println("**ERROR - IDADE NÃO PERMITIDA.");
            }
        }
    }


    /**
     * The enter function checks if a space is available and assigns a person to it, returning true if
     * successful and false if the space is already occupied.
     * 
     * @param person The "person" parameter is of type "People", which is a class representing a
     * person.
     * @return The method is returning a boolean value. If the condition `this.person == null` is true,
     * it means that the space is available and the `person` parameter can be assigned to
     * `this.person`. In this case, the method returns `true`. If the condition is false, it means that
     * the space is already occupied and the method returns `false`.
     */
    public boolean enter(People person) {
        if (this.person == null) {
            this.person = person;
            return true;
        } else {
            System.out.println("**ERROR - JÁ OCUPADO.");
            return false;
        }
    }

    /**
     * The function "leave" checks if a person is present in a vehicle, and if so, removes the person
     * from the vehicle and returns them.
     * 
     * @return The method is returning an object of type "People".
     */
    public People leave() {
        if (this.person == null) {
            System.out.println("**ERROR - MOTOCA VAZIA.");
            return null;
        } else {
            People PersonAux = this.person;
            this.person = null;
            return PersonAux;
        }

    }

    /**
     * The function "honk" generates a string of "P" followed by a number of "e" characters based on
     * the value of the variable "potencia", and then adds an "m" character at the end before printing
     * the resulting string.
     */
    public void honk() {
        String barulho = "P";
        for (int i = 0; i < this.potencia; i++) {
            barulho += "e";
        }
        barulho += "m";
        System.out.println(barulho);
    }

    public String toString() {
        return "power:" + getPotencia() + ", time:" + getTime() + ", person:("
                + ((this.person == null) ? "empty" : this.person.toString()) + ")";
    }
}
