package AtividadeEmSala0504;

import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salarios = new double[10];

        System.out.println("Digite 10 salários:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Salário " + (i+1) + ": ");
            salarios[i] = scanner.nextDouble();
        }

        int indiceMaior = 0;
        for (int i = 1; i < 10; i++) {
            if (salarios[i] > salarios[indiceMaior]) {
                indiceMaior = i;
            }
        }
        System.out.println("Maior salário está no índice: " + indiceMaior);
        System.out.println("Valor do maior salário: " + salarios[indiceMaior]);
    }
}