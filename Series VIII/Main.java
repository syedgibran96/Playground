import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=4;
      System.out.print(a+" ");
      for(int i=1;i<n;i++)       
      {a=a+(i*i);
        System.out.print(a+" ");
      }
	}
}
