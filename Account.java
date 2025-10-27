/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author Karux
 */
public class Account {
    private int ID;
    private double balance;
    
    public  Account(int ID,double balance){
        
        
        this.ID=ID;
        if(balance>0.0){
            
            
              this.balance=balance;
            
        }
        else{
           this.balance=0.0;
        }
    }
    public int getID(){
        return ID;
    }
    public double getbalance(){
        
        return balance;
    }
    public void setDeposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        
    }
    public void setDebit(double amount){
        
        if(amount>balance){
            
            System.out.println("debit amount exceeded account balance.");
        }
        else{
            balance-=amount;
        }
    }
}

    

