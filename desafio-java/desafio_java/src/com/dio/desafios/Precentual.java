package com.dio.desafios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Precentual {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	double percentual;
    	
    	percentual = (B-A)*100/A;
    	
    	DecimalFormat df = new DecimalFormat("###0.00");
    	
    	System.out.println(df.format(percentual)+"%");

	}

}
