import java.util.*;

public class java1{

    public static void main(String args [])
    {
       // System.out.println(11111);
       kichik(22, 11, -22);
    }

    static void kichik(int a, int b, int c)
    {
        int kichk;
        kichk=a;
        if(kichk>b) kichk=b;
        if(kichk>c) kichk=c;
        System.out.println("Eng kichik butun son: "+ kichk);
    }
}