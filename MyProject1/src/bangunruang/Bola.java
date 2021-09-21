/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author FAHMIANUHA
 */
public class Bola {
    public int r;
    
    public void hitungVol(){
        double hasil = (4/3) * Math.PI * r * r * r;
        System.out.println("Volume Bola: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 4 * Math.PI * r * r;
        System.out.println("Luas Selimut Bola: " + hasil);
    }
    
}
