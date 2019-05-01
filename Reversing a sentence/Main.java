import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String st1 = sc.nextLine();
      //String st2 = sc.nextLine();
      StringBuilder sb = new StringBuilder(st1);
      StringBuilder sb2 = new StringBuilder("");
      char ch; 
      int z = 1 ; 
	  int arr[] = new int[sb.length()];
      int end = st1.length();
      int start = 0 ;
      for(int i = st1.length()-1 ; i > 0 ; i-- )
      {
        ch = sb.charAt(i);
        if(ch == ' ')
        {
          start = i;
          for(int j = start ; j < end ; j++)
          {
            if(z == 0 && end != 2 )
            {
            ch = sb.charAt(j);
            sb2.append(ch);
            }
            else if( z==0 && end == 2 )
            {
              ch = sb.charAt(j);
              end = 3;
              sb2.append(ch);
            }
            z=0;
          }
          end = i ;
        }
        //sb2.append(ch);
      }
      
      System.out.println(sb2+" I");
      
 
       
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        
    }
}