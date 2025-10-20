/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity3;

/**
 *
 * @author Karux
 */

public class account {
    
    private  int accnumber;
    private double balance;
    
    public void setaccnumber(int accnum){
        accnumber = accnum;
    }
    
    public int getaccnumumber(){
        return accnumber;
        
    }
    public void setbalance(double balanc){
        balance = balanc;
    }
    
    public double getbalance(){
    return balance;
}
    public void debit(double Debt){
        
        if(Debt > balance){
            
            System.out.println("you cannot withdraw the amount of money");
        }
    
        else {
            balance = getbalance() - Debt;
            System.out.println("withdraw succeeded, your new balance is : "+ balance);
        }
        
        
    }
}