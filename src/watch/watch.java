/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watch;

/**
 *
 * @author Karux
 */
public class watch {
    
    
    private int hour;
    private int minute;
    private int second;
   
    
    
    public watch(){
        
        
        
    }
    public watch(int hour, int minute){
        
       this(hour,minute,0);
       
        
        
    }
      public watch(int hour, int minute, int second){
        
      this.hour = hour;
        this.minute = minute;
        this.second = second;
        
    
    }
    
 public watch(int hour){
     this(hour,0,0);
     
 }
 public void sethour(int hour){
              this.hour=hour;
            
          }
 public void setminute(int minute){
  this.minute=minute;   
 }
 public void setsecond(int second){
     
  this.second=second;
 }
 public int gethour(){
     return hour;
 }
 public int getminute(){
     return minute;
     
 }
 public int getsecond(){
     return second;
 }
          void display(){
            
              System.out.println(gethour()+":"+getminute()+":"+getsecond()+":");
            
            
        }
          
          
          }
          

