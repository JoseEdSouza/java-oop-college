/**
 * The `Company` class represents a company and provides methods to add employees, display employee
 * information, and calculate the total payment for all employees.
 */
package Company;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> empregados = new ArrayList<Employee>();

    Company() {

    }

    /**
     * The function "adicionaEmpregado" adds an employee to a list of employees.
     * 
     * @param e The parameter "e" is of type Employee.
     */
    public void adicionaEmpregado(Employee e) {
        empregados.add(e);
    }

    /**
     * The function "mostraEmpregado" displays information about employees in a company.
     */
    public void mostraEmpregado() {
        String retorno = "";
        retorno += "Empresa: \n";
        for (Employee i : empregados) {
            retorno += i.toString() + "\n";
        }
        System.out.printf(retorno);
    }

    /**
     * The function calculates the total payment for all employees.
     * 
     * @return The method `calculaFolha` returns a `double` value, which represents the total payment
     * for all employees in the `empregados` list.
     */
    public double calculaFolha() {
        Double total = 0.0;
        for (Employee i : empregados) {
            total += i.pagamento();
        }
        return total;
    }
}
