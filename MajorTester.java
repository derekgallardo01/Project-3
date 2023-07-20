//***********************************************************************************************************************************************
//
//  Name: Derek Gallardo
//  Date: July 5th, 2022
//  Version: 1.0.0
//  Programming Language: Java
//  Java Version: 17
//  Description: Create a class for a Major that can be extended for a variety of different college majors using inheritance.
//
//***********************************************************************************************************************************************

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class MajorTester {

public static void main(String[] args) {

      // Define & Construct List of Majors
      Major m = new Major("Default Major", 2.0, 120);
      ComputerScience n = new ComputerScience("Computer Science", 3.0, 120);
      ComputerScience o = new DataScience("Data Science", 3.1, 120, false, false);
      ComputerScience p = new DataScience("Data Science", 3.1, 120, false, false);
      English e = new English("English", 3.2, 120, true, false);

      // Print content of Majors
      System.out.println(m.toString());
      System.out.println(n.toString());
      System.out.println(o.toString());
      System.out.println(p.toString());
      System.out.println(e.toString());
     // ((DataScience)o).setIsMajorFull(true);
      System.out.println("Do you need to fluent in English to major in English? " + e.getEnglishRequirement());
      System.out.println("Is Data Science at full capacity? " + ((DataScience)o).getIsMajorFull());
      System.out.println("Do these majors have equal values? " + o.equals(p));
      
      // Create an Array of Major and print the Array List.
      ArrayList<Major> majorList = new ArrayList<Major>();
      majorList.add(m);
      majorList.add(n);
      majorList.add(o);
      majorList.add(e);
      System.out.println(majorList);

   }
}