import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      //int flag=1;
      int n = in.nextInt();
      for(int i = 1 ; i<= n ; i++)
      {
        for(int j = 1 ; j<= n ; j++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
    }
}