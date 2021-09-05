package com.empresa.cursojava.aula07;

//Faça um programa que solicite quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class OperadoresExercicio3 {	

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Informe o valor da hora trabalhada: ");
			float valorHora = scan.nextFloat();
			
			System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
			float horasTrabalhadas = scan.nextFloat();
			
			float salario = valorHora * horasTrabalhadas;
			
			System.out.println("O valor do salário é R$ " + salario);

	}

}
