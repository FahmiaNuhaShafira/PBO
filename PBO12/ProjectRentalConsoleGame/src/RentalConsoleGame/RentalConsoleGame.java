/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalConsoleGame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class RentalConsoleGame extends Membership {

    public static void main(String[] args) {
       
        Silver sm   = new Silver();
        Gold gm     = new Gold();
        Platinum pm = new Platinum();
        
        insertMembership();
        

        String idMembership;
        int dateRental, monthRental, yearRental, dateReturned, monthReturned, yearReturned;
        Scanner input = new Scanner(System.in);
    
        
        // form pengembalian
        System.out.println("PROJECT PENGEMBALIAN CONSOLE GAME");
        System.out.println("=================================");
        
        System.out.print("\nMasukkan ID Member                        : ");
        idMembership = input.nextLine();
        
        System.out.print("Masukkan Tanggal Pinjam  (1 - 31)         : ");
        dateRental = input.nextInt();
        
        System.out.print("Masukkan Bulan Pinjam    (1 - 12)         : ");
        monthRental = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam    ( xxxx )         : ");
        yearRental = input.nextInt();
        
        System.out.print("Masukkan Tanggal Kembali (1 - 31)         : ");
        dateReturned = input.nextInt();
        
        System.out.print("Masukkan Bulan Kembali   (1 - 12)         : ");
        monthReturned = input.nextInt();
        
        System.out.print("Masukkan Tahun Kembali   ( xxxx )         : ");
        yearReturned = input.nextInt();
        
        
        // mencari data
        searchMembership(idMembership);
        
        // tanggal
        System.out.println("\nTanggal Pinjam           : " + dateRental + " - " + monthRental + " - " + yearRental);
        System.out.println("Tanggal Kembali          : " + dateReturned + " - " + monthReturned + " - " + yearReturned);
          
        // durasi
        int rentalForDuration = rentDuration(dateRental, monthRental, yearRental, dateReturned, monthReturned, yearReturned);
        System.out.println("Lama Sewa                : " + rentalForDuration + " hari");
               
        //total biaya       
        String member = getMember(idMembership);
        if(member == "Silver") {
            System.out.println("\nTotal Sewa           : Rp" + sm.costAmount(rentalForDuration));
            System.out.println("Jumlah Poin          : " + sm.toGetPoint(rentalForDuration));
        
        } else if(member == "Gold") {
            System.out.println("\nTotal Sewa           : Rp" + gm.costAmount(rentalForDuration));
            System.out.println("Jumlah Poin          : " + gm.toGetPoint(rentalForDuration));
            System.out.println("Jumlah Cashback      : Rp;" + gm.cashback);
            
        } else {
            System.out.println("\nTotal Sewa           : Rp" + pm.costAmount(rentalForDuration));
            System.out.println("Jumlah Poin          : " + pm.toGetPoint(rentalForDuration));
            System.out.println("Jumlah Cashback      : Rp" + pm.cashback);
            System.out.println("Bonus Pulsa          : Rp" + pm.toGetBenefit(rentalForDuration));
        }
    }    
}
