import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();
      int count ;
      int coln;
      for(int i = 0 ;i < row ; i++)
      {
        coln = col;
        count = 0 ;
        for(int j = 1 ; j <= col; j++)
        {
          if(count < i)
          {
            System.out.print(coln--);
            count++;
          }
          else
             System.out.print(coln);
        }
          
        System.out.println();
      }
      
      
    }
}