import java.util.*; 
import java.io.*;

class Function {  
  String ArrayAddition(int[] arr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    Arrays.sort(arr);
    int len = arr.length;
    for (int i = 0; i<len - 1; i++) {
      int sum = arr[i];
      for (int j = len -2; j>=i+1; j--) {
        sum += arr[j];
        if (sum == arr[len - 1]) return "true";
        if (sum > arr[len - 1]) sum -= arr[j];
      }
    }
    return "false";
  } 

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ArrayAddition(s.nextLine())); 
  }   
  
}           
