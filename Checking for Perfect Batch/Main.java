import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count  = 0;
    int arr[] = new int[n+1];
    for(int i = 0 ; i < n ; i++)
      arr[i] = sc.nextInt();
    int sum1 = arr[0]+arr[1]+arr[2];
    int sum = 0,j=0;
    for(j = 0 ; j < n ; j++ )
    {
      sum = sum + arr[j];
      count++;
      if( count == 3 && sum1 == sum )
      {
        sum = 0 ;
        count = 0 ;
      }
      else if( count == 3 && sum1 != sum)
        break;
    }
    if(j !=n )
      System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
      
  }
}