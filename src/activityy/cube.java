
package activityy;


public class cube extends shape {
    private double area;
    private double volume;
    private double parameter;
   
    
    
    public void volume(){
        
        volume=super.getlength()*super.getlength()*super.getlength();
        
    }
        public void setareacube(double area){
            
            this.area=area=6*(super.getlength()*super.getlength());
        
        
    }
        public double getarea(){
            
            
            return area;
        }
       public void setvolume(double volume){
           
           this.volume=   volume=super.getlength()*super.getlength()*super.getlength();
           
       }
       public double getvolume(){
           
           return volume;
       }
         public void setparameter(double parameter){
             
             this.parameter=parameter=12*(super.getlength()*super.getlength());
         }
         public double getparameter(){
             
             return parameter;
         }
         public void display(){
             
             
         }
}
