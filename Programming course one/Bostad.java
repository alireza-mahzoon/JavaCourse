
package inlupp1;

public class Bostad {
    
    public static void main(String[] args) {
           
    int [][] bostadinfo =
    {{10,20,30,40,50,55,60,65,70},
     {21,46,78,111,179,268,358,440,500},
    }; 
    System.out.printf("%-30.30s  %-30.30s%n", "Ålder", "Antal personer");
    
    MinaMetoder callinfo = new MinaMetoder();
    callinfo.visaPersoner(bostadinfo);
    
    };
     
}


