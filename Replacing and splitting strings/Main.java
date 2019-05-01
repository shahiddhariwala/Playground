import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      String st1 = sc.nextLine();
      String st2 = sc.nextLine();
      int n = sc.nextInt();
      String arr[] = st2.split(" ",n);
      for(String s : arr)
      {
        System.out.println(s);
      }
      
    }
}