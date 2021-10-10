/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author FAHMIANUHA
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //project 1
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        double totalLuas = Math.round(p.hitungLuas(42) + (2* l.hitungLuas(21)));
        System.out.println("Luas bangun datar tersebut adalah: " + totalLuas);
        
        //project 2
        Lingkaran lBesar = new Lingkaran();
        Lingkaran lKecil = new Lingkaran();
        
        double luasAbu = Math.round((lBesar.hitungLuas(14)/2) - lKecil.hitungLuas(7));
        System.out.println("Luas daerah yang berwarna abu-abu adalah : " + luasAbu);
    }
    
}
