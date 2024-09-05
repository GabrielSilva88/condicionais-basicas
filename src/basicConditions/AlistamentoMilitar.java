package basicConditions;

import java.time.LocalDate;
import java.util.Scanner;

public class AlistamentoMilitar {
	/*
	 * 6) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a
	 * sua situação em relação ao alistamento militar.
	 *  → Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento. 
	 *  → Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int ano = 0;
		int anoAtual = LocalDate.now().getYear();
		
		System.out.println("Ano de Alistamento Militar \nDigite o ano de nacimento: ");
		ano = scan.nextInt();
		
		int alistamento = anoAtual - ano;
		
		if (alistamento < 18) {
			int idade = 18 - alistamento;
			System.out.printf("A idade %d, não permitida para alistamento, falta %d anos para alistamento.",alistamento, idade);
		} else {
			int idade = alistamento - 18;
			System.out.printf(" %d anos, o alistamento Obrigatorio, foi há %d anos.", alistamento, idade);
		}
	}
}
