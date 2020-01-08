package inlämningsuppgift2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment02 {

  public static void main(String[] args) {
    Map<String, Integer> id = new HashMap<String, Integer>();
    id.put("Statlig sektor", 38600 );
    id.put( "kommunal sektor", 36000);
    id.put("Landstingssektorn", 37600 );
    id.put("Privat sektor", 42300);
    id.put("Privatanställda tjänstemän", 42300);
    
    id.entrySet().forEach(entry->{
      System.out.println(entry.getKey() + " " + entry.getValue() + " kr");  
    });

    //visar hela listan på skärmen och beräknar genomsnittslöner 
    System.out.println();
    Integer[] valueInt = id.values().toArray(new Integer[id.size()]);
    int sum = 0;
    for (int i = 0; i<valueInt.length;i++) {
      sum = sum + valueInt[i];
    }
    System.out.println("genomsnittslöner: " + sum/valueInt.length);
    
    //sorterar löner i stigande ordning
    System.out.println();
    boolean sorted = false;
    int temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < valueInt.length - 1; i++) {
            if (valueInt[i] > valueInt[i+1]) {
                temp = valueInt[i];
                valueInt[i] = valueInt[i+1];
                valueInt[i+1] = temp;
                sorted = false;
            }
        }
    }
    System.out.println("löner i stigande ordning: " + Arrays.toString(valueInt));
    
    //löner som tjänar mera än 40000 kr
    System.out.println();
    System.out.println("löner som tjänar mera än 40000:");
    for(int j = 0; j < valueInt.length; j++) {
      if(valueInt[j]>40000) {
        System.out.println(+ valueInt[j]);
      }
    }
    }
  }



