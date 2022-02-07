package com.dio.desafios;

import java.util.Scanner;

public class SomaPimentoes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int totalPimentoes;

		totalPimentoes = a + b;

		System.out.printf("X = %d", totalPimentoes);

	}

}
