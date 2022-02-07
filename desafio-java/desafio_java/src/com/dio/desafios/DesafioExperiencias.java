package com.dio.desafios;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DesafioExperiencias {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt(); //n de testes
        int coelho = 0;
        int sapo = 0;
        int rato = 0;
        int total = 0;
        int nParcial = 0;
        String c;
        String leitura = null;

        for (int i = 0; i < N; i++) {

            nParcial = input.nextInt();

            c = input.next().toUpperCase();
            switch (c) {
                case "C" :
                    coelho += nParcial;
                    break;
                case "S" :
                    sapo += nParcial;
                    break;
                case "R" :
                    rato += nParcial;
                    break;
            }
            total += nParcial;
        }
        
        System.out.println("Total: " + total + " cobaias");

        System.out.println("Total de coelhos: " + coelho);
    
        System.out.println("Total de ratos: " + rato);
    
        System.out.println("Total de sapos: " + sapo);
    
        System.out.println("Percentual de coelhos: " + String.format("%.2f", ( (double) coelho / total) * 100) + " %");
    
        System.out.println("Percentual de ratos: " + String.format("%.2f", ( (double) rato / total) * 100) + " %");
    
        System.out.println("Percentual de sapos: " + String.format("%.2f", ( (double) sapo / total) * 100) + " %");
    
    }
}