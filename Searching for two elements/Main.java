import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int flag=1;
      int arr[] = new int[n];
      for(int i = 0 ; i < n ; i++ )
      {
        arr[i]=sc.nextInt();
      }
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      for(int i = 0 ; i < n ; i++ )
      {
        if(arr[i]==n1)
        {
          System.out.println(i);
          flag=0;
        }   
      }
      if(flag == 1)
      {
          System.out.println("-1");
       
      }
       flag=1;
            for(int i = 0 ; i < n ; i++ )
      {
        if(arr[i]==n2)
        {
          System.out.println(i);
          flag=0;
        }
          
      }
       if(flag == 1)
      {
          System.out.println("-1");
        flag=1;
      }
      
    }
}