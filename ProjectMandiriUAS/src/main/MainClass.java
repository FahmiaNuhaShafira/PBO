/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import projectmandiri.PegawaiKerja;

/**
 *
 * @author FAHMIANUHA
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        PegawaiKerja qerja = new PegawaiKerja();
        Scanner dyv = new Scanner(System.in);
        String opsi,jawab = "y";   
        while(jawab.equalsIgnoreCase("y") ) {        	
        	   System.out.println("\n\n========================================================================================"
                           + "\n                              SISTEM DATA KARYAWAN PT.TAMAN"
                           + "\n========================================================================================"
                           + "\nInformasi Opsi Menu : ");
        
	        System.out.println("Ketik '1' untuk Tambah data karyawan ");
	        System.out.println("Ketik '2' untuk Hapus data karyawan tertentu ");	
	        System.out.println("Ketik '3' untuk Cari data karyawan tertentu");
	        System.out.println("Ketik '4' untuk Lihat data karyawan ");
	        System.out.println("Ketik '5' keluar dari sistem ");	        
	    
	        System.out.println("\nMasukkan Opsi Menu Anda : ");
	        opsi = dyv.nextLine();
	        
	        if( opsi.equals("1") ) {
                    System.out.println("\n========================================================================================");
                    qerja.Add();
                } else if( opsi.equals("2") ) {
                    System.out.println("\n========================================================================================");
                    qerja.Delete();
                } else if( opsi.equals("3") ) {
                    System.out.println("\n========================================================================================");
                    qerja.Cari();
                } else if( opsi.equals("4") ) {
                    System.out.println("\n========================================================================================");
                    qerja.View();
                } else if( opsi.equals("5") ) {
                    System.exit(0);
	        }	
		        	
	        System.out.println("\n############################################################################"
                        + "\nApakah Anda masih tetap ingin melanjutkan "
                        + "dalam menggunakan sistem?\nY = Ya\nN = Keluar dari sistem");
	        jawab = dyv.nextLine();
	       	System.out.println("############################################################################");
        }
    }
}
