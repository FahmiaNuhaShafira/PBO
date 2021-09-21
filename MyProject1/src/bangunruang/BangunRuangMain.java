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
public class BangunRuangMain {
    public static void main(String[] args){
        System.out.println("Bola");
        Bola bola = new Bola();
        bola.r = 14;
        bola.hitungVol();
        bola.hitungLuasSelimut();
        
        System.out.println("\nKerucut");
        Kerucut kerucut = new Kerucut();
        kerucut.r = 21;
        kerucut.s = 20;
        kerucut.tinggi = 40;
        kerucut.hitungVol();
        kerucut.hitungLuasSelimut();
        
        System.out.println("\nTabung");
        Tabung tabung = new Tabung();
        tabung.r = 7;
        tabung.tinggi = 30;
        tabung.hitungVol();
        tabung.hitungLuasSelimut();
    }
    
}
