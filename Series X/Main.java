import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=2;
      System.out.print(a+" ");
      for(int i=1;i<n;i++)       
      {a=a*a-1;
        System.out.print(a+" ");
      }
	}
}