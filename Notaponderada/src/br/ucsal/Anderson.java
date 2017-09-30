package br.ucsal;

import java.util.Scanner;

public class Anderson {

	public static void main(String[] args) {
		// n1 * p1 = x
		// n2 * p2 = y
		// p1 + p2 = w
		
		Scanner sc = new Scanner(System.in);
		// Criamos variaves para armazenar
		// a informação necessria
		double n1, n2, x, y, media;
		int p1, p2, w;
		// solicitamos ao usuario			
		System.out.println("Informe as 02 notas");
		// o armazenamento
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		System.out.println("Informe os 02 pesos");
		p1 = sc.nextInt();
		p2 = sc.nextInt();
		// calculo
		x = n1 * p1;
		y = n2 * p2;
		w = p1 + p2;
		media = (x + y) / w;
		// informe o resultado ao usuario 
		System.out.println("o resultado da média ponderada é:" + media);
		
		

	}

}
