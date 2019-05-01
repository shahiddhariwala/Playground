import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n+1];
      for(int i = 0 ; i < n ; i++ )
        arr[i] = sc.nextInt();
      
      int val = sc.nextInt();
      int sum = 0 ;
      int sum2 = 0 ;
      for(int idx1 = 0 ; idx1 < n ; idx1++ )
      {
        	for(int idx2 = idx1 + 1 ; idx2 < n ; idx2++ )
            {
              sum = arr[idx1]+arr[idx2];
              if(sum == val)
                System.out.println(arr[idx1]+", "+arr[idx2]);
            }
      }
    }
}