import java.util.*;
 public class java39 {

    public static void main(String [] args )
    {
        Scanner IN = new Scanner(System.in);
        int n,u,k=0,p=1;

        System.out.print("n=");
        n=IN.nextInt();
        System.out.print("Sonlarni kiriting: ");     
        u=IN.nextInt();
        int toq=u;
        if(toq%2==1) k=1;
        for(int i=2;i<=n;i++)
        {   
            u=IN.nextInt();
            if(u%2==1)
            {
                if(toq<u)
                {
                    toq=u;
                    k++;
                    p=i;
                }
            }
        }
        if(toq%2==1)
        for(int i=1;i<=n;i++)
       {
           if(i==p)
           {
               System.out.println(toq + " " + p);
           }
       }

       if(k==0 || toq%2==0)
        System.out.println(0);
       }
      
    }