package Langugae;

import java.util.ArrayList;
import Utility.Diction;

public class Runner {


	private static ArrayList<String> GetWordsFromString(String prefix, String str) {
	    int n = str.length();
	    ArrayList<String> myList = new ArrayList<String>(); 
	    myList.add(prefix);
	    if(n > 0) {
	
	        for (int i = 0; i < n; i++) {
	       
	        	GetWordsFromString(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1,n));
	        }
	        
	    	for (int j = 0; j < myList.size(); j++) {
	    		System.out.println(myList.get(j));
			}
            
	    }
		return myList;}

	public static void main(String[] args) throws InterruptedException {

		Diction Dic = new Diction();
		ArrayList<String> Words = new ArrayList<String>(); 
	
		
		
		String Keyword = "WORKING";
		// Get all the possible combination of words with the String
		Words = GetWordsFromString("", Keyword);
     for (int j = 0; j < Words.size(); j++) { 
    	 
			 /*Verify if the generated words format is English word */
			 if(Dic.isEnglishWord(Words.get(j))==true) 
			 {
		     //System.out.println(Words.get(j)); 
            }
          }
	}

}
