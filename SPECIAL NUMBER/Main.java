import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int i,x,rem=0,sum=0,prod=1;
        for(i=n;i<=m;i++){
            x=i;
          	sum=0;
          	prod=1;
            while(x!=0){
        	rem=x%10;
          	sum+=rem;
          	prod*=rem;
          	x/=10;
            }
          	if((sum+prod)==i)
        	System.out.println(i);
        
        
        }
    }
}