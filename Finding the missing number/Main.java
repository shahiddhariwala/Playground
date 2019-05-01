import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      
      for(int i = 0 ; i < n ; i++ )
        arr[i]=sc.nextInt();
      
      int arrSeq[] = new int[n];
      for(int i = 0 ; i < n ; i++)
      {
        arrSeq[i]=i+1;
      }
      
      for(int i = 0 ; i < n ; i++ )
      {
        for(int j = 0 ; j < n ; j++ )
        {
          if(arrSeq[i] == arr[j])
          {
            arrSeq[i] = 0;
          }
        }
      }
      
      for(int j = 0 ; j < n ; j++)
      {
        if(arrSeq[j] != 0)
          System.out.print(arrSeq[j]);
      }
      
    }
}