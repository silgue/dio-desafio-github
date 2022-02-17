package com.dio.desafios;

import java.io.IOException;
import java.util.Scanner;

public class NotacaoCientifica {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);

		double N;

		N = leitor.nextDouble();

		System.out.printf((String.valueOf(N).startsWith("-") ? "" : "+") + "%4.4E", N);
		
		leitor.close();
	}
}
