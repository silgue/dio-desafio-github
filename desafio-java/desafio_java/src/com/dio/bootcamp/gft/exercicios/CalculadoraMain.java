package com.dio.bootcamp.gft.exercicios;

import java.util.Scanner;

public class CalculadoraMain {
	
	static Calculadora calc = new Calculadora();

	public static void main(String[] args) {
		boolean continua = true;
		while(continua) {
			Scanner scan = new Scanner(System.in);
			double x = scan.nextDouble();
			double valorTotal = 49492;
			double percentual = calc.percentual(x,valorTotal);
			System.out.println(percentual);
			if(x == 999) continua = false;
		}
		
	}

}
