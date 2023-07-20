import java.util.*;

public class Major {

   // Private members to be shared among other majors
   
   private String majorName;
   private double minimumGPA;
   private int creditsRequired;
   
  // Major Constructors
   
  public Major (String majorName, double minimumGPA, int creditsRequired) {
      this.majorName = majorName;
      this.minimumGPA = minimumGPA;
      this.creditsRequired = creditsRequired;		 
   }
   
   // Getters & Setters 
   
   public String getMajorName() {
      return majorName;
   }
   
   public void setMajorName(String majorName) {
      this.majorName = majorName;
   }
   
   public double getMinimumGPA() {
      return minimumGPA;
   }
   
   public void setMinimumGPA(double minimumGPA) {
      this.minimumGPA = minimumGPA;
   }
   
   public int getCreditsRequired() {
      return creditsRequired;
   }
   
   public void setCreditsRequired(int creditsRequired) {
      this.creditsRequired = creditsRequired;
   }
   
   // Override equals method
   
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
        return Double.compare(minimumGPA, n.minimumGPA) == 0 && Integer.compare(creditsRequired, n.creditsRequired) == 0;
               
          }
          
    // Override toString method      
    
    @Override
    public String toString() {
        return this.majorName + " " + this.minimumGPA + " " + this.creditsRequired;
        
    }               
  }