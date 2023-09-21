package Company;

public class Employee {
    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Employee(String nome, Integer horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    /**
     * The function calculates the payment by multiplying the number of hours worked by the hourly
     * rate.
     * 
     * @return The method is returning a Double value, which is the result of multiplying the variables
     * "horas" and "valorPorHora".
     */
    public Double pagamento() {
        return horas * valorPorHora;
    }

    /**
     * The toString() function returns a formatted string representation of an object's name, hours
     * worked, and hourly rate.
     * 
     * @return The method is returning a formatted string that includes the name, hours worked, and
     * hourly rate.
     */
    @Override
    public String toString() {
        return String.format("Nome: %s, horas trabalhadas: %d, valor por hora: %.2f",
                nome, horas, valorPorHora);
    }
}
