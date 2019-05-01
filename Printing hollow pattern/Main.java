import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
  
       for(int i=1;i<=n ; i++)
      {
         if(i == 1 || i == n)
         {
           for(int j = 1;j<=n;j++)
              {
                  System.out.print("*");
               }
         }
         else
         {
           System.out.print("*");
           for(int z = 1 ; z <= n-2 ; z++)
                        System.out.print(" ");
                      System.out.print("*");
             
         }
        
        System.out.println();
      }
	}
}