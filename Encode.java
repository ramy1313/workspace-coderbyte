import java.util.*; 
import java.io.*;

class Function {  
  String RunLength(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    char currentChar = 0;
    int currentCount = 0;
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (currentCount == 0) {
        currentCount++;
        currentChar = str.charAt(i);
      } else if (currentChar == str.charAt(i)) {
        currentCount++;
      } else {
        output.append(currentCount).append(currentChar);
        currentCount = 0;
      }
    }
    output.append(currentCount).append(currentChar);
    return output.toString();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.RunLength(s.nextLine())); 
  }   
  
}








  