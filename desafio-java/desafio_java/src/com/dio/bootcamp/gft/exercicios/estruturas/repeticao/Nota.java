package com.dio.bootcamp.gft.exercicios.estruturas.repeticao;

import java.util.Scanner;

/**
 * @author Alysson Rodrigues
 * @param args
 * Crie um programa que pe�a uma nota entre 0 e 10 e 
 * mostre uma mensagem caso o valor seja inv�lido 
 * e s� pare de solicitar ap�s um valor v�lido.
 */
public class Nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nota = 11;
			
		while(nota < 0 || nota > 10) {
			System.out.println("Informa uma nota entre 0 e 10: ");
			
			nota = scan.nextInt();
		}
		
		System.out.println("Obrigado por sua avalia��o.");
		
	}

}
