import java.io.*;
import java.util.*;
import java.text.*;

public class Nested_example{

public static void main(String [] args) throws IOException
{

int total_units;

double total, gradePoints=0;

int units=0;

Scanner scan = new Scanner(System.in);

for (int student=1; student<=5; student++){

      total=0;
      
      total_units=0;
      
      System.out.println("Entering grades (numerical 0-4) for student "+ student);

for(int grade=1; grade<4; grade++){

      System.out.print("Grade "+grade+": ");
      
      gradePoints=scan.nextDouble();
      
      System.out.print("Units: ");
      
      units=scan.nextInt();
      
      while (units>5){

System.out.print("Please entter a number lower than  " +units);
                   } 
      
      total_units+=units;
      
      total+=gradePoints*units;

}

         double GPA=total/total_units;
         
         System.out.println("GPA for student "+student+" is "+GPA);
         
         System.out.println();

                  }

}}