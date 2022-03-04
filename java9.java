import java.util.*;

public class java9 {
    
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        xonasoni(10120);
       
    }

     static void  xonasoni(int k)
    {
        int d,n=0,a;
        a=k;
        while(a>0)
        {
            d=a%10;
            n++;
            a=a/10;
        }
        System.out.println("Kiritilgan son " + n + " xonali");
    }
}
