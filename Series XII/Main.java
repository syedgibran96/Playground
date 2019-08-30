import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a= 9;
      int b=11;
      int c=0;
      System.out.print(a+" ");
      System.out.print(b+" ");
      for (int i=0;i<n-2;i++)
      {
        c=a+b;
        a=b;
        b=c;
        System.out.print(c+" ");
      }
	}
}