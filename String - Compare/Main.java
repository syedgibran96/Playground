import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner (System.in);
      String a = in.next();
      String b =in.next();
      if(a.equals(b))
        System.out.println("Strings are same");
      else
        System.out.println("Strings are not same");
	}
}