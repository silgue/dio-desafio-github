package com.dio.bootcamp.gft.exercicios.estruturas.repeticao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Alysson Rodrigues
 * Fa�a um programa que leia 5 n�meros, informe o maior n�mero e a m�dia entre eles.
 *
 */
public class ComparacoesNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 1; i<6;i++) {
			System.out.println("Informa o " + i + "� n�mero: ");
			lista.add(scan.nextInt());
		}
		
		Collections.sort(lista);
		
		System.out.println("O maior valor �: " + lista.get(lista.size()-1));
		System.out.println("A m�dia dos valores �: " + mediaNumeros(lista));
	}
	
	public static double mediaNumeros(List<Integer> lista) {
		int media = 0;
		
		for(int numero : lista) {
			media += numero;
		}
		
		return media/lista.size();
		
	}

}
