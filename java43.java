import java.util.*;
public class java43 {

    public static void main(String [] args )
    {
        Scanner in = new Scanner(System.in);
        int n,u,kichik,katta,p=1,P=1;
        System.out.print("n=");
        n=in.nextInt();
        System.out.print("Sonlarni kiriting:");
        u=in.nextInt();
        kichik=u;
        katta=u;
        for(int i=2;i<=n;i++)
        {
            u=in.nextInt();
            if(kichik>u)
            {
                kichik=u;
                p=i;
            }
            if(katta<u)
            {
                katta=u;
                P=i;
            }
    
              
        }
        if(p<P)
        System.out.println(kichik + " " + p);
        else
        System.out.println(katta + " " + P);
    }
    
}
