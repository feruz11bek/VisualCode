import java.util.*;

public class java8 {
    
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int a,b;
        System.out.print("Birinchi sonni kiriting a=");
        a=feruz.nextInt();
        System.out.print("Ikkinchi sonni kiriting b=");
        b=feruz.nextInt();

        while(a!=b)
        {
            if(a>b) a%=b;
            else b%=a;

            if(a==0) a=b;
            if(b==0) b=a;
        }

        System.out.println("EKUB(a,b)=" +a );
    }
        

}
