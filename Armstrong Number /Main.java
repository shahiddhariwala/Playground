import java.util.Scanner;
import java.lang.Math; 
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      int cp = n;
      while(n  > 0 )
      {
        n = n/10;
        count++;
      }
      n=cp;
      double sum = 0;
      int j =1;
      int tp = 0;
      for(int i = 0 ; i< count;i++)
      {
        tp = n%10;
        n = n/10;
        
        sum = sum + Math.pow(tp, count);
          
      }
      //System.out.println(sum);
      if(cp == sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
	}
}