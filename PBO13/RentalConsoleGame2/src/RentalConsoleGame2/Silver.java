/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalConsoleGame2;

/**
 *
 * @author FAHMIANUHA
 */
public class Silver extends Membership{
    private int rentalCost, point, discount, tempCost, discAmount, totCost;
    
    public void setRentalCost (int a){
        this.rentalCost = a;
    }
    
    public void setPoint (int b){
        this.point = b;
    }
    
    public void setDiscount (int c){
        this.discount = c;
    }
    
    Silver() {
        setRentalCost (25000);
        setPoint      (1);
        setDiscount   (1);
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
