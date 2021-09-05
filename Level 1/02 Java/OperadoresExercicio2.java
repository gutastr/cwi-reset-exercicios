package com.empresa.cursojava.aula07;

//Faça um programa que tenha como entradas 4 notas e imprima a média. Utilize a classe Scanner para obter as entradas.

import java.util.Scanner;

public class OperadoresExercicio2 {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite as quatro notas do aluno: ");
	double nota1 = scan.nextDouble();
	double nota2 = scan.nextDouble();
	double nota3 = scan.nextDouble();
	double nota4 = scan.nextDouble();
	
	System.out.println("As notas informadas são: ");
	System.out.println("Nota 1: " + nota1);
	System.out.println("Nota 2: " + nota2);
	System.out.println("Nota 3: " + nota3);
	System.out.println("Nota 4: " + nota4);
	
	double media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.println("A média do aluno é: " + media);
	
	}
}
