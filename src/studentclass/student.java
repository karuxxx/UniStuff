/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentclass;

/**
 *
 * @author Karux
 */
public class student {
    private String name;
    private int ID=1;
   private int semester;
   private final String department="CE";
   
   public student(String name,String department, int semester){
       
       this.ID=ID;
       this.name=name;
       this.semester=semester;
   }
public void setID(int ID){
    this.ID++;
}
   public int getID(){
       
       return ID;
   }
 
   public String getname(){
       
       
       return name;
   }

   public String getdepartment(){
       
       return department;
   }

 public int getsemester(){
     
     
     return semester;
 }
 void display(){
     
     System.out.println("StudentID:"+ID);
     System.out.println("StudentName:"+name);
     System.out.println("department:"+department);
     System.out.println("semester:"+semester);
 }
}
