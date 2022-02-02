package com.dio.bootcamp.gft.exercicios;

public class Calculadora {

	public double somar(double x, double y) {

		return x + y;
	}

	public double subtrair(double x, double y) {

		return x - y;
	}

	public double dividir(double x, double y) {

		double resultado = 0;

		if (y != 0) {
			resultado = x / y;
		}

		return resultado;
	}

	public double multiplicar(double x, double y) {

		return x * y;
	}

}
