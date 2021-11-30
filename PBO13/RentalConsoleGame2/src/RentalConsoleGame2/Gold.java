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
public class Gold extends Silver {
    private int cashback;
    
    public void setCashback (int cb){
        this.cashback = cb;
    }
    
    public int getCashback (){
        return this.cashback ;
    }
    
    Gold() {
        setRentalCost  (30000);
        setPoint       (5);
        setDiscount    (2);
        setCashback    (5000);
    }
    
      
}
