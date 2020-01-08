
package inlupp1;

import java.util.Arrays;

public class MinaMetoder
{
    public static void visaPersoner(int bostadinfo[][]){
        
        for(int j = 0; j<9; j++){
                
             System.out.printf("%-30.30s  %-30.30s%n", bostadinfo[0][j], bostadinfo[1][j]);
        } 
    }
    
    public static double average(double [] input)
    {
        double total = 0;
        double num = 0;
        for(int counter = 0; counter < input.length; counter++){
            total = (int) (total + input[counter]);
            num = num + 1;
        }
        double Medellägden = (total/num);
        return Medellägden;
    }
    
    public static int kostand(int kilometer) {
                
               int result = 850 + 9*kilometer;
               return result;
    }
    
    public static void visaBook( String[][]books, int[][]pris)
    {
        int count = 1;
        String allbooks[] = new String[8]; 
        System.out.print("------Före sortering------");
        System.out.println(" ");
        for(int i=0; i<books.length; i++)
        {
            for(int j = 0; j<books[i].length;j++)
            {
                System.out.print(count + "." + books[i][j] + "," + pris[i][j] + " kr\n"); 
                allbooks[count-1] =  books[i][j] + "," + pris[i][j] + " kr\n";
                count++;  
            }   
        }
    
        String temp;
        
        for (int i = 0; i < allbooks.length; i++)
        {
            for (int j = i + 1; j < allbooks.length; j++)
            {
                if (allbooks[i].compareTo(allbooks[j]) > 0)
                {
                    temp = allbooks[i];
                    allbooks[i] = allbooks[j];
                    allbooks[j] = temp;
                }
            }  
        }
        
        System.out.println(" ");
        System.out.print("------Eftre sortering------");
        System.out.println(" ");
        int counter = 1;
        for(int i = 0; i<allbooks.length;i++){
            
            System.out.print( counter + "." + allbooks[i]);
            counter++;
        }    
    }   
    }
    
    

