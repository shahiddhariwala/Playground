import java.util.Scanner;
import java.lang.Math;
class Main{
  public static double powerr(double a,double b)
  {
    return Math.pow(a,b);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int exp = sc.nextInt();
    double sum = powerr(base,exp);
    System.out.println(sum);
  }
}
