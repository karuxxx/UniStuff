/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

import java.util.Scanner;

/**
 *
 * @author Karux
 */
public class main {
    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          String brand,processor;
          double ramsize,ramupgrade;
          
          System.out.println("brand: ");
          brand=scan.next();
          System.out.println("processor: ");
          processor=scan.next();
          System.out.println("ramsize: ");
          ramsize=scan.nextDouble();
          
          Desktop obj=new Desktop();
        obj.setBrand(brand);
        obj.setprocessor(processor);
        obj.setramsize(ramsize);
        
        System.out.println("upgrade your ram: ");  
         double upgrade=scan.nextDouble();
          obj.setramupgrade(upgrade);
          
          System.out.println("your brand is: "+obj.getBrand());
          System.out.println("your processor is: "+obj.getprocessor());
          System.out.println("your ramsize is: "+obj.getramsize());
          System.out.println("your new ramsize: "+obj.getramupgrade());
    }
}
