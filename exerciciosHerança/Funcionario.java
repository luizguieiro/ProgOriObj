package exerciciosHerança;

public class Funcionario {
    protected String nome;
    protected String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}

// Subclasse Analista
class Analista extends Funcionario {
    protected double[] valorPorProjeto;

    public Analista(String nome, String matricula, double[] valorPorProjeto) {
        super(nome, matricula);
        this.valorPorProjeto = valorPorProjeto;
    }

    public double calcularSalario() {
        double soma = 0;
        for (double valor : valorPorProjeto) {
            soma += valor;
        }
        return soma;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário: R$ " + calcularSalario());
    }
}

// Subclasse Programador
class Programador extends Funcionario {
    protected double valorHora;
    protected int qtdDeHoras;

    public Programador(String nome, String matricula, double valorHora, int qtdDeHoras) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.qtdDeHoras = qtdDeHoras;
    }

    public double calcularSalario() {
        return valorHora * qtdDeHoras;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário: R$ " + calcularSalario());
    }
}



