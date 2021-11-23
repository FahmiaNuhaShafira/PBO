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
public class Platinum extends Gold{
    int benefit;
    
    Platinum() {
        rentalCost  = 30000;
        point       = 5;
        discount    = 2;
        cashback    = 5000;
    }
    
    protected int toGetBenefit(int rentalForDuration) {
        
        benefit     = rentalForDuration * 5000;
        return benefit;
    }
}
