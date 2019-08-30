import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       	Scanner in=new Scanner(System.in);
      	int n=in.nextInt();
      	int a[]=new int[50];
      	int sum=0;
      int i=0;
      	while(sum<100){
        	a[i]=in.nextInt();
          	sum+=a[i];
          	i++;
        }
      System.out.print("The number of turns is "+i);
      	
    }
}