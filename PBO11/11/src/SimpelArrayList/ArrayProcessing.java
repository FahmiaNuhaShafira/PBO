/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpelArrayList;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class ArrayProcessing {
    // array list data
    ArrayList<Integer> dataBil = new ArrayList<Integer>();
    
    //input
    void input(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Menu Data ArrayList:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih nomor berapa: ");
            
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    System.out.print("\nMasukan data string: ");
                    this.dataBil.add(input.nextInt());
                    System.out.println("Daftar string dalam array list:" + this.dataBil + "\n");
                    break;
                    
                case 2:
                    System.out.print("\nString yang mau dicari: ");
                    input.nextLine();
                    String find = input.nextLine();
                    int index = this.dataBil.indexOf(find);
                    if(index >= 0){
                        System.out.println("String '" + find + "' ada di index ke" + index + " di dalam data\n");
                    } else{
                        System.out.println("String '" + find + "' tidak ada dalam data\n");
                    }
                    break;
                    
                case 3:
                    System.out.print("\nString yang mau dihapus: ");
                    input.nextLine();
                    String delete = input.nextLine();
                    int remove = this.dataBil.indexOf(delete);
                    if(remove >= 0){
                        System.out.println("String '" + delete + "' sudah dihapus di dalam data");
                    } else{
                        System.out.println("String '" + delete + "' tidak ada dalam data");
                    }
                    System.out.println("Daftar string dalam array list: " + this.dataBil + "\n");
                    break;
                    
                case 4:
                    System.out.println("\nDaftar string dalam array list: " + this.dataBil + "\n");
                    break;
                
                case 5:
                    System.out.println("\nProgram Selesai");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("\nPilihan tidak tersedia");
            }
        }
    }    
}
