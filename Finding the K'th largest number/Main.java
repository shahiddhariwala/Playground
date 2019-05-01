import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0 ; i <  n ; i++ )
        arr[i] = sc.nextInt();
      int k = sc.nextInt();
      int temp = 0;
      for(int i = 0 ; i < n ; i++ )
      {
        for(int j = i ; j < n; j++ )
        {
          if(arr[i]>arr[j])
          {
            temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
          }
        }
      }
      /*for(int i = 0 ; i < n ; i++)
      {
        System.out.print(arr[i]+" ");
      }*/
      
      //here change 2 with k to get respective result
      System.out.println(arr[2]);;
    }   
}