/**
 * The Doctor class represents a doctor in a hospital, with properties such as ID, specialty, and a
 * collection of patients.
 */
package Hospital;

import java.util.Collection;
import java.util.TreeMap;

public class Doctor implements IDoctor {
    private String id;
    private String especialidade;
    private TreeMap<String, IPacient> pacientes = new TreeMap<String, IPacient>();

    Doctor(String id, String especialidade) {
        this.id = id;
        this.especialidade = especialidade;
    }

    // * getters */

    public String getId() {
        return id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * The function returns a collection of all patients.
     * 
     * @return The method is returning a collection of IPacient objects.
     */
    public Collection<IPacient> getPacientes() {
        return pacientes.values();
    }

    // * funções */

    /**
     * The function adds a patient to a map using their ID as the key.
     * 
     * @param p The parameter "p" is an object of type IPacient, which represents a patient.
     */
    public void addPaciente(IPacient p) {
        pacientes.put(p.getId(), p);
    }

    /**
     * The function removes a patient from a list of patients based on their ID.
     * 
     * @param id The parameter "id" is a String that represents the unique identifier of the patient to
     * be removed from the list of patients.
     */
    public void removePaciente(String id) {
        pacientes.remove(id);
    }

    public String toString() {
        return String.format("Med: %-16s Pacs: %s", (String.format("%s:%s", id,especialidade)), this.pacientes.keySet());
    }
}