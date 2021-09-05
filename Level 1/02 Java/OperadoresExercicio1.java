package com.empresa.cursojava.aula07;

import java.util.Scanner;

//Faça um programa que tenha como entradas dois números e imprima a soma de ambos. Utilize a classe Scanner para obter as entradas.

public class OperadoresExercicio1 {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int primeiroNumero = scan.nextInt();

		System.out.println("Informe o segundo número: ");
		int segundoNumero = scan.nextInt();
		
		int soma = primeiroNumero + segundoNumero;
		System.out.println("A soma dos dois números é: " + soma);
		
		
	}

}
