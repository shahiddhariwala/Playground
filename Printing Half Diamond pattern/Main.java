import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int star = 1;
      for(int i =1 ;i<=n;i++)
      { 
        for(int z = 1 ; z <= n-i ; z ++)
           System.out.print(" ");
        for(int j = 1 ; j <= star ; j++)
        {
          System.out.print("*");
        }
        star = star+2;
         System.out.println();
        
      }
	}
}