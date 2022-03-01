import java.util.*;
public class java3 {
    
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        float x,y,t;
        x=feruz.nextFloat();
        y=feruz.nextFloat();
        if(x == y)
        {
            System.out.println(x + " " + y);
        }
        if(x < y)
        {
            t=x;
            x=(x+y)/2;
            y=2*t*y;
            System.out.println(x + " " + y);
        }
        if(x > y)
        {
            t=x;
            x=2*(x*y);
            y=(t+y)/2;
            System.out.println(x + " " + y);
        }
    }
}
