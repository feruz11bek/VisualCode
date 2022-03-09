import java.util.*;

public class java21 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int n,m,k,h;
        System.out.print("Matritsa tartibini kiriting...");
        n=feruz.nextInt();
        m=feruz.nextInt();
       int a [][] = new int [n+1][m];
       System.out.println("Matritsani kiriting...");
       for(int i=0;i<n;i++)
       for(int j=0;j<m;j++)
       a[i][j] = feruz.nextInt();
       h=0;
       for(int i=0;i<n;i++)
       {
           k=a[0][h];
        for(int j=0;j<m;j++)
        {
            if(a[j][i]>k)
            {
               k=a[j][i];
            }
           // a[n+1][i]=k;
        }
        a[n][i]=k;
        h++;
       }
       System.out.println();
       for(int i=0;i<=n;i++)
       {
       for(int j=0;j<m;j++)
       {
        System.out.print(a[i][j] + " ");
       }
          System.out.println();
       }
    }
}
