import java.util.*;

public class java37 {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int m,n,k,h=0;
        System.out.print("m=");
        m=in.nextInt();
        System.out.print("n=");
        n=in.nextInt();
        int a [][] = new int [m][n];
        System.out.println("a[][]=");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            a[i][j]=in.nextInt();
        }
        System.out.println();
        k=a[0][0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(k>a[i][j])
                {
                    k=a[i][j];h=j;
                }
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
           {
               if(h==j) continue;
               System.out.print(a[i][j]+ " ");
           }
           System.out.println();
        }
    }
    
}
