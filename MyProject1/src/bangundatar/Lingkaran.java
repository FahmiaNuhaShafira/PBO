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
public class Lingkaran {
    public int r;
    
    public void hitungLuas(){
        double hasil = Math.PI * r * r;
        System.out.println("Luas Lingkaran: " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil = 2 * Math.PI * r;
        System.out.println("Keliling Lingkaran: " + hasil);
    }
    
}
