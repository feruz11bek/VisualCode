import java.util.*;

public class java20 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int n,m,k;
        System.out.print("Matritsa tartibini kiriting...");
        n=feruz.nextInt();
        m=feruz.nextInt();
       int a [][] = new int [n][m+1];
       System.out.println("Matritsani kiriting...");
       for(int i=0;i<n;i++)
       for(int j=0;j<m;j++)
       a[i][j] = feruz.nextInt();
       for(int i=0;i<n;i++)
       {
           k=a[i][0];
        for(int j=0;j<m;j++)
        {
            if(a[i][j]>k)
            {
               k=a[i][j];
            }
            a[i][m]=k;
        }
        
       }
       System.out.println();
       for(int i=0;i<n;i++)
       {
       for(int j=0;j<=m;j++)
       {
        System.out.print(a[i][j] + " ");
       }
          System.out.println();
       }
    } 
}
