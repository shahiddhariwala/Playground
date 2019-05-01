import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int n1=n;
      int count = 0;
      while(n > 0)
      {
         n=n/10;
        count++;
      }
        
      n=n1;
      for(int i = 1 ; i <= count-2 ;i++ )
      {
        n=n/10;
      }
      System.out.println(n%10);
	}
}