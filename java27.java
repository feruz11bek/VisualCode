import java.util.*;

public class java27 {
    public static void main(String args [])
    {
        Scanner Feruz = new Scanner(System.in);
        System.out.print("N=");
        int n=Feruz.nextInt();
        System.out.print(Fact(n));
    }
    public static int Fact(int abc)
    {
        if(abc==0 || abc==1) return 1;
        return abc*Fact(abc-1);
    }
}
