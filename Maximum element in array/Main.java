import java.util.*; 
  
class Main { 
      
    
    public static int findMaxRec(int a[], int n) 
    { 
     
      if(n == 1) 
        return a[0]; 
          
        return Math.max(a[n-1], findMaxRec(a, n-1)); 
    } 
  
  
    public static void main(String args[]) 
    { 
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for (int i=0;i<n;i++)
        a[i] = in.nextInt();
        int res =findMaxRec(a, n); 
      System.out.println("Maximum element in the array is "+res);
    } 
} 