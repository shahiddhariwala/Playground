import java.util.Scanner;
class Main
{
  	public static int sqrOf(int n)
  {
    return n*n;
  }
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      System.out.println(sqrOf(n1));
	   
	} 
}