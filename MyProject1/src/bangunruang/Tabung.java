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
public class Tabung {
    public int r;
    public int tinggi;
    
    public void hitungVol(){
        double hasil = Math.PI * r * r * tinggi;
        System.out.println("Volume Tabung: " + hasil);
     
    }
    
    public void hitungLuasSelimut(){
        double hasil = 2 * Math.PI * r * tinggi;
        System.out.println("Luas Selimut Tabung: " + hasil);
    }
    
}
