package prak1;

import java.util.Scanner;

public class PRAK103_2310817210001_AndraBraputraAS {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Masukkan dua angka (pisahkan dengan spasi): ");
	        int angka1 = scan.nextInt();
	        int angka2 = scan.nextInt();
	        int i = 0;

	        do {
	            if (angka2 % 2 != 0) {
	                System.out.print(angka2 + ", "); 
	                i++; 
	            }
	            angka2++; 
	        } while (i < angka1); 

	        scan.close(); 
	    }
	}
