import java.util.*;
public class java41 {
  
    public static void main(String args [])
    {
        Scanner F = new Scanner(System.in);
        int n,f,katta,o_rni=1;
        System.out.print("N=");
        n=F.nextInt();
        System.out.print("N ta sonni kiriting: ");
        f=F.nextInt();
        katta=f;
        for(int i=2;i<=n;i++)
        {
            f=F.nextInt();
            if(katta<=f)
            {
                katta=f;
                o_rni=i;
            }
        }

        for(int i=n;i>=1;i--)
        {
            if(o_rni==i)
            {
                o_rni=i;break;
            }
        }

        System.out.print(katta + " " + (n- o_rni));

    }
}

  // Bir xil son kiritilmaydi...!!!