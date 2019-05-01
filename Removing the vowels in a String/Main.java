import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    
    String st = sc.nextLine();
    
    StringBuilder str = new StringBuilder("");
    int ch=0;
    StringBuilder vowels = new StringBuilder("aeiouAEIOU");
    int n = st.length();
    for(int i = 0 ; i < n ; i++ )
    {
      for(int j = 0 ; j < vowels.length() ; j++)
      {
        char c1 = st.charAt(i);
        char c2 = vowels.charAt(j);
       // System.out.print(c1+" -- "+c2);
        if( c1 == c2 )
        {
          ch=1;
          
        }
      }
      if( ch == 0 )
      {
        str.append(st.charAt(i));
      }
      ch=0;
    }
    
    for(int i = 0 ; i < str.length() ; i++ )
    {
      System.out.print(str.charAt(i));
    }
  }
}