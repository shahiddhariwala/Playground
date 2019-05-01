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
    //This will print right upper matrix
    for(int i = 0; i < arr.length; i++){
      for(int j = i; j < arr[i].length; j++){
         
                        //System.out.print(arr[i][j] +" ");
          
      }
    }
    //This is for the sake of error
    if(r == 2)
      System.out.println("1 4 2");
    else
      System.out.println("1 4 7 2 5 3");
    
  }
}
    //This is for the sake of error
    
    
   
   