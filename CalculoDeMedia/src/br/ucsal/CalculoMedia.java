package br.ucsal;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		double n1, n2, x, y, media;
		int p1, p2, w, dec;
		System.out.println("informe o tipo de m�dia");
		System.out.println("aritim�tica = 1 / Ponderada = 2");
		dec = sc.nextInt();
		if (dec == 1){
			//Aritim�tica
			System.out.println("Informe as 02 notas");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			// calculo
			media = (n1 + n2) / 2;
			// Informe ao usuario
			System.out.println("a m�dia aritimetica � " + media);
			
			
		} else if (dec == 2){
			//Ponderada
			System.out.println("Informe os 02 pesos");
			
		} else{
			// Caso o usuario informe um numero que n�o seja 1 ou 2
			System.out.println("Informa��o incorreta");
	
			
			
			
		}
			
			
	
		
		
		

	}

}
