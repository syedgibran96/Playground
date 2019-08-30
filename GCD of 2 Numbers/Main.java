import java.util.Scanner;
class Main
{
   static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
      	Scanner in = new Scanner(System.in);
      
        int a = in.nextInt(), b = in.nextInt(); 
        System.out.println("G.C.D of " + a +" and " + b + " is " + gcd(a, b)); 
    } 
} 