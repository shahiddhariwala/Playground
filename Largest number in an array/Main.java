import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      //int flag=1;
      int arr[] = new int[n];
      for(int i = 0 ; i < n ; i++ )
      {
        arr[i]=sc.nextInt();
      }
      int lar = arr[0];
      for(int i = 0 ; i < n ; i++ )
      {
        if(arr[i]>lar)
          lar=arr[i];
      }
      System.out.println(lar);
      
    }
}