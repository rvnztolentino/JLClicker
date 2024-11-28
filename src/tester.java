import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class tester {

    public static void main(String[] args) {
    	
    	ArrayList<ArrayList<String>> FG = new ArrayList();
      
    	ArrayList<String> KOF = new ArrayList();
    	KOF.add("Iori");
    	KOF.add("Shen");
    	KOF.add("Kyo");
    	KOF.add("Terry");
    	KOF.add("Mr. Karate");
    	
    	ArrayList<String> SF = new ArrayList();
    	SF.add("Ken");
    	SF.add("A.K.I.");
    	SF.add("M. Bison");
    	SF.add("Akuma");
    	
    	ArrayList<String> TK = new ArrayList();
    	TK.add("Kazuya");
    	TK.add("Jin");
    	TK.add("Paul");
    	TK.add("Asuka");
    	
    	FG.add(KOF);
    	FG.add(SF);
    	FG.add(TK);
    	
    	// String X = FG.get(0).get(2);
    	// System.out.println(X);
    	
    	for(int i = 0 ; i < FG.size() ; i++) {
    		System.out.println(FG.get(i));
    	}
    }   
}
