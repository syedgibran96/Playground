import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner in = new Scanner (System.in);
      int n= in.nextInt();
      int m = in.nextInt();
       int a[][]=new int[m][n];
     for(int i=0;i<m;i++)
       for(int j=0;j<n;j++)
         a[i][j]=in.nextInt();
     
      
     
     
          
      for(int i=0;i<m;i++)
     { int max= 0;
       for(int j=0;j<n;j++)
       if(max<a[i][j])
           max=a[i][j];
     System.out.println(max);}
        
	}
}