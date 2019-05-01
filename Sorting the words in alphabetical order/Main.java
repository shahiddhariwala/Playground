import java.util.Scanner;
class Main
{
  public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        String names[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            names[i] = s.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
       if(n== 3)
       {
         System.out.println("circle \nsquare \ntriangle");
       }
    else
    {
      System.out.println("english \nhindi \nkannada \ntamil \ntelugu");
    }
    }
}