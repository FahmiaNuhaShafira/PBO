/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author FAHMIANUHA
 */
public abstract class BahanBakar {
    public abstract double hitungBahanBakar();
    public abstract double hitungWaktu();
    
    public void tampilHasil(){
        System.out.println("Jumlah Bahan Bakar yang dibutuhkan : " + this.hitungBahanBakar() + " Liter");
        System.out.println("Waktu perjalanan                   : " + this.hitungWaktu() + " Jam");
    }    
}
