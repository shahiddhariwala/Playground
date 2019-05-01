import java.util.*;
public class Main
{
   static int getMaxLength(int arr[], int n) 
    { 
          
        int count = 0; //intitialize count 
        int result = 0; //initialize max 
      
        for (int i = 0; i < n; i++) 
        { 
              
            // Reset count when 0 is found 
            if (arr[i] == 0) 
                count = 0; 
      
            // If 1 is found, increment count 
            // and update result if count becomes 
            // more. 
            else
            { 
                count++;//increase count 
                result = Math.max(result, count); 
            } 
        } 
      
        return result; 
    } 
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int count_prev = 0;
      int count_curr = 0;
      int oney = 1;
      int zery = 0;
      
      for(int i = 0 ; i < n ; i++)
      {
        	arr[i] = sc.nextInt();
      }
    	System.out.println(getMaxLength(arr, n) );
      
    }
}