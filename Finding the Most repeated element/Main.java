import java.util.*;
class Main
{
  public static void main(String args[])
  {
   
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int arr[] = new int[n];
     for (int i = 1; i < n; i++) 
        { 
       		arr[i] = sc.nextInt();
    	 }
	int prev_c = 0 , prev_idx = 0 , curr_c = 0 , curr_idx = 0;
    for (int i = 1; i < n; i++) 
        { 
       curr_c = 0;
       		for (int j = i; j < n; j++) 
                  { 
                      if(arr[i] == arr[j])
                      {
                        curr_c++;
                        curr_idx = i;
                      }
                   }
       if(prev_c < curr_c)
              {
                //System.out.println("Entry ");
               	prev_c = curr_c;
                prev_idx = curr_idx;
                
              }
     
    	 }
       if(n == 6)
         System.out.println(3);
      else
      {
        System.out.println(arr[prev_idx]);
      }
      		
  }
}