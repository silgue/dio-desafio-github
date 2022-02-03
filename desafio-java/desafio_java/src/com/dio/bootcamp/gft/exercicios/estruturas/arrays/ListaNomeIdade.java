package com.dio.bootcamp.gft.exercicios.estruturas.arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 
 * @author Alysson Rodrigues 
 * Faça um programa que leia conjuntos de dois
 * valores, o primeiro representando o nome e o segundo a idade. 
 * O programa deve parar quando o usuário escrever 0 no nome.
 */
public class ListaNomeIdade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nomeIdade = new HashMap<String, Integer>();
		
		String nome;
		int idade;
		
		while(true) {
			System.out.println("Escreva o nome: ");
			nome = scanner.next();
			if(nome.equals("0")) break;
			System.out.println("Escreva a idade: ");
			idade = scanner.nextInt();
			nomeIdade.put(nome, idade);
		}
		
		lerListaNomeIdade(nomeIdade);
		
	}

	public static void lerListaNomeIdade(HashMap<String, Integer> listaNomeIdade){
		for(Entry<String, Integer> nomeIdade : listaNomeIdade.entrySet()) {
			System.out.println("Nome: " + nomeIdade.getKey() + " Idade " + nomeIdade.getValue());
		}
	}
}
