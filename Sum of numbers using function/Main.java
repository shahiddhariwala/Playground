import java.util.Scanner;
class Main
{
  	public static int sqrOf(int n)
  {
      int sum=0;
      while(n>=1)
      {
        sum=sum+n;
        n--;
      }
    return sum;
  }
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      System.out.println(sqrOf(n1));
	   
	} 
}