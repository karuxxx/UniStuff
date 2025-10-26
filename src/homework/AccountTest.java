/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author Karux
 */
public class AccountTest {
    public static void main(String[] args) {
       Account acc1=new Account(101,500.0);
       Account acc2=new Account(102,1000.0);
       acc1.setDeposit(200);
        acc2.setDebit(100);
        
         System.out.println("Account 1 - ID: " + acc1.getID() + ", Balance: " + acc1.getbalance());
        System.out.println("Account 2 - ID: " + acc2.getID() + ", Balance: " + acc2.getbalance());
      
    }
    
}
