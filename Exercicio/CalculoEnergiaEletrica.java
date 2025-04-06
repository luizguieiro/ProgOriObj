package Exercicio;

import javax.swing.*;
import java.text.DecimalFormat;

public class CalculoEnergiaEletrica {
    private static final double Tarifa = 0.28172;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                null,
                "Digite o seu consumo em KWh:",
                "Efetuar o Cálculo da Energia Elétrica",
                JOptionPane.QUESTION_MESSAGE
        );

        if (input == null) {
            System.exit(0);
        }

        boolean numeroValido = true;
        int pontosDecimais = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i == 0 && c == '-') {
                continue;
            }

            if (c == '.') {
                pontosDecimais++;
                if (pontosDecimais > 1) {
                    numeroValido = false;
                    break;
                }
                continue;
            }

            if (!Character.isDigit(c)) {
                numeroValido = false;
                break;
            }
        }

        // Se for vazio, "-", "." ou "-.", também é inválido
        if (input.isEmpty() || input.equals("-") || input.equals(".") || input.equals("-.")) {
            numeroValido = false;
        }

        if (numeroValido) {
            double consumo = Double.parseDouble(input);
            calcularEExibirResultado(consumo);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Por favor, insira um valor numérico válido.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private static void calcularEExibirResultado(double consumo) {
        double fornecimento = consumo * Tarifa;

        double fatorICMS, fatorCOFINS, fatorPIS;
        if (consumo <= 200) {
            fatorICMS = 0.136363;
            fatorCOFINS = 0.0614722;
            fatorPIS = 0.013346;
        } else {
            fatorICMS = 0.333333;
            fatorCOFINS = 0.0730751;
            fatorPIS = 0.0158651;
        }

        double icms = fatorICMS * fornecimento;
        double cofins = fatorCOFINS * fornecimento;
        double pisPasesp = fatorPIS * fornecimento;
        double icmsSobreCofins = fatorCOFINS * fatorICMS * fornecimento;
        double icmsSobrePisPasesp = fatorPIS * fatorICMS * fornecimento;
        double fatura = fornecimento + icms + cofins + pisPasesp + icmsSobreCofins + icmsSobrePisPasesp;

        String mensagem = "Resultado:\n" +
                "Fornecimento = " + df.format(fornecimento) + "\n" +
                "ICMS = " + df.format(icms) + "\n" +
                "COFINS = " + df.format(cofins) + "\n" +
                "PIS/PASESP = " + df.format(pisPasesp) + "\n" +
                "ICMS SOBRE COFINS = " + df.format(icmsSobreCofins) + "\n" +
                "ICMS SOBRE PIS/PASESP = " + df.format(icmsSobrePisPasesp) + "\n" +
                "FATURA = " + df.format(fatura);

        JOptionPane.showMessageDialog(
                null,
                mensagem,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}