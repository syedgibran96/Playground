import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
        if(i%2==1)
        System.out.print(((int)Math.pow(i,2)-1)+" ");
        else
        System.out.print(((int)Math.pow(i,2)-2)+" ");
	}
}