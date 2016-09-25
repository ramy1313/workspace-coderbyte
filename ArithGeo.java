import java.util.*; 
import java.io.*;

class ArithGeo {  
  String ArithGeom(int[] arr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    int multiId = 1;
    int addId = 0;
    boolean arith = true, geo = true;
    for (int i=1; i<arr.length; i++) {
      if(i == 1) {
        multiId = arr[i]/arr[i-1];
        addId = arr[i] - arr[i-1];
      } else if (multiId != arr[i]/arr[i-1]) {
    	 geo =false;
      } else if (addId != arr[i] - arr[i-1]) {
    	  arith = false;
      }
    }
    if (arith) return "Arithmetic";
    if (geo) return "Geometric";
    return "-1";
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    ArithGeo c = new ArithGeo();
    System.out.print(c.ArithGeom(new int[] {1,2,3,100})); 
  }   
  
}








  