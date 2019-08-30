import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    int size, i, del, count=0;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
  
       //System.out.print("Enter Array Size : ");
       size = scan.nextInt();
    
  
       //System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
  
       //System.out.print("Enter Element to be Delete : ");
       del = scan.nextInt();
       for(i=0; i<size; i++)
       {
           if(arr[i] == del)
           {
               for(int j=i; j<(size-1); j++)
               {
                   arr[j] = arr[j+1];
               }
               count++;
               break;
           }
       }
       if(count==0)
       {
           System.out.print("Invalid Input");
       }
       else
       {
           //System.out.print("Element Deleted Successfully..!!");
           System.out.println("Array after deletion is");
           for(i=0; i<(size-1); i++)
           {
               System.out.println(arr[i]);
           }
       }
  }
}