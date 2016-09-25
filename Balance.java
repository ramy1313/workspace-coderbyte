import java.util.*; 
import java.io.*;

class Function {  
  int BracketMatcher(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    if (str.indexOf('(') == -1 && str.indexOf(')') == -1) return 1;
    Stack<Character> stack = new Stack<Character>();
    for (int i=0; i<str.length(); i++) {
      char c = str.charAt(i);
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        if(stack.empty())
                return 0;
            else if(stack.peek() == '(')
                stack.pop();
            else
                return 0;
      }
    }
    return stack.empty()? 1:0;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.BracketMatcher(s.nextLine())); 
  }   
  
}








  