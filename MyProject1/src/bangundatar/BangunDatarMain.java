/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author FAHMIANUHA
 */
public class BangunDatarMain {
    public static void main(String[] args){
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 25;
        pp.lebar = 38;
        pp.hitungLuas();
        pp.hitungKeliling();
        
        //PERSEGI A
        System.out.println("\nPersegi A");
        Persegi PA = new Persegi();
        PA.sisi = 10;
        PA.hitungLuas();
        PA.hitungKeliling();
        
        //PERSEGI B
        System.out.println("\nPersegi B");
        Persegi PB = new Persegi();
        PB.sisi = 15;
        PB.hitungLuas();
        PB.hitungKeliling();
        
        //LINGKARAN X
        System.out.println("\nLingkaran X");
        Lingkaran LX = new Lingkaran();
        LX.r = 25;
        LX.hitungLuas();
        LX.hitungKeliling();
        
        //LINGKARAN Z
        System.out.println("\nLingkaran Z");
        Lingkaran LY = new Lingkaran();
        LY.r = 37;
        LY.hitungLuas();
        LY.hitungKeliling();
        
    }
    
}
