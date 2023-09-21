/**
 * The Watch class represents a timekeeping device with hour, minute, and second attributes, and
 * provides methods to set and get the time, as well as increment the time by one second.
 */
package Watch;

public class Watch {
    private int hora;
    private int minuto;
    private int segundo;

    Watch(int segundo, int minuto, int hora) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // * setters

    /**
     * The function sets the value of the "hora" variable, but prints an error message if the value is
     * not within the valid range.
     * 
     * @param hora The parameter "hora" is an integer representing the hour value.
     */
    public void setHora(int hora) {
        if (hora > 24 || hora < 0)
            System.out.println("**ERROR-Hora em formato inválido.");
        else
            this.hora = hora;
    }

    /**
     * The function sets the value of the "minuto" variable, but prints an error message if the value
     * is not within the valid range.
     * 
     * @param minuto The "minuto" parameter is an integer value representing the minute of a time.
     */
    public void setMinuto(int minuto) {
        if (minuto > 60 || minuto < 0)
            System.out.println("**ERROR-Minuto em formato inválido.");
        else
            this.minuto = minuto;
    }

    /**
     * The function sets the value of the "segundo" variable, but prints an error message if the value
     * is not within the valid range.
     * 
     * @param segundo The "segundo" parameter is an integer representing the second value.
     */
    public void setSegundo(int segundo) {
        if (segundo > 60 || segundo < 0)
            System.out.println("**ERROR-Segundo em formato inválido.");
        else
            this.segundo = segundo;
    }

    // * getters

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // * funções

    public String toString() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    /**
     * The function "proxSegundo" increments the time by one second, updating the minute, hour, and
     * resetting to 0 if necessary.
     */
    public void proxSegundo() {
        if (getSegundo() + 1 <= 59)
            setSegundo(getSegundo() + 1);
        else {
            setSegundo(0);
            if (getMinuto() + 1 <= 59)
                setMinuto(getMinuto() + 1);
            else {
                setMinuto(0);
                if (getHora() + 1 <= 24)
                    setHora(getHora() + 1);
                else {
                    setHora(0);
                }
            }
        }
    }
}
