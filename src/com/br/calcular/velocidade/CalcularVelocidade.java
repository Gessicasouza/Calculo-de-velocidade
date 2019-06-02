package com.br.calcular.velocidade;

import java.text.MessageFormat;
import java.util.Scanner;

public class CalcularVelocidade {

private static Scanner input;

public static void main(String[] args) {
	input = new Scanner(System.in);
	
	double KmPorLitro =12;
	
	System.out.println("Qual é a Distância Percorrida?");
	double distancia = input.nextDouble();
	
	System.out.println("Quanto Tempo levou?");
	double tempo = input.nextDouble();
	
	System.out.println("Qual a Velocidade Percorrida?");
	double velocidade = input.nextDouble();
	
	
	        distancia = tempo * velocidade ;
    double litrosUsados = distancia /KmPorLitro;
     String texto = MessageFormat.format("A Distância"
	 		  + " Percorrida foi de {0}. "
	 		  + "A Gasolina Gasta foi de {1}", distancia , litrosUsados);
	 System.out.println(texto);
     
      
	
	
	

	}

}
