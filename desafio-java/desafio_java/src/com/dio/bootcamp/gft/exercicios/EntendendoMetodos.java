package com.dio.bootcamp.gft.exercicios;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class EntendendoMetodos {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		Emprestimo emprestimo = new Emprestimo();
		
		Mensagens mensagem = new Mensagens();
		
		System.out.println("Informe dois n�meros:");
		
		Scanner inp = new Scanner(System.in);

        double x = inp.nextInt();
        double y = inp.nextInt();
        
        System.out.println(mensagem.saudacao());
        
        System.out.println("A soma dos dois n�meros �:" + calc.somar(x, y));
        System.out.println("A subtra��o dos dois n�meros �:" + calc.subtrair(x,y));
        System.out.println("A multiplica��o dos dois n�meros �:" + calc.multiplicar(x,y));
        System.out.println("A divis�o dos dois n�meros �:" + calc.dividir(x, y));
        
        System.out.println("Informe o valor solicitado, a taxa e a quantidade de parcelas");
        
        Double valorSolicitado = inp.nextDouble();
        Double taxa = inp.nextDouble();
        int parcelas = inp.nextInt();
        
        System.out.println("O valor total ser� de: " + emprestimo.calcularValorFinalEmprestimo(valorSolicitado, taxa, parcelas));

	}

}
