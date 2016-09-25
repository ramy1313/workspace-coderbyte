import java.util.*; 
import java.io.*;

class CountLetters {  
  String LetterCount(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String[] words = str.split(" ");
    int[] counts = new int[words.length];
    int max = -1;
    for (int i=0; i<words.length; i++) {
      counts[i] = 0;
      StringBuilder prev = new StringBuilder();
      for (int j=0; j<words[i].length(); j++) {
        int charCount = 0;
        char currentChar = words[i].charAt(i);
        if (prev.toString().indexOf(currentChar) != -1) continue;
        prev.append(currentChar);
        for (int k=j+1; k< words[i].length(); k++) {
          if (currentChar == words[i].charAt(k)) {
            charCount++;
          }
        }
        if (charCount > counts[i]) counts[i] = charCount;
      }
      if (max == -1 && counts[i] > 0) max = i;
      else if (max != -1 && counts[i] > counts[max]) max =i;
    }
    
    if (max == -1) return "-1";
    return words[max];
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    CountLetters c = new CountLetters();
    System.out.print(c.LetterCount("Hello apple pie")); 
  }   
  
}








  