package Voto;

import java.util.Scanner;

public class Voto_Eleitor {

	public static void main(String[] args) {
		int idade, sexo;

		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu Sexo, M = 1 ou F = 2");
		sexo = sc.nextInt();
		System.out.println("Digite sua idade");
		idade = sc.nextInt();
		System.out.println("Digite seu Nome");
		nome = sc.next();

		if (sexo == 1 && idade <= 17){
			System.out.println("Voc� n�o pode votar");
		}else if (sexo == 2 && idade <= 16){
			System.out.println("Voc� n�o pode votar");
		}else if (sexo == 1 && idade >= 18 && idade < 20 || idade >= 65){
			System.out.println("Seu Voto � Optativo");
		}else if (sexo == 2 && idade > 16 && idade < 18 || idade >= 60){
			System.out.println("Seu voto � optativo");
		}else{
			System.out.println("Seu voto � obrigat�rio");

		}
		System.out.println(nome + " " + idade);


	}


}


