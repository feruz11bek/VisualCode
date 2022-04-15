import java.util.*;
public class java40 {

    public static void main(String [] args)
    {
        Scanner FeruZ = new Scanner(System.in);
        int n,s=0,a1,a2;
        System.out.print("N=");
        n=FeruZ.nextInt();
        System.out.print("N ta sonni kiriting: ");
        a1=FeruZ.nextInt();
        a2=FeruZ.nextInt();
        s=a1+a2;
        for(int i=3;i<=n;i++)
        {
            a1=FeruZ.nextInt();
            if(s<a1+a2)
            {
                s=a1+a2;
            }a2=a1;
        }
        System.out.print(s);

    }
    
}
