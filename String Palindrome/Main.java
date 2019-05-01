import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String st1 = sc.nextLine();
      //String st2 = sc.nextLine();
      StringBuilder sb = new StringBuilder(st1);
      StringBuilder sb2 = new StringBuilder("");
      char ch;
      Boolean flag = true ;
      for(int i = st1.length()-1 ; i > 0 ; i-- )
      {
        ch = sb.charAt(i);
        sb2.append(ch);
      }
      for(int i = 0 ; i < st1.length()-1; i++)
      {
        if(sb.charAt(i) != sb2.charAt(i))
          flag = false;
      }
      if(flag == true )
        System.out.println("Yes");
      else
        System.out.println("No");
      
      
    } 
}