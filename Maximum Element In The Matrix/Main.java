import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int m  = in.nextInt();
      int a[][] = new int [n][m];
      for (int i =0;i<n;i++)
		for (int j =0;j<m;j++)
          a[i][j]= in.nextInt();
      int max=0;
 
          for (int i =0;i<n;i++)
		for (int j =0;j<m;j++)
          if (a[i][j] > max)
            max= a[i][j];
      
      System.out.println(max);
  		
     
	}
}