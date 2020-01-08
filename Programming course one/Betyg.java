package inlupp1;
import java.util.Scanner;


public class Betyg {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
    char [][] betygsskala =
    {{'A','E','D','C','B','A'},
     {'B','F','E','D','A','B'},
     {'C','A','F','E','D','C'},
     {'D','B','A','F','E','D'},
     {'E','C','B','A','F','E'},
    }; 
   
    Scanner input = new Scanner(System.in);
    
    while (true){
         double antal = 0;
         double total = 0;
         double Medelvärde;
         char S = 0;
         
          
    System.out.print("Mata in betygsskala A-F: ");
    
    char betygskala = input.next().charAt(0);
    
            if (betygskala == 'S') {
                System.out.println("STOPP!");            
                System.exit(1);
    }
       /* System.out.println(betygsskala[2][2]);*/
        
        for(int i = 0; i <5; i++){
            for(int j = 0; j<6; j++){
              
                if(betygsskala[i][j]== betygskala){
                antal++;
                }
               total++;
            }
            
        }
         System.out.println("Resultat:" + antal);
         System.out.println("Det finns " + antal + " elever som har fått " + betygskala);
         Medelvärde = (antal/total);
         System.out.println("Betygsmedelsvärde:" + Medelvärde);      
    }    
    }
  
}
