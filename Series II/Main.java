import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{Scanner in=new Scanner(System.in);
     int n=in.nextInt();
		int a=6,b=5;
     for(int i=0;i<n;i++)
      {System.out.print(a+" ");
       a=a+b;
       b=b+5;
      
      }
	}
}