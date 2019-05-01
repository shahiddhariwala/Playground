import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int j = 1;
    for(int i = 1 ; i <= n ; i++ )
    {
      System.out.print(i);
      if(j%3 == 0)
        System.out.print(",");
      j++;
    }
  }
}