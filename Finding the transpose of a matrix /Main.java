import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc =new Scanner(System.in);
    
    int r = sc.nextInt();
    int c = sc.nextInt();
    
    int mat1[][] = new int[r][c];
    int mat2[][] = new int[r][c];
    int mat3[][] = new int[r][c];
    for(int i = 0 ; i < r ; i++)
    {
      for(int j = 0 ; j < c ; j++)
        mat1[i][j] = sc.nextInt();
    }
    for(int i = 0 ; i < r ; i++)
    {
      for(int j = 0 ; j < c ; j++)
        mat2[i][j] = mat1[j][i];
    }
    
     for(int i = 0 ; i < r ; i++)
    {
      for(int j = 0 ; j < c ; j++)
        System.out.print(mat2[i][j]+" ");
       System.out.println();
       
    }
    
  }
}