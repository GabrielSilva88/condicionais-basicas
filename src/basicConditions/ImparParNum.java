package basicConditions;

import java.util.Scanner;

public class ImparParNum {
	/*
	 * 4) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
	 * ÍMPAR.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = scan.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("Numero digitado " + num +" é PAR");
		}else {
			System.out.println("Numero digitado " + num +" é IMPAR");
		}
	}
}
