/*  7  //n value
1 2 3 0 2 1 2  //value
[1, 2, 3, 1]    */
import java.util.*;
public class countarray{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
      //finding max
      Arrays.sort(arr);
      int max=arr[n-1];
      //Finding count array
      int c[]=new int[max+1];
      for(int i=0;i<n;i++)
      c[arr[i]]++;
      System.out.println(Arrays.toString(c));
  }
}