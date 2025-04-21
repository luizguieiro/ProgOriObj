package exerciciosHerança;

import java.util.Scanner;

class PrincipalForma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();
        Circunferencia c = new Circunferencia(raio);
        c.mostra();

        System.out.println("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        Retangulo r = new Retangulo(base, altura);
        r.mostra();

        scanner.close();
    }
}