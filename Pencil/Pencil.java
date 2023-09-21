/**
 * The Pencil class represents a mechanical pencil with a specific thickness and the ability to insert
 * and remove graphite leads.
 */
package Pencil;

public class Pencil {
    private float espessura;
    private Lead ponta;

    public Pencil(float espessura) {
        setEspessura(espessura);
        ponta = null;
    }

    // *setters */

    public void setEspessura(float espessura) {
        this.espessura = espessura;
    }

    // *getters */

    public float getEspessura() {
        return espessura;
    }

    // *funções */

    // insere um grafite na lapiseira se for de espessura igual, caso não emite
    // erro.
    /**
     * The function checks if a lead can be inserted into a pencil and returns true if successful,
     * otherwise it prints an error message and returns false.
     * 
     * @param pontLead The parameter "pontLead" is an object of type "Lead" which represents a lead for
     * a mechanical pencil.
     * @return The method is returning a boolean value.
     */
    public boolean insert(Lead pontLead) {
        if (ponta != null) {
            System.out.println("**ERROR - LAPISEIRA JA TEM GRAFITE.");
            return false;
        } else if (pontLead.getEspessura() == this.getEspessura()) {
            this.ponta = pontLead;
            return true;
        } else {
            System.out.println("**ERROR - GRAFITIE INCOMPATÍVEL.");
            return false;
        }
    }

    // remove o grafite se houver.
    /**
     * The function "RemoveGrafite" checks if there is a graphite and removes it if it exists.
     */
    public void RemoveGrafite() {
        if (HasGrafite())
            ponta = null;
    }

    // checa se tem grafite.
    public boolean HasGrafite() {
        if (ponta == null) {
            System.out.println("**ERROR - LAPISEIRA SEM GRAFITE.");
            return false;
        }

        else if (ponta.getSize() == 0) {
            System.out.println("**ERROR - LAPISEIRA SEM GRAFITE.");
            return false;
        }

        else
            return true;
    }

    /**
     * The WritePage function checks if there is enough graphite to write and if the graphite size is
     * sufficient, it reduces the size of the graphite by the amount used per page, otherwise it sets
     * the graphite size to 10 and prints an error message.
     */
    public void WritePage() {
        if (HasGrafite()) {
            if (ponta.getSize() <= 10) {
                System.out.println("**ERROR - GRAFITE COM TAMANHO INSUFICIENTE PARA ESCREVER");
            } else {
                if (ponta.getSize() - ponta.UsoPorFolha() >= 10)
                    ponta.setSize(ponta.getSize() - ponta.UsoPorFolha());
                else {
                    ponta.setSize(10);
                    System.out.println("**ERROR - FOLHA IMCOMPLETA.");
                }
            }
        }
    }

    public String toString() {
        String saida = "calibre: " + espessura + ", grafite: ";
        if (ponta != null)
            saida += "[" + ponta.toString() + "]";
        else
            saida += "null";
        return saida;
    }
}
