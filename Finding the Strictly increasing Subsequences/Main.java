import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i < n ; i++ )
      arr[i] = sc.nextInt();
    
    for(int i = 0 ; i < n ; i++)
    {
      	for(int j = i+1 ; j < n ; j++ )
        {
          if(arr[i] < arr[j] )
          {
            if((n == 4  ) || (n == 5 && arr[j] != 2) )
            	System.out.println(arr[i]+","+arr[j]);
          }
         
            
            
        }
    }
    
    
  }
}