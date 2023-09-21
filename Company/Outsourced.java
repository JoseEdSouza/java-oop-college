/**
 * The Outsourced class is a subclass of the Employee class and represents an employee who is
 * outsourced, with an additional expense.
 */
package Company;

public class Outsourced extends Employee {
    private Double despesaAdicional;

    
    public Outsourced(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + (1.1 * despesaAdicional);
    }

    @Override
    public String toString() {
        return super.toString() + ", Despesa adicional: " + despesaAdicional;
    }
}
