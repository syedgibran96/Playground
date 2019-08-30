import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int a =2;
      int b =5;
      System.out.println(a);
      System.out.println(b);
      for (int i=1;i<n;i++)
      {
        b=a*b;
       System.out.print((b=b+1)+" ");
      }
	}
}
