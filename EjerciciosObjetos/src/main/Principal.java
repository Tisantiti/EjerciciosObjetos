package main;

import java.util.Scanner;

import es.altair.datos.Circulo;
import es.altair.datos.Punto;

public class Principal {

	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		Punto p1 = new Punto(2.5, 3.6);
		Punto p2 = new Punto(4.3, 7.8);
		
		System.out.println("Distancia: " + p1.calcularDistanciaDesde(p2));
		
		Circulo c1 = new Circulo(20, new Punto(3, 4));
		Circulo c2 = new Circulo(4, 3, 20);
		
		System.out.println("Área: "+ c1.calcularArea());
		System.out.println("Perímetro: " + c1.calcularPerimetro());
		System.out.println("Distancia : " + c1.calcularDistanciaDesde(p2));
		sc.close();
	}

}
