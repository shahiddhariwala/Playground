import java.util.*;
class Main
{
  public static int sum(int n)
  {
    if(n == 1 || n == 0)
      return 1;
    else
      return n+sum(n-1);
  }
  public static void main(String args[])
  {
    // your code 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sum(n));
  }
}