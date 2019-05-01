import java.util.Scanner;
class Main{
  public static void checkPrime(int i)
  {
    int flag=0;
    for(int j = 1 ;j <= i ; j++)
    {
      if(i%j == 0)
        flag++;
    }
    if(flag==2)
      System.out.println(i);
  }
  
	public static void main (String[] args){
	    // Type your code here
       Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
      for(int i = 1; i<=n ; i++)
      {
        checkPrime(i);       
      }
      
	}
}