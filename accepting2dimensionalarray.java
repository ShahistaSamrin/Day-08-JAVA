/*  2(no.of rows)
    3(no.of columns)
    1
    2
    3
    4
    5
    6
    1 2 3
    4 5 6   */
import java.util.*;
public class accepting2dimensionalarray{
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
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}