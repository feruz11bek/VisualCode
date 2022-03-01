import java.util.*;
public class java4 {
    
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        long s=0,n;
        n=feruz.nextInt();
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=i/2;j++)
            {
                if(i%j==0) s+=j;
            }
            if(s==i) System.out.println(i + " ");
            s=0;
        }
    }
}
