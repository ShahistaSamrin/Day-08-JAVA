/*  3(no.of rows)
    3(no.of columns)
    1 
    2
    5
    21
    82
    4
    22
    141
    90
    161  //max element  */
import java.util.*;
public class maxelements{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int max=arr[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]>max)
                max=arr[i][j];
            }
        }
        System.out.println(max);
    }
}