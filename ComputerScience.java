import java.io.*;

public class ComputerScience extends Major {


   // CS Constructor
   public ComputerScience(String majorName, double minimumGPA, int creditsRequired) {
      super(majorName, minimumGPA, creditsRequired);

   }
   
   // Override Equals Method
   
   @Override
    public boolean equals(Object m) {
 
           if (m == this) {
            return true;
        }
 
        if (!(m instanceof Major)) {
            return false;
        }
         
        // typecast o to Major so that we can compare data members
        Major n = (Major) m;
         
        // Compare the data members and return accordingly
        return Double.compare(getMinimumGPA(), n.getMinimumGPA()) == 0 && Integer.compare(getCreditsRequired(), n.getCreditsRequired()) == 0;
               
          }
          
    // Override toSting method
    @Override
    public String toString() {
        return getMajorName() + " " + getMinimumGPA() + " " + getCreditsRequired();
        
    } 
    
  
}