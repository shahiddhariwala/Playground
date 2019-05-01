import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int z = 0;
      for(int i=1 ; i <= n ; i++ )
      {
        z = n+1-i;
        for(int j = 1 ; j <= n+1-i ; j++)
          System.out.print(z-j+1);
        //z = n+1-i;
        System.out.println();
        
      }
	}
}