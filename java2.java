import java.util.*;

public class java2 {

    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int yil=feruz.nextInt();
        if(yil % 100 == 0)
        {
           if(yil % 400 == 0)
           System.out.println(yil + "-yil kabisa yili");
        }
        else{
            if(yil % 4 == 0) System.out.println(yil + "-yil kabisa yili");
            else System.out.println(yil + "-yil kabisa yili emas");}
    }
}
