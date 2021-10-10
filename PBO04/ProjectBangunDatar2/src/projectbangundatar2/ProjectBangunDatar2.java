/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author FAHMIANUHA
 */
public class ProjectBangunDatar2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //To do code application logic here
        //Integer data types will be handled with the same method as double
        
        //Persegi Panjang
        System.out.println("Persegi Panjang (PP)");
        PersegiPanjang a = new PersegiPanjang();
        System.out.println("a. Luas PP     : " + a.hitungLuas(7,5));
        System.out.println("   Keliling PP : " + a.hitungKeliling(7,5));
        System.out.println("b. Luas PP     : " + a.hitungLuas(3.6,8));
        System.out.println("   Keliling PP : " + a.hitungKeliling(3.6,8));
        System.out.println("c. Luas PP     : " + a.hitungLuas(6,8.3));
        System.out.println("   Keliling PP : " + a.hitungKeliling(6,8.3));
        System.out.println("d. Luas PP     : " + a.hitungLuas(5.6,8.8));
        System.out.println("   Keliling PP : " + a.hitungKeliling(5.6,8.8));
        
        //Persegi
        System.out.println();
        System.out.println("Persegi (P)");
        Persegi b =  new Persegi();
        System.out.println("a. Luas P      : "+ b.hitungLuas(4.5));
        System.out.println("   Keliling P  : "+ b.hitungKeliling(4.5));
        System.out.println("b. Luas P      : "+ b.hitungLuas(7));
        System.out.println("   keliling P  : "+ b.hitungKeliling(7));
        
        //Lingkaran
        System.out.println();
        System.out.println("Lingkaran (L)");
        Lingkaran c = new Lingkaran();
        System.out.println("a. Luas L      : "+ c.hitungLuas(5));
        System.out.println("   Keliling L  : "+ c.hitungKeliling(5));
        System.out.println("b. Luas L      : "+ c.hitungLuas(7.4));
        System.out.println("   Keliling L  : "+ c.hitungKeliling(7.4));
        
        //Segitiga
        System.out.println();
        System.out.println("Segitiga (S)");
        Segitiga d = new Segitiga();
        System.out.println("a. Luas S      : "+ d.hitungLuas(8,10));
        System.out.println("   Keliling S  : "+ d.hitungKeliling(8,10));
        System.out.println("b. Luas S      : "+ d.hitungLuas(8,11.5));
        System.out.println("   Keliling S  : "+ d.hitungKeliling(8,11.5));
        System.out.println("c. Luas S      : "+ d.hitungLuas(12.2,9));
        System.out.println("   Keliling S  : "+ d.hitungKeliling(12.2,9));
        System.out.println("d. Luas S      : "+ d.hitungLuas(13.9,20.7));
        System.out.println("   Keliling S  : "+ d.hitungKeliling(13.9,20.7));
    }
}