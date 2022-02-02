package com.dio.bootcamp.gft.exercicios;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class EntendendoMetodos {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		Emprestimo emprestimo = new Emprestimo();
		
		Mensagens mensagem = new Mensagens();
		
		System.out.println("Informe dois números:");
		
		Scanner inp = new Scanner(System.in);

        double x = inp.nextInt();
        double y = inp.nextInt();
        
        System.out.println(mensagem.saudacao());
        
        System.out.println("A soma dos dois números é:" + calc.somar(x, y));
        System.out.println("A subtração dos dois números é:" + calc.subtrair(x,y));
        System.out.println("A multiplicação dos dois números é:" + calc.multiplicar(x,y));
        System.out.println("A divisão dos dois números é:" + calc.dividir(x, y));
        
        System.out.println("Informe o valor solicitado, a taxa e a quantidade de parcelas");
        
        Double valorSolicitado = inp.nextDouble();
        Double taxa = inp.nextDouble();
        int parcelas = inp.nextInt();
        
        System.out.println("O valor total será de: " + emprestimo.calcularValorFinalEmprestimo(valorSolicitado, taxa, parcelas));

	}

}
