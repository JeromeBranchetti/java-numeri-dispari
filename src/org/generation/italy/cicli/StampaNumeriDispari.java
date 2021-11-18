package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto deve essere lunga la lista? : ");
		int n = scan.nextInt();
		int[] lista = new int[n];
		int contaDispari = 0;
		Random ran = new Random();
		for ( int i = 0; i < lista.length; i++ ) {
			lista[i] = ran.nextInt(100);
		}
		for (int j = 0; j < lista.length; j++) {
			if (lista[j] % 2 != 0) {
				System.out.println(lista[j]);
				contaDispari += 1;
			}
		}
		if (contaDispari > 1) {
			System.out.println("Ci sono " + contaDispari + " numeri dispari.");
		}
		else if (contaDispari == 1) {
			System.out.println("C'è " + contaDispari + " numero dispari.");
		}
		else {
			System.out.println("Non ci sono numeri dispari");
		}
		scan.close();
		}
		
	}


