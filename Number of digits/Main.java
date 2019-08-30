import java.util.Scanner;
class Main
{
  
  public static int no(int n)
  {
    int i=0;
    if(n!= 0)
    {i++;
   
   return i+ no(n/10);
  }
    else return 0;
  }
    public static void main(String args[])
    {
        //fill your code;
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int res =no(n);
      System.out.println("The number of digits in "+n+" is "+res);
      
    }
    }
