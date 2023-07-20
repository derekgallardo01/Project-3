import java.util.*;

public class DataScience extends ComputerScience {

   // Two Extra Private Members

   private boolean fullCapacity;
   private boolean csPrerequisitiesRequired;
   
   // DS Constructor
   
   public DataScience(String majorName, double minimumGPA, int creditsRequired, boolean fullCapacity, boolean csPrerequisitiesRequired) {
      super(majorName, minimumGPA, creditsRequired);
      this.fullCapacity = fullCapacity;
      this.csPrerequisitiesRequired = csPrerequisitiesRequired;
   }
   
   // Two extra getters and setters
   
   public boolean getIsMajorFull() {
      return fullCapacity;
   }
   
   public void setIsMajorFull(boolean fullCapacity) {
      this.fullCapacity = fullCapacity;
   }
   
   public boolean getCSPrerequisitiesRequired() {
      return csPrerequisitiesRequired;
   }
   
   public void setCSPrerequisitiesRequirement(boolean csPrerequisitiesRequired) {
      this.csPrerequisitiesRequired = csPrerequisitiesRequired;
   }
   
   // Override toString method
   
    @Override
    public String toString() {
        return getMajorName() + " " + getMinimumGPA() + " " + getCreditsRequired() + " " + this.fullCapacity + " " + this.csPrerequisitiesRequired;  
    }
    
    // Override Equals method
    
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

}