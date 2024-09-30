package prak1;

import java.util.Scanner;

public class PRAK104_2310817210001_AndraBraputraAS {	 
	    public static String suit(char abu, char bagas) {
	        if (abu == bagas) {
	            return "Seri";
	        }
	        if ((abu == 'B' && bagas == 'G') || (abu == 'G' && bagas == 'K') || (abu == 'K' && bagas == 'B')) {
	            return "Abu";
	        } else {
	            return "Bagas";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Masukkan pilihan Abu (misal: BKG):");
	        String Pilabu = scanner.nextLine().toUpperCase();

	        System.out.println("Masukkan pilihan Bagas (misal: GBB):");
	        String Pilbagas = scanner.nextLine().toUpperCase();

	        int abuScore = 0;
	        int bagasScore = 0;

	        for (int i = 0; i < 3; i++) {
	            String result = suit(Pilabu.charAt(i), Pilbagas.charAt(i));
	            if (result.equals("Abu")) {
	                abuScore++;
	            } else if (result.equals("Bagas")) {
	                bagasScore++;
	            }
	        }

	        // Tentukan pemenang akhir
	        if (abuScore > bagasScore) {
	            System.out.println("Abu");
	        } else if (bagasScore > abuScore) {
	            System.out.println("Bagas");
	        } else {
	            System.out.println("Seri");
	        }

	        scanner.close();
	    }
	}
