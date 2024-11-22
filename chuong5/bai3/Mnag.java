package bai3;

import java.util.HashMap;

public class Mnag {

	public static void main(String[] args) {
        
        String[] sentences = {
            "learn java by example",
            "guide to advance java",
            "example of distributed in java"
        };
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        int totalWords = 0; 
        
     
        for (String sentence : sentences) {
            
            String[] words = sentence.split("\\s+");  
            
            
            for (String word : words) {
    
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
                totalWords++;
            }
        }
                for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
        System.out.println("Total words: " + totalWords);
    }

}
