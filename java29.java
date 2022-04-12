import java.util.*;
public class java29 {

    static void SumRow(Double a[][],int k,int m,int n)
    {
        Double s=0.0;
        if(k>m) System.out.println("0");
        else
        {
            for(int j=0;j<n;j++)
            {
                s+=a[k][j];
            }
            System.out.println(s);
        }
    }

    public static void main(String args [])
    {
        Scanner msi = new Scanner(System.in);
        int k,m,n;
        System.out.print("k=");k=msi.nextInt();
        System.out.print("m=");m=msi.nextInt();
        System.out.print("n=");n=msi.nextInt();
        Double a[][] = new Double [m][n];
        System.out.print("a["+m+"]["+n+"]=");
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        a[i][j]=msi.nextDouble();
        SumRow(a,k,m,n);

    }
    
}
