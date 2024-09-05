package basicConditions;

import java.util.Scanner;

public class AnoBissexto {
	/*
	 * 5) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o ano se ele e ou não Bissexto.\nDigite um ano: ");
		int ano = scan.nextInt();
		
		if (ano % 4 == 0 && ano % 100 !=0 || ano % 400 ==0) {
			System.out.println(ano + " é bissexto");
		} else {
			System.out.println(ano + " não é bissexto");
		}
	}
}
