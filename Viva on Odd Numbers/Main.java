import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner in=new Scanner(System.in);
     int n,c=0;
     float m=0;
     while(c!=3)
     {n=in.nextInt();
      if(n>=0)
      {if(n%2==1)
         {m=m+1;
          c=c+1;}
       else
          m=m-(float)0.5;
         }
      else
      {m=m-1;
        c=3;}
     }
       System.out.println(m); //fill your code;
    }
}