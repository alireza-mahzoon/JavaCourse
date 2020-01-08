
package inlupp1;

public class fiskar {
    
    public static void main(String[] args) {
        
        double sum = 0;
        System.out.println("Längden på alla fiskar(i cm):");
        double [] fiskaricm = {20, 15, 35, 45, 30, 40, 25, 40, 20, 50};
            for (int i = 0; i < fiskaricm.length; i++){
         double k = fiskaricm[i];
         sum = sum + fiskaricm[i];
         //int Medellängden = (sum/12)
         System.out.print( k +",");   
                
    }   
        System.out.println(); 
        System.out.println("Mata in längden:");    
            for (int i = 0; i < fiskaricm.length; i++){
         double k = fiskaricm[i];
         System.out.print( k +" ");   
    }
        
           //System.out.print( Medellängden ); 
         System.out.println(); 
         
     MinaMetoder callaverage = new MinaMetoder();
     double aVal = callaverage.average(fiskaricm);
     System.out.println("Medellängden " + aVal);
         
    }
}


    
    
    

