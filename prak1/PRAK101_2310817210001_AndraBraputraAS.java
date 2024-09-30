package prak1;

import java.util.Scanner;

public class PRAK101_2310817210001_AndraBraputraAS {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hari = 0, tahun = 0, tinggi = 0;
        double berat = 0;
        String tempat = "", nama = "", bulan = "";
	        
	        System.out.print("Masukkan Nama Lengkap: ");
	        nama = scan.nextLine();
	        
	        System.out.print("Masukkan Tempat Lahir: ");
	        tempat = scan.nextLine();
	        
	        System.out.print("Masukkan Tanggal Lahir : ");
	        hari = scan.nextInt();
	        
	        System.out.print("Masukkan Bulan Lahir : ");
	        bulan = scan.nextLine();
	        
	        System.out.print("Masukkan Tahun Lahir : ");
	        tahun = scan.nextInt();
	        
	        System.out.print("Masukkan Tinggi Badan : ");
	        tinggi = scan.nextInt();
	        
	        System.out.print("Masukkan Berat Badan : ");
	        berat = scan.nextDouble();
	        
	        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempat + " pada Tanggal " + hari + " " + bulan + " " + tahun + " Tinggi Badan " + tinggi + "cm dan Berat Badan " + berat + " kilogram");
       
	        scan.close();
	}

}