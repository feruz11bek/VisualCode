import java.util.*;

public class java45 {
    public static void main(String [] args )
    {
        Scanner in = new Scanner(System.in);
        int n,u,kichik,K,Pa=1,p=1;
        System.out.print("n=");
        n=in.nextInt();
        System.out.print("Sonlarni kiriting:");
        u=in.nextInt();
        kichik=u;K=u;
        for(int i=2;i<=n;i++)
        {
            u=in.nextInt();
            if(kichik>u)
            {
                kichik=u;
                p=i;
            }
            if( K<=u)
            {
                K=u;
                Pa=i;
            }

        }
        for(int i=2;i<=n;i++)
        {
            if(p==i)
            {
                p=i;break;
            }
        }
        for(int i=n;i>1;i--)
        {
            if(Pa==i)
            {
                Pa=i;break;
            }
        }
        
        System.out.print(kichik+ " " +p+ ";" +  K + " " +  Pa);
    }
}
