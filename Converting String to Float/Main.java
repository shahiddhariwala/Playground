import java.util.*;
class Main
{
  public static int power(int n,int m)
		{
        if(m==1)
        return n;
        else
        return n*(power(n,m-1));
        }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    int len = str.length();

    float result= 0.0f; 
    
    int dotpos = 0; 
  for (int n = 0; n < len; n++) 
  { 
      if (str.charAt(n) == '.') 
      { 
      dotpos = len - n - 1;
       } 
      else 
      { 
      result = result * 10 + (str.charAt(n)-'0'); 
      } 
  }
    if(dotpos != 0 )
    {
      result /= power(10,dotpos);
      System.out.println(result);
    }
    else
    {
       System.out.println(result);
    }
 
  }
}