import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
             Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num = 1;
      for(int i=1 ; i <= n ; i++ )
      {
        
        for(int j = 1 ; j <= n-i ; j++)
          System.out.print(" ");
        for(int z = 1 ; z <= i ; z++)
          System.out.print(num++ + " ");
        //z = n+1-
        System.out.println();
        
      }
    }    
}