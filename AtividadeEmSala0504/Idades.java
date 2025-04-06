package AtividadeEmSala0504;

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];
        int soma = 0;

        System.out.println("Digite 10 idades:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Idade " + (i+1) + ": ");
            idades[i] = scanner.nextInt();
            soma += idades[i];
        }
        double media = (double) soma / 10;
        System.out.println("Média das idades: "+ media);
    }
}
