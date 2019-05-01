import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      int arr1[] = new int[n];
      int arr2[] = new int[n];
      for(int i = 0 ; i < n ; i++ )
        arr[i] = s.nextInt();
      int z=0,y=0;
      for(int i = 0 ; i < n ; i++ )
      {
        if(arr[i] == 0)
        {
          arr2[z]=arr[i];
          z++;
        }
        else
        {
          arr1[y]=arr[i];
          y++;
        }
      }
      for(int i = 0 ; i< y ; i++)
        System.out.print(arr1[i]+" ");
      for(int i = 0 ; i < z ; i++)
        System.out.print(arr2[i]+" ");
    }
}