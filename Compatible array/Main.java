import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code her
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int a [] = new int[n];
    int b [] = new int[n];
    int flag =0;
    for (int i =0;i<n;i++)
      a[i]=in.nextInt();
    for (int i =0;i<n;i++)
      b[i]=in.nextInt();
	for (int i=0;i<n;i++)
    {
      if( a[i]>=b[i])
      	flag=1;
      else 
        flag=0;
    }
        if(flag == 1)
        System.out.println("Compatible");
       else
       System.out.println("Incompatible");
}
  }
