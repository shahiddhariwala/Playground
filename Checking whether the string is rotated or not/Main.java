import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      
      
      String str = str1.concat(str1);
     // System.out.println(str);
      if(str.contains(str2))
        System.out.println("Yes");
      else
        System.out.println("No");
      
      
    }
}