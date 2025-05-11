/*
 * You are given an array arr[] of non-negative numbers.
 * Each number tells you the maximum number of steps you can jump forward from that position.
 * You need to find if you can cross the array
 * are 
 * Example
 * 1,2,4,1,1,0,2,5
 */

import java.util.*;

public class Main{

    // pascalcase
    public static String largestEvenLetteredWord(String sentence)
    {
          String[] words =sentence.split(" ");
          ArrayList<String> evenWords = new ArrayList<>();
        
          for(int i=0;i<words.length;i++)
          {
            if(words[i].length()%2==0)
            {
                evenWords.add(words[i]);
            }
          }
          
          String largestword="";
          for(int i=0;i<evenWords.size();i++)
          {
            if(largestword.length()<evenWords.get(i).length()){
                largestword=evenWords.get(i);
            }
          }
          return largestword;
    }
    public static void main(String args[]){
        String sentence1 = "I am a good boy";
        String sentence2 = "The woods lovely dark and deep but i have promises to keep, and miles to go before i sleep";

       String result =  largestEvenLetteredWord(sentence1);
       System.out.println(result); 



    }    
}