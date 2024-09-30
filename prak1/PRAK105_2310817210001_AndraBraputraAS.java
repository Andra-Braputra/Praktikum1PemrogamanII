package prak1;

import java.util.Scanner;

public class PRAK105_2310817210001_AndraBraputraAS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Masukkan Jari-jari : ");
        float jari = scanner.nextFloat();
        System.out.print("Masukan tinggi : ");
        float tinggi = scanner.nextFloat();
        
        float volume = (float) (Math.PI*jari*jari*tinggi);
        System.out.print("Volume tabung dengan jari-jari " + jari 
        		+ " cm dan " + "tinggi " + tinggi 
        		+ " cm adalah " + volume + " m3");
        
        

	}

}
