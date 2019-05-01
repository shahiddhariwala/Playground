import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      String str3 = sc.nextLine();
      
      
      String str = str1.replace(str2,str3);
      System.out.println(str);
    }
}