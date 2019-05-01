import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc = new Scanner(System.in);
      int opt = sc.nextInt();
      
      switch(opt)
      {
        case 1:
        int s = sc.nextInt();
        System.out.println(s*s);
        break;
        case 2:
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(l*b);
        break;
        case 3:
        int ba = sc.nextInt();
        int h = sc.nextInt();
        System.out.println((ba*h)*0.5);
        break;
        case 4:
        int r = sc.nextInt();
        System.out.println(3.14*r*r);
        break;
      }
    }
}