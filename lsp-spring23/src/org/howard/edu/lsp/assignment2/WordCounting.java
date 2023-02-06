package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
//import java.io.FileNotFoundException;

public class WordCounting {

	public static void main(String[] args) throws Exception {
	    File file = new File("C:\\Users\\Jay Byrd\\git\\LSP_Falcon\\lsp-spring23\\src\\main\\java\\resources\\words.txt");
	    Scanner sc = new Scanner(file);
	    ArrayList<String> words = new ArrayList<>();
	    List<String> counted_w = new ArrayList<>();
	    int counter = 0;
	    
	    while (sc.hasNext()) {
	    	String nxt_word = sc.next();
	        System.out.print(nxt_word +" ");
	        try {
	        	Integer.parseInt(nxt_word);
	        	} catch (Exception e) {
	    	        if (nxt_word.length() > 3) {
	    	        	words.add(nxt_word);
	    	        }
	        	}

	    }
	    System.out.println(" ");
	    System.out.println(" ");
        for (int i = 0; i < words.size(); i++) {
        	String word1 = words.get(i);
        	word1 = word1.toLowerCase();
            if (!(counted_w.contains(word1))) { 
                counted_w.add(word1);
            	for (int j = 0; j < words.size(); j++) {
            		String word2 = words.get(j);
                	word2 = word2.toLowerCase();             	
            		if (word1.equals(word2)) {
                    	counter++;
            	}
            }
        System.out.println(word1 +" "+ Integer.toString(counter));
	    }
        counter = 0;              
	}
        
  }
}

	


