public class Mensalista extends Empregado {

    private String cargo;

    // Construtor
    public Mensalista(String n, String e, String c) {
        super(n, e);
        cargo = c;
    }

    // Métodos de acesso
    public void set_cargo(String c) {
        cargo = c;
    }

    public String get_cargo() {
        return cargo;
    }

    public void calcularSalario() {
        if (cargo.equals("Junior")) {
            salario = 2500;
        } else if (cargo.equals("Pleno")) {
            salario = 3500;
        } else if (cargo.equals("Senior")){ // Se o cargo for Sênior o salário é de 5500
            salario = 5500;
        }
        salario = calcularInss(); // Chama o método Calcular INSS e retorna para a variavel salário
    }

    public void Imprimir() { // Método Imprimir
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + getSalario());
    }
}
