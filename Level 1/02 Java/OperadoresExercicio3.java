package com.empresa.cursojava.aula07;

//Fa�a um programa que solicite quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.

import java.util.Scanner;

public class OperadoresExercicio3 {	

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Informe o valor da hora trabalhada: ");
			float valorHora = scan.nextFloat();
			
			System.out.println("Informe a quantidade de horas trabalhadas no m�s: ");
			float horasTrabalhadas = scan.nextFloat();
			
			float salario = valorHora * horasTrabalhadas;
			
			System.out.println("O valor do sal�rio � R$ " + salario);

	}

}
