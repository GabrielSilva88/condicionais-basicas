package basicConditions;

import java.time.LocalDate;
import java.util.Scanner;

public class IdadeVotar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * 2) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a
		 * idade dela e depois mostre se ela pode ou não votar.
		 */

		int ano = 0;
		int anoAtual = LocalDate.now().getYear();
		System.out.println("Digite seu ano de nacimento: ");
		ano = scan.nextInt();
		int idade = anoAtual - ano;

		//System.out.println(idade);

		if (idade >= 18 && idade <= 70) {
			System.out.println(idade + " O voto é obrigatório na sua idade.");
		} else {
			if (idade >= 15 && idade < 18 || idade > 70) {
				System.out.println(idade + " O voto é facultativo para sua idade.");
			} else if (idade <= 14) {
				System.out.println(idade + " não pode votar ");
			}
		}

	}
}
