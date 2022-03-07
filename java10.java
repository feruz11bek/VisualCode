import java.util.*;

public class java10 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        System.out.print(EKUB(17,37));        
    }

    static int EKUB(int a,int b)
    {
        while(a!=b)
        {
            if(a>b) a%=b;
            else b%=a;

            if(a==0) a=b;
            if(b==0) b=a;
        }
        return a;
    }
}
