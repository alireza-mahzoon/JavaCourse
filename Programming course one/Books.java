
package inlupp1;
import java.util.Arrays;

public class Books {
    public static void main(String[] args)
    {
        
        String [][] books = {{"Vänskap", "Algebra", "Statistik", "Didaktik"},
                             {"Vargen", "Oktoberbarn", "Tacksamhet", "Python"}};
        
        int[] [] pris = {{150, 200, 130, 300},
                         {240, 500, 380, 150}};
        
        MinaMetoder callbooks = new MinaMetoder();
        callbooks.visaBook(books, pris);      
    }
}
      

