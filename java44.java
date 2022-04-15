import java.util.*;

public class java44 {
    public static void main(String [] args )
    {
        Scanner in = new Scanner(System.in);
        int n,u,kichik,katta;
        System.out.print("n=");
        n=in.nextInt();
        int p=n,P=n;
        System.out.print("Sonlarni kiriting:");
        u=in.nextInt();
        kichik=u;
        katta=u;
        for(int i=2;i<=n;i++)
        {
            u=in.nextInt();
            if(kichik>=u)
            {
                kichik=u;
                p=i;
            }
            if(katta<=u)
            {
                katta=u;
                P=i;
            }
    
              
        }
        if(P>p)
        System.out.println(katta + " " + P);
        if(p>P)
        System.out.println(kichik + " " + p);
    }
}
