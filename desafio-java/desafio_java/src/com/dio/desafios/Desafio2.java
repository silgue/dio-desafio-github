package com.dio.desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n, aux=1;
		
		n = sc.nextInt();
		
		while(aux!=n+1) {
			String s = "";
			int cont = aux*4;
			int inicio = cont - 3;
			while(inicio!=cont+1) {
				if(inicio==cont) {
					s = s + "PUM";
				}else {
					s = s + inicio + " ";
				}
				inicio++;
			}
			System.out.println(s);
			aux++;
		}
	}
}
