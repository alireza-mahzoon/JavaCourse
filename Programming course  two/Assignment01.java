package inlämningsuppgift2;
import java.util.Scanner;

public class Assignment01 {
  public static void main(String[] args) {
    Assignment01main a;
      a = () ->
      { 
        boolean isLeapyear = false;
        while(isLeapyear  == false) {
          Scanner myObj = new Scanner(System.in);
          int year;
          System.out.println("Mata in ett år mellan 2012-2060:");
          year = myObj.nextInt();
        
        int x = year % 4;
        int y = year % 100;
        int z = year % 400;
        if((x == 0) & (y != 0 )|| z == 0)
        { 
          //When a user enter a leap year the program will be finished
          System.out.println(year + " är skottår");
          isLeapyear = true;
        }
        else 
        { 
        //When a user does not enter a leap year the program keep asking
          System.out.println(year + " är inte skottår ");
          isLeapyear = false;
        }
        }
      };
      a.isleapornot();      
}
}

