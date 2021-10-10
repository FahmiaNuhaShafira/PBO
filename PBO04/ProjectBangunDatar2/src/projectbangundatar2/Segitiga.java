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
public class Segitiga {
    
    //a = alas
    //t = tinggi
    static double sisiMiring(double a, double t) {
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(t, 2)));
    }
    
    //Hitung Luas
    double hitungLuasS(int a, int t) {
        return ((a * t) / 2);
    }
    
    double hitungLuasS(int a, double t) {
        return ((a * t) / 2);
    }
    
    double hitungLuasS(double a, int t) {
        return ((a * t) / 2);
    }
    double hitungLuas(double a, double t){
        return(a * t / 2);
    }
    
    //Hitung Keliling
    double hitungKeliling(int a, int t) {
        double SisiMiring = sisiMiring(a, t);
        return (a + t + SisiMiring);
    }
    
    double hitungKeliling(int a, double t) {
        double SisiMiring = sisiMiring(a, t);
        return (a + t + SisiMiring);
    }
    
    double hitungKeliling(double a, int t) {
        double SisiMiring = sisiMiring(a, t);
        return (a + t + SisiMiring);
    }
    
    double hitungKeliling(double a, double t) {
        double SisiMiring = sisiMiring(a, t);
        return (a + t + SisiMiring);
    }
}