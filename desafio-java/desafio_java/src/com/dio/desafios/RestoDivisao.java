package com.dio.desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class RestoDivisao {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();
        
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        if(x<y) {
        	listaNumeros = listaNumerosEntreDoisValores(x,y);
        }else {
        	listaNumeros = listaNumerosEntreDoisValores(y,x);
        }
        for(int numero : listaNumeros) {
        	if(isDivivelPorDoisOuPorTres(numero)) {
        		System.out.println(numero);
        	}
        }
    }
	
	private static boolean isDivivelPorDoisOuPorTres(int numero) {
		if (numero % 5 == 2 || numero % 5 == 3) {
			return true;
		}else {
			return false;
		}
	}
	
	private static ArrayList<Integer> listaNumerosEntreDoisValores(int x, int y) {
		ArrayList<Integer> lista = new ArrayList<>();
		while(x!=y) {
			lista.add(x++);
		}
		return lista;
		
	}
	
}
