import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a1=5,a2;
      System.out.print(a1+" ");
      for(int i=0;i<n-1;i++)       
      {a2=a1+(11*((i*2)+1));
        a1=a2;
       System.out.print(a2+" ");
      }
	}
}