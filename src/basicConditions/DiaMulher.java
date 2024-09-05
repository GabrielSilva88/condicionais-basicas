package basicConditions;

import java.beans.beancontext.BeanContextServicesListener;
import java.util.Scanner;

public class DiaMulher {
	/*
	 * 7) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
	 * 	para todos, mas especialmente para mulheres. Faça um programa que leia nome,
	 *	gênero e valor das compras do cliente e calcule o preço com desconto. 
	 * 	Sabendo que: 
	 * 		→ Homens ganham 5% de desconto. 
	 * 		→ Mulheres ganham 13% de desconto.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String nome="";
		String genero="";
		double valor =0;
		
		System.out.println("Promoção ao comprar\nDigite sue nome:");
		nome = scan.nextLine();
		System.out.println("Digite seu genero: ");
		genero = scan.nextLine();
		System.out.println("Digite o valor da compra: ");
		valor = scan.nextDouble();
		
		if(genero.equals("homem") || genero.equals("masculino") || genero.equals("m")) {
			double valorD = (valor * 5)/100;
			double valorT = valor - valorD;
			System.out.println(nome +", o desconte de 5%, total é "+ valorT);
			
			
		}else if(genero.equals("mulher") || genero.equals("feminino") || genero.equalsIgnoreCase("f")){
			double valorD = (valor * 13)/100;
			double valorT = valor - valorD;
			System.out.println(nome +", o desconte de 13%, total é "+ valorT);
		}else {
			System.out.println("Não e uma opção");
		}
		
		
	}
}
