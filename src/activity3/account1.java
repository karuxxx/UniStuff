/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity3;

/**
 *
 * @author Karux
 */
import java.util.Scanner;


public class account1 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        account obj1 = new account();
        
        obj1.setbalance(3000000);
        System.out.println("balance: "+obj1.getbalance());
        System.out.println("please enter the ammount to withdraw: ");
        int cash = scan.nextInt();
        obj1.debit(cash);
        
        System.out.println("balance is: "+obj1.getbalance());
        
        
        
        
    }


}