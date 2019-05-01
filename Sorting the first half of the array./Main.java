import java.util.*;

class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n1 = n/2;
    int arr[] = new int[n];
    int arr2[] = new int[n1];
    for(int i = 0 ; i < n ; i++ )
    {
       arr[i] = sc.nextInt();
      if(i < n1)
      {
      	arr2[i]=arr[i];
      }
    }
    int temp = 0;
    for(int i = 0 ; i < n1 ; i++)
    {
      	for(int j = i ; j < n1-1 ; j++)
        {
          if(arr2[i] > arr2[j+1])
          {
            temp = arr2[i];
            arr2[i] = arr2[j+1];
            arr2[j+1] = temp;
          }
        }
    }
    for(int i = 0 ; i < n ; i++)
    {
      if(i < n1)
      	System.out.print(arr2[i]+" ");
      else
        System.out.print(arr[i]+" ");
    }
    
   
  }
}