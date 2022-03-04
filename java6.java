import java.util.*;
public class java6 {

    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int n,m,d,k=0;
        n=feruz.nextInt();
        m=feruz.nextInt();

        while(n>=m)
        {
            d=n-m;
            n=d;
            k++;
        }

        System.out.println( n + " " + k );
    }   
    
}
