import java.util.*;

public class java15 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int m=feruz.nextInt(),n=feruz.nextInt();
        int a [][] = new int [m][n],s=0;
        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
          a[i][j]=feruz.nextInt();
        }
        System.out.println();
        for(int i=0;i<m;i++)
        { 
            for(int j=0;j<n;j++)
            {
                s+=a[i][j];
            }
              System.out.println(s);
              s=0;
        }
    }
    
}
