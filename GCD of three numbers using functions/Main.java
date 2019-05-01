import java.util.Scanner;
class Main{
  public static int gcd(int a,int b)
  {
    int min = 0;
    if(a>b)
      min = b;
    else
      min = a;
    
    while(min >=1)
    {
      if(a%min==0 && b%min == 0)
      {
        break;
      }
      else
        min--;
        
    }
    return min;
  }

	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int n4 = gcd(n1,n2);
      System.out.println(gcd(n4,n3));
      
      
	}
}