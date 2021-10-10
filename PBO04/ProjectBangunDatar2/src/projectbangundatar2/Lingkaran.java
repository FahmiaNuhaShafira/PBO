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
public class Lingkaran {
    
    double phi = 3.14;
    
    //Hitung Luas
    double hitungLuas(int r){
        return(phi * r * r);
    }
    
    double hitungLuas(double r){
        return(phi * r * r);
    }
    
    //Hitung Keliling
    double hitungKeliling(int r){
        return(2 * phi * r);
    }
    
    double hitungKeliling(double r){
        return(2 * phi * r);
    }
}