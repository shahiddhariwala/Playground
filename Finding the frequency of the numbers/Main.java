import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ; i < n ; i++ )
      	arr[i] = sc.nextInt();
      
      int arr2[] = new int[k];
      for(int i = 0 ; i < k ; i++ )
        arr2[i] = 0;
      
      for(int i = 1 ; i <= k ; i++ )
      {
       for(int j = 0 ; j < n ; j++ )
       {
         if( i == arr[j])
         {
           arr2[i-1]++;
         }
       }
        
        
      }
      for(int i = 0 ; i < k ; i++ )
      {
        System.out.println((i+1)+" "+arr2[i]);
      }
    }
}