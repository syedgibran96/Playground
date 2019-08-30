import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int num [] = new int [n];
      int max=0;
      for (int i =0;i<n;i++)
           {
          num [i] = in.nextInt();
           if(num[i] > max)
             max=num[i];
           }
        System.out.println(max+ " is the maximum element in the array");
    }
}
