import java.util.*; 
import java.io.*;

class Function {  
  private int[] primes = new int[10000];
  int PrimeMover(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
	  return primes[num];
  } 
  
  void createPrimes() {
    primes[0] = 2;
    primes[1] = 3;
    
  int i=1;
  int j=2;
  int p1 = 0;
  do{
     p1=i*6+1;
     int p2=i*6-1;
     boolean vp1=true;
     boolean vp2=true;
     int r=0;
     for(r=0;r<j;r++)
     {
         if(p1%primes[r]==0) vp1=false;
         if(p2%primes[r]==0) vp2=false;
         if(!vp1&&!vp2) break;
         if( (int) Math.sqrt(p1)< primes[r] && (int) Math.sqrt(p2) < primes[r] ) r = j-1 ;
     }
     if(r==j)
     {
       if(vp2)primes[j++]=p2;
       if(vp1)primes[j++]=p1;
     }
     i++;
  }while(p1<10000);
  }
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.PrimeMover(s.nextLine())); 
  }   
  
}








  