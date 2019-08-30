import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      double a=95.0;
      System.out.print(a+" ");
      a=a+20.5;
       System.out.print(a+" ");
      for(int i=1;i<n-1;i++)       
      {a=a+20.5+(2.0*i);
        System.out.print(a+" ");
      }
	}
}
