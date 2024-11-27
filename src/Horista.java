public class Horista extends Empregado {

    private double horas;

    // Construtor
    public Horista(String n, String e, double h) {
        super(n, e);
        horas = h;
    }

    // Métodos de acesso
    public void set_horas(double h) {
        horas = h;
    }

    public double get_horas() {
        return horas;
    }

    public void calcularSalario() {
        salario = horas * 50;
    }

    public void Imprimir() { // Método Imprimir
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Horas trabalhadas: " + horas);
        System.out.println("Salario: " + getSalario());
    }
}
