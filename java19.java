import java.util.*;

public class java19 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int n,m,k=0,d=0;
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
        for(int j=0;j<n;j++)
        {
            if(a[i][j]<0) k++;
            if(a[i][j]>0) d++;
        }
        if(k==d)
        {
            System.out.println(i);
            break;
        }
        k=0;
        d=0;
       }
       if(k==0 && d==0) System.out.println("Bunday satr yo'q");
    }   
}
