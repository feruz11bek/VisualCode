import java.util.*;

public class java26 {
    public static void main(String args [])
    {
        Scanner Feruz = new Scanner(System.in);
        System.out.print("N=");
        int n=Feruz.nextInt();
        System.out.print(Fact2(n));
    }
    public static int Fact2(int abc)
    {
        if(abc==0 || abc==1) return 1;
        return abc*Fact2(abc-2);
    }

}
