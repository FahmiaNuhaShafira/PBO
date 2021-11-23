/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpelArrayListProject;
import java.util.Scanner;
import static java.util.Collections.binarySearch;
import java.util.ArrayList;
/**
 *
 * @author FAHMIANUHA
 */
public class AppArrayList {
     ArrayList<String> DATA = new ArrayList<>();  
    void Tambahkan_Data() {
        Scanner tambahkan = new Scanner(System.in);
        print("Masukkan data string : ");
        DATA.add(tambahkan.nextLine());
        print("Daftar string dalam array list :" + DATA);
        tambahkan.nextLine();
    }
    void Mencari_Data() {
        Scanner carikan = new Scanner(System.in);
        print("Cari String :  ");
        String mencari = carikan.nextLine();
        if(binarySearch(DATA,mencari) > -1){
            print("String " + mencari + "index ke " + binarySearch(DATA,mencari) +"dalam list");
        } else {
            print("String " + mencari + " tidak ada dalam list");
        }       
    }
    void Menghapus_Data() {
        Scanner menghapus = new Scanner(System.in);
        print("Hapus String : ");
        String menghapuskan = menghapus.nextLine();
        if(binarySearch(DATA,menghapuskan) > -1){
            DATA.remove(binarySearch(DATA,menghapuskan));
            print("String " + menghapuskan + " sudah dihapus dalam list");
        } else {
            print("String " + menghapuskan + " tidak ada dalam list");
        }    
    }   
    void Menampilkan_Data() {
        System.out.println("Daftar string dalam array list :" + DATA);
    }
    static void print(String text) {
        System.out.println(text);
    }    
}
