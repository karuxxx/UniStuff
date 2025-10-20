/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

/**
 *
 * @author Karux
 */
public class Desktop {
    private String brand;
    private String processor;
    private double ramsize;
    private double ramupgrade;
    
    public void setBrand(String b)
    {
        
        
        
        brand=b;
        
        
    }
    
    public String getBrand(){
        
        
        
        return brand;
    }
    
    
    public void setprocessor(String p){
        
        
        
        
        
        processor=p;
        
    }
    
    
    public String getprocessor(){
        
        
        
        return processor;
    }
    
    
   public void setramsize(Double RS){
       
       
       ramsize=RS;
   } 
   public Double getramsize(){
       
       
       
       return ramsize;
   }

   public void setramupgrade(double up){
       
       
       ramupgrade=getramsize()+up;
       
   }
   
   public double getramupgrade(){
       
       
       
       return ramupgrade;
   }
}