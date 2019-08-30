import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner (System.in);
      String a = in.next();
      int i=0;
      for (i = a.length()-1;i>=0;i--)
      {
       System.out.print(a.charAt(i)); 
      }
      
	}
}