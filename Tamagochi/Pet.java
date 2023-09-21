/**
 * The Pet class represents a Tamagochi pet and contains methods for managing its energy, hunger,
 * cleanliness, age, and diamonds.
 */
package Tamagochi;

public class Pet {
    private int MaxEnergia, MaxFome, MaxBanho;
    private int energia, fome, banho;
    private int diamantes;
    private int age;
    private boolean alive;
    int TurnoSono = 0;
    int TurnoMax = 0;

    Pet(int energia, int fome, int banho) {
        this.alive = true;
        this.age = 0;
        this.diamantes = 0;
        this.energia = energia;
        this.banho = banho;
        this.fome = fome;
        this.MaxEnergia = energia;
        this.MaxBanho = banho;
        this.MaxFome = fome;

    }

    
    /**
     * The function sets the energy level of a Tamagochi object, and if the value is zero or less, it
     * sets the object as not alive.
     * 
     * @param valor The parameter "valor" represents the value of energy that is being set for the
     * object.
     */
    public void setEnergia(int valor) {
        if (valor <= 0) {
            this.energia = 0;
            System.out.println("**ERROR-Tamagochi morreu de apendicite");
            this.alive = false;
        } else if (valor > this.MaxEnergia)
            this.energia = this.MaxEnergia;
        else
            this.energia = valor;
    }

    /**
     * The function sets the "fome" (hunger) value of a Tamagochi object, and if the value is less than
     * or equal to 0, it sets the "alive" flag to false and prints an error message.
     * 
     * @param valor The parameter "valor" represents the value that is being passed to the method. In
     * this case, it is an integer value that represents the level of hunger for a Tamagochi.
     */
    public void setFome(int valor) {
        if (valor <= 0) {
            this.fome = 0;
            System.out.println("**ERROR-Tamagochi morreu de fome");
            this.alive = false;
        } else if (valor > this.MaxFome)
            this.fome = this.MaxFome;
        else
            this.fome = valor;
    }

    /**
     * The function sets the "banho" attribute to a given value, but if the value is less than or equal
     * to 0, it sets "banho" to 0, prints an error message, and sets "alive" to false.
     * 
     * @param valor The parameter "valor" represents the value of the "banho" attribute that is being
     * set.
     */
    public void setBanho(int valor) {
        if (valor <= 0) {
            this.banho = 0;
            System.out.println(("**ERROR-Tamagochi morreu por infecção"));
            this.alive = false;
        } else if (valor > MaxBanho)
            this.banho = MaxBanho;
        else
            this.banho = valor;
    }

    // *getters

    public int getEnergia() {
        return energia;
    }

    public int getFome() {
        return fome;
    }

    public int getBanho() {
        return banho;
    }

    public int getMaxEnergia() {
        return MaxEnergia;
    }

    public int getMaxFome() {
        return MaxFome;
    }

    public int getMaxBanho() {
        return MaxBanho;
    }


    /**
     * The toString() function returns a formatted string representation of the object's energy,
     * hunger, cleanliness, diamonds, and age.
     * 
     * @return The method is returning a formatted string that includes the values of the energy,
     * maximum energy, hunger, maximum hunger, cleanliness, maximum cleanliness, number of diamonds,
     * and age.
     */
    public String toString() {
        return String.format("E: %d/%d, S:%d/%d, L:%d/%d, D:%d, I:%d", getEnergia(), getMaxEnergia(), getFome(),
                getMaxFome(), getBanho(), getMaxBanho(), diamantes, age);
    }

    
    /**
     * The function checks if a Tamagochi is alive and returns true if it is, otherwise it prints an
     * error message and returns false.
     * 
     * @return The method is returning a boolean value. If the "alive" variable is true, it will return
     * true. If the "alive" variable is false, it will print an error message and return false.
     */
    public boolean isAlive() {
        if (this.alive)
            return true;
        else {
            System.out.println("**ERROR-Tamagochi morreu :(");
            return false;
        }
    }

    
    /**
     * The "brincar" function decreases the energy, hunger, and cleanliness levels of a character,
     * increases the number of diamonds and the age, and updates the maximum number of turns if the
     * character is alive.
     */
    public void brincar() {
        if (isAlive()) {
            setEnergia(getEnergia() - 2);
            setFome(getFome() - 1);
            setBanho(getBanho() - 3);
            diamantes++;
            age++;
            TurnoMax++;
        }
    }

    
    /**
     * The function "limpar" decreases energy and hunger, restores bathing to maximum, does not change
     * the diamond count, increases age by 2, and increments the maximum turn count.
     */
    public void limpar() {
        if (isAlive()) {
            setEnergia(getEnergia() - 3);
            setFome(getFome() - 1);
            setBanho(getMaxBanho());
            diamantes += 0;
            age += 2;
            TurnoMax++;
        }
    }

    
    /**
     * The "dormir" function checks if the Tamagochi is alive and has enough energy to sleep, and if
     * so, it restores its energy, decreases hunger, increases age, and updates the number of turns
     * slept.
     */
    public void dormir() {
        if (isAlive()) {
            if ((getMaxEnergia() - getEnergia()) < 5)
                System.out.println("**ERROR-Tamagochi sem sono.");
            else {
                setEnergia(getMaxEnergia());
                setFome(getFome() - 1);
                TurnoMax++;
                diamantes += 0;
                age += 1 + (TurnoMax - TurnoSono);
                TurnoSono++;
            }
        }
    }

    // The `comer()` method is a function in the `Pet` class that represents the action of the pet eating.
    public void comer() {
        if (isAlive()) {
            setEnergia(getEnergia() - 1);
            setFome(getFome() + 4);
            setBanho(getBanho() - 2);
            diamantes += 0;
            age++;
            TurnoMax++;
        }
    }
}
