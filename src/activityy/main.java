
package activityy;

import java.util.Scanner;
public class main  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        square obj1= new square();
        cube obj2=new cube();
        System.out.println("enter the length: ");
        double length=input.nextDouble();
        
        
        
        
        
        obj1.setname("square");
         obj1.setarea(9);
        obj1.setparameter(0);
        obj1.setlength(4);
        obj1.setcolor("red");
        
        
                obj2.setareacube(8);
                obj2.setparameter(7);
                obj2.setvolume(5);
                obj2.setname("cube");
                obj2.setlength(9);
                obj2.setcolor("green");
                
                System.out.println("square details: " );
                obj1.display();
                System.out.println("**********************");
                
                System.out.println("cube details: ");
                obj2.display();
                
                
                
    }
    
}
