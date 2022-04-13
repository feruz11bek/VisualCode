import java.util.*;

import java.lang.Math;

public class java33 {
    
    public static void main(String args [])
    {
        Scanner msi = new Scanner(System.in);

        System.out.print("S=");
        Double s=msi.nextDouble();
        System.out.print("p=");
        int p=msi.nextInt();
        int k=1;
        while(k>0)
        {
            
            if(Math.pow(1+0.01*p,k)*s>2*s)
            {
                System.out.print(k + " oyda ");
                System.out.printf("%7.2f so'm", Math.pow(1+0.01*p,k)*s);
                break;
            }
            k++;
        }
    }
}
