
public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;
    // Construtor
    
    public Empregado (String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Metodos de acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf() {
        if (salario <= 2000) { // Isento com menos de 2000 de salario
            return salario; // Corresponde a IRPF = 0%
        } else if (salario <= 4000) { // Se o salário for maior que 2500 e menor ou igual a 4000.
            return salario - salario * 0.10; // Corresponde a IRPF = 10%
        } else {
            return salario - salario * 0.15; // Corresponde a IRPF = 15%
        }
    }

    public double calcularInss() {
        if (salario <= 2500) {
            return salario - salario * 0.08; // Corresponde a INSS = 8%
        } else if (salario <= 5000) { // Se o salário for maior que 2500 e menor ou igual a 5000.
            return salario - salario * 0.09; // Corresponde a INSS = 9%
        } else {
            return salario - salario * 0.11; // Corresponde a INSS = 11%
        }
    }
}