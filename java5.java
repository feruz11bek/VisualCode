import java.util.*;
public class java5
 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        long s=0,n;
        n=feruz.nextInt();
        for(int j=2;j<=n;j++)
        {
            for(int i=2;i<=j/2;i++)
            {
                if(j%i==0) s++;
            }
            if(s==0) System.out.println(j + " ");
            else s=0;
        }
    }   
}
