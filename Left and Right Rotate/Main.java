import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n+1];
    int arr1[] = new int[n+1];
    int arr2[] = new int[n+1];
    int o = 0 , e = 0;
    for(int i = 1 ; i <= n ; i++ )
    {
      arr[i] = sc.nextInt();
      if(i%2 != 0)
      {
        arr1[o] = arr[i];
        o++;
      }
      else
      {
        arr2[e] = arr[i];
        e++;
      }
    }
    //System.out.println("Odd place "+o+" even "+e);
    int nor  = sc.nextInt();
    //odd 
    int temp = 0;
   /* for(int z = 0 ; z < e ; z ++)
    {
      System.out.println(arr2[z]);
    }
    */
    for(int i = 0 ; i < nor ; i++)
    {
      temp = arr1[o-1];
      	for(int j = o-1 ; j > 0 ; j-- )
        {
          arr1[j]  = arr1[j-1];     
        }
      arr1[0] = temp;
    }
    /*for(int i = 0 ; i < o ; i++)
      System.out.println(arr1[i]);*/
    
    //even
    for(int j = 0 ; j < nor ; j++)
    {
      temp = arr2[0];
      for(int k = 0 ; k < e ; k++ )
      {
        arr2[k]=arr2[k+1];
      }
      arr2[e-1] = temp;
    }
    int j = 0 , k = 0;
    for(int i = 1 ; i <= n ; i++)
    {
      if(i%2 != 0)
        System.out.print(arr1[j++]+" ");
      else
        System.out.print(arr2[k++]+" ");
    }
  	}
}