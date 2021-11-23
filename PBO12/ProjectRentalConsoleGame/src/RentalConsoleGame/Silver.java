/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalConsoleGame;

/**
 *
 * @author LENOVO
 */
public class Silver extends Membership {
    protected int rentalCost, point, discount, tempCost, discAmount, totCost;
      
    Silver() {
        this.rentalCost = 25000;
        this.point      = 1;
        this.discount   = 1;
    }
   
    protected int costAmount(int rentalForDuration) {        
        tempCost        = rentalForDuration * rentalCost;
        discAmount      = (tempCost * discount) / 100;
        totCost         = tempCost - discAmount;
        
        return totCost;
    }
    
    protected int toGetPoint(int rentalForDuration) {        
        int totPoint    = rentalForDuration * point;
        return totPoint;
    }    
}
