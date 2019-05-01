import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      if(n >= 75)
        System.out.println("A");
      else if(n >= 65 && n<75)
        System.out.println("B");
      else if(n >= 55 && n < 65)
        System.out.println("C");
      else if(n >= 45 && n < 55)
        System.out.println("D");
      else if(n >= 35 && n < 45)
        System.out.println("E");
      else
        System.out.println("Fail");
    }
}