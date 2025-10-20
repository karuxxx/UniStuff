/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watch;

/**
 *
 * @author Karux
 */
import java.util.Scanner;
public class watchTest {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        
 watch T1=new watch();
 
 watch T2=new watch(12,3);
 
 watch T3=new watch(12,10,2);
 watch T4=new watch(12); 
 
        System.out.println("the times are: ");
        T1.display();
        T2.display();
        T3.display();
        T4.display();
        System.out.println("do you want to update the time for the second clock? yes/no");
        String ans=scan.next();
        if (ans.equalsIgnoreCase("yes")){
            System.out.println("enter the new time(hour minute second)");
            int hour=scan.nextInt();
            int minute=scan.nextInt();
            int second=scan.nextInt();
            
            T2.sethour(hour);
            T2.setminute(minute);
            T2.setsecond(second);
            System.out.println("the updated time for T2 is:");
            T2.display();
        }
        else {
            System.out.println("no updates were made");
            
        }
        
     
        }
    }

  
 

