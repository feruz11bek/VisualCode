import java.util.*;
import javax.swing.plaf.synth.SynthStyle;

public class java12 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int n,katta,kichik,a;
        System.out.print("\nButun elementlar sonini kiriting: ");
        n=feruz.nextInt();
        System.out.print("\n" + n + " ta sonni kiriting: ");
        a=feruz.nextInt();
        katta=a;
        kichik=a;
        for(int i=2;i<=n;i++)
        {
            a=feruz.nextInt();
            if(katta<a) katta=a;
            if(kichik>a) kichik=a;
        }
         System.out.println(kichik + " " + katta);
        
    }  
}
