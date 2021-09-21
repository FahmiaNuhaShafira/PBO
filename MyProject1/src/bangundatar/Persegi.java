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
public class Persegi {
    public int sisi;
    
    public void hitungLuas(){
        int hasil = sisi * sisi;
        System.out.println("Luas Persegi: " + hasil);
    }
    
    public void hitungKeliling(){
        int hasil = 4 * sisi;
        System.out.println("Keliling Persegi: " + hasil);
    }
 
    
}
