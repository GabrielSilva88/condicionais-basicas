package basicConditions;

import java.util.Scanner;

public class MultaVelocidade {
	public static void main(String[] args) {

		/*
		 * 1) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
		 * 80km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso,
		 * exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade
		 * permitida.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a velocidade do carro: ");
		double velocidade = scan.nextDouble();

		if (velocidade >= 80) {
			double multa = (velocidade - 80) * 5;
			System.out.printf("Acima da velocidade permitida, Multa de %.2f", multa);
		} else {
			System.out.println("Velocidade Permitida, não gera multa.");
		}

	}
}
