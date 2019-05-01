import java.util.*;
class Main{ 
  public static void main(String args[])  
  { 
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] arr = new int[r][c];  
    
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
           arr[i][j] = sc.nextInt();
      }
    }
        int[][] arr2 = new int[r][c];  
    
    for(int i = 0; i < arr2.length; i++){
      for(int j = 0; j < arr2[i].length; j++){
           arr2[i][j] = sc.nextInt();
      }
    }
    
    int flag = 0;
    for(int i = 0 ; i < r ; i++){
      for(int j = 0 ; j < c ; j++){
         if(arr[i][j] != arr2[i][j])
           flag = 1;
      }
      
    }
    if(flag == 1)
      System.out.println("No");
    else
      System.out.println("Yes");
   
  }
}
    
    
    
   
   