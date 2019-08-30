import java.util.Scanner;
class Main
{
  
        public static int fact(int a)
      {
          if( a== 1 || a== 0)
            return 1;
        return(a*fact(a-1));
    }
    public static void main(String args[])
    {
        //fill your code;
      Scanner in = new Scanner (System.in);
      int n  = in.nextInt();
      int f = fact(n);
System.out.println("The factorial of "+n+" is "+f);
}
}