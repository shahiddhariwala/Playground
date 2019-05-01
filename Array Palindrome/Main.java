import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int flag=0;
      int arr[] = new int[n];
      
      for(int i = 0 ; i < n ; i++ )
        arr[i]=sc.nextInt();
      
      int left = 0;
      int right = n-1;
      
      while(left<right)
      {
        	if (arr[left] == arr[right] )
            {
              right--;
              left++;
              flag=1;
            }
        else 
        {
          flag=0;
          break;
        }
      }
      if(flag == 1)
        System.out.println("Yes");
      else
        System.out.println("No");
      
    }
}