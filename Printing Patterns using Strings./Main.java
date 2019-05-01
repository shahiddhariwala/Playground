import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    
    int n = st.length();
    
    int id = n/2;
    StringBuilder sb = new StringBuilder(st);
    char temp1 , temp;
    for(int i = 0; i < id ; i++)
    {
      	temp1 = sb.charAt(0);
      	for(int j = 1 ; j <= n-1 ; j++)    
        {
          sb.setCharAt((j-1),sb.charAt(j));
          
        }
      sb.setCharAt(n-1,temp1);
    }
    
   // System.out.println(sb);
    
    for(int i = 0 ; i < n ; i++ )
    {
      for(int j = 0 ; j < n-i-1 ; j++)
      {
         System.out.print(" ");
      }
      for(int k = 0 ; k < i+1; k++)
      {
        System.out.print(sb.charAt(k));
      }
      System.out.println();
       
    }
    
  }
}