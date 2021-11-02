/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pythagoras;
import java.util.Scanner;
/**
 *
 * @author FAHMIANUHA
 */
public class ProjectPythagoras {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("     TRIPLE PYTHAGORAS CHECKER     ");
        System.out.println("=======================================");
        System.out.println("      ____                         ");
        System.out.println("     |    |___                     ");
        System.out.println(" [a] |        |___                 ");
        System.out.println("     |            |___ [c]         ");
        System.out.println("     |________________|            ");
        System.out.println("              [b]                  ");
        System.out.println("_______________________________________");        
        System.out.println("Menu Aplikasi Java Pythagoras");
        System.out.println("1.	Cek triple pythagoras");
        System.out.println("2.	Menentukan sisi miring segitiga");
        System.out.println("3.	Menentukan sisi siku-siku segitiga");
        System.out.println("4.	Exit");
        System.out.println("_______________________________________");  
        System.out.println("Masukan Nomor Pilihan Anda : ");
        Scanner pilihan = new Scanner(System.in);
        
        switch(pilihan.nextInt()){
            case 1 :
                Triple t = new Triple();
                t.input();
                t.cek();
                break;
            case 2 :
                Miring c = new Miring();
                c.input();
                c.sisiMiring();
                break;
            case 3 :
                SikuSiku siku = new SikuSiku();
                siku.input();
                siku.sisiSiku();
                break;
            case 4:
                System.out.println("--Program Selesai--");
  
                // Terminate JVM
                System.exit(0);
            default :
                System.out.println("Pilihan tidak tersedia");
                
        }
        
            
    }
             
        
            
}
