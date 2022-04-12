import java.util.*;

public class java32 {

    static int EKUB3(int a,int b,int c)
    {
        int x=a,d;
        if(x<b) x=b;
        if(x<c) x=c;
        d=1;
        while(x>0)
        {
            if(a%x==0 && b%x==0 && c%x==0)
            {
                d=x; break;    
            }
            else x--;
        }
        return d;
    }
    public static void main(String args [])
    {
        Scanner msi = new Scanner(System.in);
        System.out.print("a=");
         int a=msi.nextInt();
         System.out.print("b=");
         int b=msi.nextInt();
         System.out.print("c=");
         int c=msi.nextInt();
         System.out.print("EKUB("+a+","+b +"," + c +")=" + EKUB3(a,b,c));
         
         
    }
}
