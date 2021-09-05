package com.empresa.cursojava.aula08;

import java.util.Scanner;

public class CondicionaisExercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe as quatro notas do aluno: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média: " + media);
				
		if (media == 10) {
			System.out.println("Aluno aprovado com louvores.");
		} else if (media >= 7 && media !=10) {
			System.out.println("Aluno aprovado.");
		} else { 
			System.out.println("Aluno reprovado.");
		}
			
	}
}
