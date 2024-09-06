package basicConditions;

import java.util.Scanner;

public class ValorViagem {
	/*
	 * 8) Faça um algoritmo que pergunte a distância que um passageiro deseja
	 * percorrer em km. Calcule o preço da passagem, cobrando R$0.50 por Km para
	 * viagens até 200Km e R$0.45 para viagens mais longas.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calcular a distancia que deseja porcorrer\nDigite a distanciam: ");
		double km = scan.nextDouble();
		
		if(km < 200) {
			double distancia = km * 0.50;
			System.out.printf("Valor da corrida é %.2f",distancia);
		}else {
			double distancia = km * 0.45;
			System.out.printf("Valor da corrida é %.2f",distancia);
		}
	}
}
