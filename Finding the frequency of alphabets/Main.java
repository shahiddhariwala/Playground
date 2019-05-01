import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      
      String str = sc.nextLine();
      
      int arr[] = new int[27];
      for(int i = 0 ; i < 26 ; i++)
      {
        arr[i] = 0 ;
      }
      char ch = 'a';
      int offset = 0;
      for(int i = 0 ; i < str.length() ; i++ )
      {
        	if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
              offset = str.charAt(i) - 'a';
        	  arr[offset]++;
            }
        else if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
        {
          offset = str.charAt(i) - 'A';
        	  arr[offset]++;
        }
        	
      }
      for(int i = 0 ; i < str.length() ; i++ )
      {
        	if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
              offset = str.charAt(i) - 'a';
        	  if(arr[offset] != 0)
              {
              System.out.print(str.charAt(i)+""+arr[offset]+" ");
                arr[offset] = 0 ; 
              }
            }
        else if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
        {
          offset = str.charAt(i) - 'A';
        	 if(arr[offset] != 0)
              {
              System.out.print((char)(str.charAt(i)+32)+""+arr[offset]+" ");
                arr[offset] = 0 ; 
              }
        }
        	
      }
    }
}