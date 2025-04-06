package AtividadeEmSala0504;

import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.println("Nomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
