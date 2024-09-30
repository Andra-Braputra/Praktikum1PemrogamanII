package prak1;

import java.util.Scanner;

public class PRAK102_2310817210001_AndraBraputraAS {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka;
        int i = 0;
    	System.out.print("Masukkan angka: ");
        angka = scan.nextInt();
        
        while(i < 12) {
        	if(angka % 5 == 0) {
        		int angka2 = (angka / 5) - 1;
        		System.out.print(angka2 + ", ");
        	}else {
        		System.out.print(angka + ", ");
        	}
             angka++;
             i++;
        		
        }

	}

}
