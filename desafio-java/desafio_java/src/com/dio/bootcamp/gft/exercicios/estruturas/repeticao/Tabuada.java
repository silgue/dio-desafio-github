package com.dio.bootcamp.gft.exercicios.estruturas.repeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número de 0 a 10 para ver a tabuada desse número: ");
		int numero = scan.nextInt();
		System.out.println("Tabuada de " + numero + ":");
		for (int i = 1; i < 11; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}

	}

}
