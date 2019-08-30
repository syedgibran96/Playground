import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=0;i<n;i++)
        System.out.print((int)Math.pow((11+4*i),2)+" ");
	}
}