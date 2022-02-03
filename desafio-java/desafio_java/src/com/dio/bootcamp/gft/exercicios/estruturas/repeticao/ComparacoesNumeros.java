package com.dio.bootcamp.gft.exercicios.estruturas.repeticao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Alysson Rodrigues
 * Faça um programa que leia 5 números, informe o maior número e a média entre eles.
 *
 */
public class ComparacoesNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 1; i<6;i++) {
			System.out.println("Informa o " + i + "º número: ");
			lista.add(scan.nextInt());
		}
		
		Collections.sort(lista);
		
		System.out.println("O maior valor é: " + lista.get(lista.size()-1));
		System.out.println("A média dos valores é: " + mediaNumeros(lista));
	}
	
	public static double mediaNumeros(List<Integer> lista) {
		int media = 0;
		
		for(int numero : lista) {
			media += numero;
		}
		
		return media/lista.size();
		
	}

}
