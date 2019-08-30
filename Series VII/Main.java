import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=0;i<n;i++)
        if(i%2==0)
          if(i==0)
            System.out.print("1 ");
          else
            System.out.print(Math.pow(3,i/2)+" ");
        else
        System.out.print((2.0*Math.pow(3,i/2))+" ");
	}
}