import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n+1];
    for(int i = 0 ; i < n ; i++ )
      arr[i] = sc.nextInt();
    
    int temp = 0 ;
    int ind = 0 ;
    for(int i = 0 ; i < n ; i++ )
    {
      if(temp < arr[i])
      {
        temp = arr[i];
        ind = i;
      }
    }
    System.out.println(ind);
  }
}