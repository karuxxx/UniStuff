
package activityy;

public class square extends shape {
    
    private double area;
    private double parameter;
  
    public void setarea(double area){
        
        this.area= 2*super.getlength();
        
    }
    public double getarea(){
        
        
        return area;
    }
    public void setparameter(double parameter){
        
        
        this.parameter=parameter=4*super.getlength();
    }
    public double getparameter(){
        
        return parameter;
    }
    public void display() {
    
        System.out.println("name of the square: "+getname());
        System.out.println("color of the square: "+getcolor());
        System.out.println("area of the square: "+getarea());
        System.out.println("parameter of the square: "+getparameter());
        
        
}
    
    void setname(){
        
        
    }
    
}
