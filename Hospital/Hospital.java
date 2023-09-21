/**
 * The Hospital class represents a hospital and contains methods to add and remove doctors and
 * patients, as well as to establish a connection between a doctor and a patient.
 */
package Hospital;

import java.util.HashMap;
import java.util.TreeMap;

public class Hospital {
    private TreeMap<String, IDoctor> medicos = new TreeMap<String, IDoctor>();
    private TreeMap<String, IPacient> pacientes = new TreeMap<String, IPacient>();

    Hospital() {

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

    /**
     * The function "vincular" is used to link a doctor and a patient, ensuring that a patient does not
     * have more than one doctor of the same specialty.
     * 
     * @param nomeMedico The parameter "nomeMedico" is a String that represents the name of the doctor.
     * @param nomePaciente The parameter "nomePaciente" is a String that represents the name of the
     * patient.
     */
    public void vincular(String nomeMedico, String nomePaciente) {
        IDoctor medico = medicos.get(nomeMedico);
        IPacient paciente = pacientes.get(nomePaciente);
        if(paciente.getMedicos().size()!= 0){
            HashMap<String, IDoctor> especialidadesAux = new HashMap<String, IDoctor>();
            for (IDoctor i : paciente.getMedicos()) {
                especialidadesAux.put(i.getEspecialidade(), i);
            }
            if (especialidadesAux.containsKey(medico.getEspecialidade()))
                System.out.println("fail: ja existe outro medico da especialidade cirurgia");
            else {
                medico.addPaciente(paciente);
                paciente.addMedico(medico);
            }
        }
        else{
            medico.addPaciente(paciente);
            paciente.addMedico(medico);
        }
    }

    public String toString() {
        String retorno = "";
        for (IPacient i : pacientes.values()) {
            retorno += i + "\n";
        }
        for (IDoctor i : medicos.values()) {
            retorno += i + "\n";
        }
        return retorno;
    }

}
