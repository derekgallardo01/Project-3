import java.util.*;

public class English extends Major {

   // Two additional private members

   private boolean englishProficienyRequired;
   private boolean foreignLanguageRequired;
   
   // English Major Constructor
   
   public English (String majorName, double minimumGPA, int creditsRequired, boolean englishProficienyRequired, boolean foreignLanguageRequired) {
      super(majorName, minimumGPA, creditsRequired);
      this.foreignLanguageRequired = foreignLanguageRequired;
      this.englishProficienyRequired = englishProficienyRequired;
   }
   
   // Two extra getters and setters
   
   public boolean getEnglishRequirement() {
      return englishProficienyRequired;
   }
   
   public boolean getForeignLanguageRequirement() {
      return foreignLanguageRequired;
   }
   
   public void setEnglishRequirement (boolean englishProficienyRequired) {
      this.englishProficienyRequired = englishProficienyRequired;
   }
   
   public void setForeignLanguageRequirement (boolean foreignLanguageRequired) {
      this.foreignLanguageRequired = foreignLanguageRequired;
   }
   
   // Override toString method
   
    @Override
    public String toString() {
        return getMajorName() + " " + getMinimumGPA() + " " + getCreditsRequired() + " " + this.englishProficienyRequired + " " + this.foreignLanguageRequired;  
    }
    
    // OPverride Equals method
    
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