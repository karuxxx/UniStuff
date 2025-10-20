/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author Karux
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        String name,country;
        int age;
        
        System.out.println("name: ");
        name=scan.next();
        System.out.println("age: ");
        age=scan.nextInt();
        System.out.println("country: ");
        country=scan.next();
        person obj=new person();
        
        obj.setName(name);
        obj.setage(age);
        obj.setcountry(name);
        
        
        System.out.println("your name: "+obj.getName());
        System.out.println("your age: "+obj.getage());
        System.out.println("your country: "+obj.getcountry());
    }
}
