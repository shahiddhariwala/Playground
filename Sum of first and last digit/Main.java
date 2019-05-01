import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int n1 = n;
      int count = 0;
       int first_digit = 0;
      while(n > 0 )
      {
        if(n/10 ==0)
           first_digit = n;
        n=n/10;
        count++;
      }
      int last_digit = n1%10;
     
      System.out.println(first_digit+last_digit);
	}
}