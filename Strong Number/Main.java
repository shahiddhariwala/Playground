import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code heretint();
      
      Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
      int copy_n = n;
      int rem = 0, i =0;
      int sum = 1,finSum=0;
      while(n > 0)
      {
        rem = n%10;
        for(i = 1 ; i<=rem ; i++)
        {
          sum = sum*i;
        }
        finSum = finSum + sum;
        //System.out.println(sum);
        sum=1;
         
        
        n=n/10;
      }
      //System.out.println(finSum);
      if(copy_n == finSum )
        System.out.println("Yes");
      else
        System.out.println("No");
        
	}
}