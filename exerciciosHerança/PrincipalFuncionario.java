package exerciciosHerança;

import java.util.Scanner;

public class PrincipalFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Cadastro do Analista ---");
        System.out.print("Nome: ");
        String nomeAnalista = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matriculaAnalista = scanner.nextLine();

        System.out.print("Quantidade de projetos: ");
        int qtdProjetos = scanner.nextInt();
        double[] projetos = new double[qtdProjetos];
        for (int i = 0; i < qtdProjetos; i++) {
            System.out.print("Valor do projeto " + (i + 1) + ": R$ ");
            projetos[i] = scanner.nextDouble();
        }
        scanner.nextLine();
        Analista analista = new Analista(nomeAnalista, matriculaAnalista, projetos);

        System.out.println("\n--- Cadastro do Programador ---");
        System.out.print("Nome: ");
        String nomeProgramador = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matriculaProgramador = scanner.nextLine();
        System.out.print("Valor da hora: R$ ");
        double valorHora = scanner.nextDouble();
        System.out.print("Quantidade de horas: ");
        int qtdDeHoras = scanner.nextInt();

        Programador programador = new Programador(nomeProgramador, matriculaProgramador, valorHora, qtdDeHoras);


        System.out.println("\n--- Dados do Analista ---");
        analista.mostrarDados();

        System.out.println("\n--- Dados do Programador ---");
        programador.mostrarDados();

        scanner.close();
    }
}
