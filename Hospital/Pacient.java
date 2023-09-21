/**
 * The Pacient class represents a patient in a hospital, with attributes such as ID, diagnosis, and a
 * collection of doctors.
 */
package Hospital;

import java.util.Collection;
import java.util.TreeMap;

public class Pacient implements IPacient {
    private String id;
    private String diagnostico;
    private TreeMap<String, IDoctor> medicos = new TreeMap<String, IDoctor>();

    Pacient(String id, String diagnostico) {
        this.id = id;
        this.diagnostico = diagnostico;
    }

    // * getters */

    public String getId() {
        return id;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public Collection<IDoctor> getMedicos() {
        return medicos.values();
    }

    // * funções */

    /**
     * The addMedico function adds a doctor object to a hashmap using the doctor's ID as the key.
     * 
     * @param m The parameter "m" is of type IDoctor, which is an interface representing a doctor.
     */
    public void addMedico(IDoctor m) {
        medicos.put(m.getId(), m);
    }

    /**
     * The function removes a medico from a list based on their id.
     * 
     * @param id The parameter "id" is a String that represents the unique identifier of the medico
     * (doctor) that needs to be removed from the list of medicos.
     */
    public void removeMedico(String id) {
        medicos.remove(id);
    }

    public String toString() {
        return String.format("Pac: %-16s Meds: %s", (String.format("%s:%s", id,diagnostico)), this.medicos.keySet());
    }

}
