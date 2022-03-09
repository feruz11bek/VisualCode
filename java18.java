import java.util.*;

public class java18 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int n,m,k=1;
        System.out.print("Matritsa tartibini kiriting...");
        n=feruz.nextInt();
        m=feruz.nextInt();
       int a [][] = new int [n][m];
       System.out.println("Matritsani kiriting...");
       for(int i=0;i<n;i++)
       for(int j=0;j<m;j++)
       a[i][j] = feruz.nextInt();

       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
              k*=a[j][i];
           }
           System.out.print(k + " ");
           k=1;
       }
    }   
}
