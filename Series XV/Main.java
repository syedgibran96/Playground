import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a1=3,a2=8,a3;
      System.out.print(a1+" ");
      System.out.print(a2+" ");
      for(int i=2;i<n;i++)       
      {a3=a1+a2+i;
        a1=a2;
        a2=a3;
       System.out.print(a2+" ");
      }
	}
}
