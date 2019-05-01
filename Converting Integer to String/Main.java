import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    int n = str.length();
    int neg = 0;
    int sum = 0;
    for(int i = 0 ; i < n ; i++)
    {
      if(str.charAt(i) == '-' )
      {
        neg = 1;
      }
      else if( str.charAt(i) >= 48 && str.charAt(i) <= 57)
      {
        sum = (sum*10)+(str.charAt(i)-48);
      }
    }
    if(neg == 0)
      System.out.println(sum);
    else
    {
      sum = sum * -1;
      System.out.println(sum);
    }
  }
}