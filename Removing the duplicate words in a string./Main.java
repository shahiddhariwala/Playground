import java.util.Scanner;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder st = new StringBuilder(str);
    int spc = 0;
    for(int i = 0 ; i < st.length() ; i++ )
    {
      if(st.charAt(i) == ' ')
      {
        spc++;
      }
    }
    String arr[] = str.split(" ");
    
    for(int i = 0 ; i < spc ; i++)
    { 
        for(int j = i+1 ; j < spc ; j++)
        {
				if(arr[i].equals(arr[j]))
                {
                  	arr[j] = "-1";
                  	//System.out.print("Enter "+arr[j]);
                }
        }
    }
    
     
    for(int i = 0 ; i <= spc ; i++)
    {
     	if(!arr[i].equals("-1"))
          System.out.print(arr[i]+" ");
    }
  }
}