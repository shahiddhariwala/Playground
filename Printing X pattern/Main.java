import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1;i<=n/2+1 ; i++)
      {
        for(int j = 1;j<=n;j++)
        {
          if( (j == i) || (j == n-i+1))
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
      //Second half
       for(int i=n/2;i>= 1; i--)
      {
        for(int j = 1;j<=n;j++)
        {
          if( (j == i) || (j == n-i+1))
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
	}
}