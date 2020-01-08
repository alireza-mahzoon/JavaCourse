
package inlupp1;
import java.util. Scanner;
public class Skolresa {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);
        System.out.println("Ange antal dagar: ");
       
          while(true){
            int sum = 0;
            
            int number = input. nextInt();
            for(int i = 1; i <= number ; i++){ 
                
                System.out.println("Dag:" + i); 
                System.out.println("Ange kilometer: ");
                int kilometer = input. nextInt();
                MinaMetoder callcost = new MinaMetoder();
                callcost.kostand(kilometer);
                
                int[] resultat = new int[number + 1];
                resultat[i] = callcost.kostand(kilometer);
                
                sum = sum + resultat[i];
                
                System.out.println( "kostnaden för bi A och B är " + resultat[i] );
     
                if (i == number) {
                    
                System.out.println(" ");  
                System.out.println(i+ " dagar kostar " + sum  + " kr");            
                System.exit(1);
                }
            }           
        }
        
      
        
        } 
    
   
    
    }
    
    

