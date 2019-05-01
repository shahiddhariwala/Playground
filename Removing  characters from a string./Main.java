import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    String st1  = sc.nextLine();
    String st2  = sc.nextLine();
    int is_contain = 0;
    for(int i = 0 ; i < st1.length() ; i++ )
    {
      is_contain = 0;
      for(int j = 0 ; j < st2.length() ; j++ )
      {
        if(st1.charAt(i) == st2.charAt(j))
        {
          is_contain = 1;
        }
      }
      if(is_contain == 0)
        System.out.print(st1.charAt(i));
             
                         
        
        
    }
    
  }
}