/* 3      Before Transpose
   3      1 2 3
   1      8 9 10 
   2      12 14 16
   3      After Transpose
   8      1 8 12 
   9      2 9 14
   10     3 10 16
   12
   14
   16      */
import java.util.*;
public class transposematrix{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("Before Transpose");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }System.out.println("After Transpose");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
  }
}