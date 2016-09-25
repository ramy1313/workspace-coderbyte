import java.util.*; 
import java.io.*;

class Function {  
  String CaesarCipher(String str, int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    StringBuilder output = new StringBuilder();
    num = num % 26 + 26;
    for (int i=0; i<str.length(); i++) {
      char current = str.charAt(i);
      if(Character.isLetter(current)) {
        if (Character.isUpperCase(current)) {
                    current = (char) ('A' + (current - 'A' + num) % 26 );
                } else {
                    current = (char) ('a' + (current - 'a' + num) % 26 );
                }
        //current = (char) ((current + num) % 26 );
      }
      output.append(current);
      
    }
    return output.toString();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.CaesarCipher(s.nextLine())); 
  }   
  
}








  