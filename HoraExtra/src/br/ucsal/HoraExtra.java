package br.ucsal;
import java.util.Scanner;

public class HoraExtra {

	private static Scanner sc;

	public static void main(String[] args) {
		
		double salario, horaExtra, valordaHora, horaNormal;
		horaNormal = 160;
				
		sc = new Scanner(System.in);
		System.out.println("digi um nome do funcion�rio ");
		String nome = sc.next();;					
		System.out.println("digite o valor da hora de trabalho do funcion�rio: " + nome);
		valordaHora = sc.nextDouble();
		System.out.println("Qual a quantidade de horas trabalhada " + nome);
		horaNormal = sc.nextDouble();
		horaExtra = horaNormal - 160;
		salario = (horaNormal*valordaHora) + ((valordaHora+0.5)*horaExtra);
		
		System.out.println("O valor do salario do funcionario e: Rs" + salario);
		
	}

}
