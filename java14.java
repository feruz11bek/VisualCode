import java.util.*;

public class java14 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int m=feruz.nextInt(),n=feruz.nextInt();
        int a [][] = new int [m][n];
        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
          a[i][j]=feruz.nextInt();
        }
        System.out.println();
        for(int i=0;i<m;i++)
        { 
              if(i%2==0) 
              {
                  for(int j=0;j<n;j++) System.out.print(a[i][j] + " ");
              }
              else
              {
                for(int j=n-1;j>=0;j--) System.out.print(a[i][j] + " ");
              }
              System.out.println();
        }
    }
}
