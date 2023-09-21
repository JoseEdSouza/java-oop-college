// The code is defining an interface called `IPacient` in the `Hospital` package.
package Hospital;

import java.util.Collection;

public interface IPacient {
    public String getId();

    public void addMedico(IDoctor medico);

    public void removeMedico(String idMedico);

    public Collection<IDoctor> getMedicos();

    public String getDiagnostico();
}