package br.ucsal;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero");
		num = sc.nextInt();
		if (num == 1) {
			System.out.println("Voce digitou o n�mero 1");
		} else if (num == 2){
			System.out.println("Voce digitou o numero 2");
		}else {
			System.out.println("O numero que voce digitou n�o � 1 nem 2 � " + num);
		}

	}

}
