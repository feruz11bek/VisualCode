import java.util.*;
public class java42 {
    
     static boolean IsPalindrom(int n)
     {
          int d,h,s=0,pol=n;
          d=(int) (Math.log(n)/Math.log(10));
          if(n%10==0) return false;
          else
          {
              while(n>0)
          {
              h=n%10;
              s+=(int) h*Math.pow(10, d);
              d--;
              n=n/10;
          }
          if(pol==s) return true;
          else return false;
        }
     }






     public static void main(String args [])
     {
         int k=0;
         if(IsPalindrom(101)) k++;

         if(IsPalindrom(121)) k++;

         if(IsPalindrom(131)) k++;
         System.out.println(k);
     }
}
