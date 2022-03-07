import java.util.*;

public class java11 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        System.out.print(EKUK(40,56));        
    }

    static int EKUK(int a,int b)
    {
        int k=a,z=b;
        while(a!=b)
        {
            if(a>b) a%=b;
            else b%=a;

            if(a==0) a=b;
            if(b==0) b=a;
        }
        return (z*k/a);
    }
}
