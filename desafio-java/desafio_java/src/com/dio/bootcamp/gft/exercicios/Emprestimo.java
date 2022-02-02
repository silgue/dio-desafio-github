package com.dio.bootcamp.gft.exercicios;

public class Emprestimo {
	
	public double calcularValorFinalEmprestimo(double valorSolicitado, double taxa, int parcelas) {
		double valorFinalEmprestimo = valorSolicitado;
		for (int i = 1; i < parcelas; i++) {
			valorFinalEmprestimo += valorFinalEmprestimo * taxa / 100;
		}

		return valorFinalEmprestimo;
	}
}
