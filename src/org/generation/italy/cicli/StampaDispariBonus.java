package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaDispariBonus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto deve essere lunga la lista? : ");
		int n = scan.nextInt();
		int[] lista = new int[n];
		int contaDispari = 0;
		int contaPari;
		int sommaTra = 0;
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
		if ((contaDispari > 1) || (contaDispari == 0)) {
			System.out.println("Ci sono " + contaDispari + " numeri dispari.");
		}
		else if (contaDispari == 1) {
			System.out.println("C'è " + contaDispari + " numero dispari.");
		}
		contaPari = n - contaDispari;
		
		if ((contaPari > 1) || (contaPari == 0)) {
			System.out.println("Quindi per esclusione ci stanno " + contaPari + " numeri pari.");
		}
		else if (contaPari == 1) {
			System.out.println("Quindi per esclusione ci sta " + contaPari + " numero pari.");
		}
		System.out.println("Adesso se vuoi anche la somma dei numeri compresi tra due valori");
		System.out.print("Dimmi estremo inferiore: ");
		int extrInf = scan.nextInt();
		System.out.print("Dimmi estremo superiore: ");
		int extrSup = scan.nextInt();
		int differenza = extrSup - extrInf;
		if ( differenza > 1) {	
			for (int k = extrInf + 1; k < extrSup ; k++) {
				sommaTra += k;
			}
			System.out.println("La loro somma è " + sommaTra);
		}
		else if (differenza == 0 || (differenza <= 1 && differenza > 0) ) {
			System.out.println("I numeri scelti non so abbastanza distanti");
		}
		else {
			System.out.println("Sai cosa sono gli estremi inferiore e superiore?");
		}
		scan.close();
		}
		
	}

