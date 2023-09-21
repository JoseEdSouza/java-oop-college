/**
 * The Lead class represents a lead for a mechanical pencil, with properties such as thickness, type,
 * and size.
 */
package Pencil;

public class Lead {
    private float espessura;
    private String tipo;
    private int size;

    public Lead(float espessura, String tipo, int size) {
        this.espessura = espessura;
        setTipo(tipo);
        setSize(size);
    }

    // *setters */

    public void setSize(int size) {
        if (size < 0)
            this.size = 0;
        else
            this.size = size;
    }

    /**
     * The function sets the "tipo" variable to a specific value based on the input string, and prints
     * an error message if the input is invalid.
     * 
     * @param tipo The parameter "tipo" is a String that represents the type of something.
     */
    public void setTipo(String tipo) {
        if (tipo.equals("hb") || tipo.equals("HB") || tipo.equals("Hb") || tipo.equals("hB"))
            this.tipo = "HB";
        else if (tipo.equals("2b") || tipo.equals("2B"))
            this.tipo = "2B";
        else if (tipo.equals("4b") || tipo.equals("4B"))
            this.tipo = "4B";
        else if (tipo.equals("6b") || tipo.equals("6B"))
            this.tipo = "6B";
        else
            System.out.println("**ERROR - TIPO INVÁLIDO OU INEXISTENTE.");
    }

    // *getters */

    public int getSize() {
        return size;
    }

    public float getEspessura() {
        return espessura;
    }

    public String getTipo() {
        return tipo;
    }

    // *funções */

   
    /**
    * The function returns the number of times a pencil can be used based on its type.
    * 
    * @return The method is returning an integer value. The specific value being returned depends on
    * the value of the "tipo" variable. If "tipo" is equal to "HB", the method returns 1. If "tipo" is
    * equal to "2B", the method returns 2. If "tipo" is equal to "4B", the method returns 4. Otherwise,
    * if none of the
    */
    public int UsoPorFolha() {
        if (getTipo().equals("HB"))
            return 1;
        else if (getTipo().equals("2B"))
            return 2;
        else if (getTipo().equals("4B"))
            return 4;
        else
            return 6;
    }

    public String toString() {
        return getEspessura() + String.format(":%s:%d", getTipo(), getSize());
    }
}
