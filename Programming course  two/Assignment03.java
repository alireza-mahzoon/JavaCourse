package inlämningsuppgift2;
import java.util.HashSet;

public class Assignment03 {
  
  public static void main( String[] args )
  {
    //Defining 8 sets with two elements, betyg for Svenska and betyg for Engelska. 7 sets for students and one set is defined as Godkänd to be used for comparision.
    HashSet<String> setelever1 = new HashSet<String>();
    setelever1.add("GS");
    setelever1.add("GE");
    
    HashSet<String> setelever2 = new HashSet<String>();
    setelever2.add("US");
    setelever2.add("GE");
    
    HashSet<String> setelever3 = new HashSet<String>();
    setelever3.add("GS");
    setelever3.add("GE");
    
    HashSet<String> setelever4 = new HashSet<String>();
    setelever4.add("GS");
    setelever4.add("UE");
    
    HashSet<String> setelever5 = new HashSet<String>();
    setelever5.add("US");
    setelever5.add("UE");
    
    HashSet<String> setelever6 = new HashSet<String>();
    setelever6.add("US");
    setelever6.add("UE");
    
    HashSet<String> setelever7 = new HashSet<String>();
    setelever7.add("GS");
    setelever7.add("GE");
    
    HashSet<String> setgodkändG = new HashSet<String>();
    setgodkändG.add("GS");
    setgodkändG.add("GE");
    
    // Snitt, store the number of elements which exist in both elev set and godkänd set to 
    int [] jamför = new int[7];
    
    setelever1.retainAll(setgodkändG);
    jamför[0] = setelever1.size();
    setelever2.retainAll(setgodkändG);
    jamför[1] = setelever2.size();
    setelever3.retainAll(setgodkändG);
    jamför[2] = setelever3.size();
    setelever4.retainAll(setgodkändG);
    jamför[3] = setelever4.size();
    setelever5.retainAll(setgodkändG);
    jamför[4] = setelever5.size();
    setelever6.retainAll(setgodkändG);
    jamför[5] = setelever6.size();
    setelever7.retainAll(setgodkändG);
    jamför[6] = setelever7.size();
    
    int eleverSomHarFåttGodkändaISvenskaEllerEngelska = 0;
    int eleverSomHarFåttGodkändaIBådaSvenskaEngelska = 0;
    int eleverSomHarFåttGodkändaINågonKurs = 0;
        
    for(int i = 0; i<7; i++) {
      if (jamför[i] == 1) 
      {
        eleverSomHarFåttGodkändaISvenskaEllerEngelska = eleverSomHarFåttGodkändaISvenskaEllerEngelska + 1;
      }
      else if(jamför[i] == 2)
      {
        eleverSomHarFåttGodkändaIBådaSvenskaEngelska = eleverSomHarFåttGodkändaIBådaSvenskaEngelska + 1;   
      }
      else
      {
        eleverSomHarFåttGodkändaINågonKurs = eleverSomHarFåttGodkändaINågonKurs + 1;
      }
       
    }
    
    //Printing the result
    System.out.println("elever som har fått godkända i Svenska eller Engelska:  " +       eleverSomHarFåttGodkändaISvenskaEllerEngelska);
    System.out.println("elever som har fått godkända i båda Svenska Engelska " +  eleverSomHarFåttGodkändaIBådaSvenskaEngelska);
    System.out.println("elever som har fått godkända i någon Kurs " +  eleverSomHarFåttGodkändaINågonKurs);
    }
   }

