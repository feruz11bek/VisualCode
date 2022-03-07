import java.util.*;

public class java13 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int n,orni=1,kichik,a;
        System.out.print("\nButun elementlar sonini kiriting: ");
        n=feruz.nextInt();
        System.out.print("\n" + n + " ta sonni kiriting: ");
        a=feruz.nextInt();
        kichik=a;
        for(int i=2;i<=n;i++)
        {
            a=feruz.nextInt();
            if(kichik>a) 
            {
                kichik=a;
                orni=i;
            }
        }
         System.out.println(kichik + " " + orni);
}
}
