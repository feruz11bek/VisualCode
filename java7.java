import java.util.*;

public class java7 {

    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int n,d,k=0,x=0;
        n=feruz.nextInt();

        while(n>0)
        {
            d=n%10;
            k+=d;
            x++;
            n=n/10;
        }

        System.out.println( x + " " + k );
    }  
    
}
