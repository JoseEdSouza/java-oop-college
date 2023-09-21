// The code is defining an interface called `IDoctor` in the `Hospital` package.
package Hospital;

import java.util.Collection;

public interface IDoctor {
    public String getId();

    public void addPaciente(IPacient paciente);

    public void removePaciente(String idPaciente);

    public Collection<IPacient> getPacientes();

    public String getEspecialidade();
}
