import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exp = sc.nextInt();
      int i = 0;
      int res= 1;
      while(i != exp)
      {
        res = res * base;
        i++;
      }
      System.out.println(res);
      
    }
}