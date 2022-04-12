import java.util.*;

public class java31 {

    public static void main(String args [])
    {
         Scanner msi = new Scanner(System.in);
         System.out.print("n=");
         int n=msi.nextInt();
         int a[] = new int [n];
         System.out.print("a["+n+"]=");
         for(int i=0;i<a.length;i++)
         a[i]=msi.nextInt();
         System.out.print(IsPrime(a));
        
    }   
    static int IsPrime(int a[])
    {
        int h,g=0;
        for(int i=0;i<a.length;i++)
        {
            h=0;
            for(int j=2;j<=a[i]/2;j++)
            {
                
                if(a[i]%j==0) h++;
            }
            if(h==0) g++;
        }
        return g-1;
        
    }
    
}
