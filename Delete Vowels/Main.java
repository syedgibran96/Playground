import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner in = new Scanner (System.in);
      String s = in.next();
     System.out.println(s.replaceAll("[AaEeIiOoUu]", ""));
    }
}
