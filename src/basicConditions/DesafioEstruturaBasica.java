package basicConditions;

import java.util.Scanner;

public class DesafioEstruturaBasica {
	/*
	 * DESAFIO Crie um programa que leia o tamanho de três segmentos de reta.
	 * Analise seus comprimentos e diga se é possível formar um triângulo com essas
	 * retas. Matematicamente, para três segmentos formarem um triângulo, o
	 * comprimento de cada lado deve ser menor que a soma dos outros dois.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int reta1 =0;
		int reta2 =0;
		int reta3 =0;
		
		System.out.println("Informe o tamanho dos três segmentos.\nDigite a 1ª reta: ");
		reta1 =scan.nextInt();
		System.out.println("Digite a 2ª reta: ");
		reta2 =scan.nextInt();
		System.out.println("Digite a 3ª reta: ");
		reta3 =scan.nextInt();
		
		if (reta1 + reta2 > reta3 && reta2 + reta3 > reta1 && reta1 + reta3 > reta2) {
			System.out.println("Forma um triângulo.");
		} else {
			System.out.println("Não forma um triângulo.");
		}
	}
}
