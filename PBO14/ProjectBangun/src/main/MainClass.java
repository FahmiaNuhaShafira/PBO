/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author FAHMIANUHA
 */
public class MainClass {
    public static void main(String[] args){
        System.out.println("=============PROJECT BANGUN=============");
        System.out.println("BANGUN DATAR");
        System.out.println("A. PERSEGI");
        Persegi p1 = new Persegi();
        p1.sisi = 10;
        p1.hitungLuas();
        p1.hitungKeliling();
        p1.tampilHasil();
        
        System.out.println("\nB. LINGKARAN");
        Lingkaran l1 = new Lingkaran();
        l1.r = 14;
        l1.hitungLuas();
        l1.hitungKeliling();
        l1.tampilHasil();
        
        System.out.println("\nC. PERSEGI PANJANG");
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 20;
        pp1.lebar = 10;
        pp1.hitungLuas();
        pp1.hitungKeliling();
        pp1.tampilHasil();
        
        System.out.println("\n\nBANGUN RUANG");
        System.out.println("A. TABUNG");
        Tabung t1 = new Tabung();
        t1.r = 14;
        t1.tinggi = 20;
        t1.hitungVolume();
        t1.hitungLuasPermukaan();
        t1.tampilHasil();
        
        System.out.println("\nB. BALOK");
        Balok b1 = new Balok();
        b1.p = 20;
        b1.l = 10;
        b1.t = 15;
        b1.hitungVolume();
        b1.hitungLuasPermukaan();
        b1.tampilHasil();
        
        System.out.println("\nC. BOLA");
        Bola b2 = new Bola();
        b2.r = 21;
        b2.hitungVolume();
        b2.hitungLuasPermukaan();
        b2.tampilHasil();
    }
}
