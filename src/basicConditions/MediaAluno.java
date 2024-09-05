package basicConditions;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		/*
		 * 3) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a
		 * sua média e mostre na tela. No final, analise a média e mostre se o aluno
		 * teve ou não um bom aproveitamento (se ficou acima da média 7.0).
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = scan.nextLine();

		System.out.println("Digite a nota 1");
		int nt1 = scan.nextInt();
		System.out.println("Digite a nota 1");
		int nt2 = scan.nextInt();

		int media = (nt1 + nt2) / 2;

		if (media <= 7) {
			if (media == 10) {
				System.out.println("Aluno: " + nome + ", sua nota é " + media + " acima da media");
			} else {
				System.out.println("Aluno: " + nome + ", sua nota é " + media);
			}
		} else {
			if (media >= 6 ) {
				System.out.println("Aluno:" + nome + ", sua nota é " + media + " em recuperação");
			} else {
				System.out.println("Aluno:" + nome + ", sua nota é " + media + " reprovado");
			}
		}
	}
}
