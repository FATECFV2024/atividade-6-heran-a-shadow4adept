public class FolhaPGTO {

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior"); // Criação
        men1.calcularSalario(); // Chama o método pra calcular o Salário
        men1.calcularInss(); // Chama o método pra calcular o INSS
        men1.Imprimir();  // Chama o método Imprimir

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior"); // Criação
        men2.calcularSalario(); // Chama o método pra calcular o Salário
        men2.calcularInss(); // Chama o método pra calcular o INSS
        men2.Imprimir();  // Chama o método Imprimir

        // Empregados horistas
        hora1 = new Horista("Carlos", "Rua xyz", 20); // Criação
        hora1.calcularSalario(); // Chama o método pra calcular o Salário
        hora1.Imprimir();  // Chama o método Imprimir

        hora2 = new Horista("Cristina", "Rua do centro", 100); // Criação
        hora2.calcularSalario(); // Chama o método pra calcular o Salário
        hora2.Imprimir();  // Chama o método Imprimir
    }
}
