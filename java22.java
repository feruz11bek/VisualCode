import java.util.*;

public class java22 {

    
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int n,R,x,q=0;
        System.out.print("n=");
        n=feruz.nextInt();
       int a [] = new int [n],b[]=new int [n];
       System.out.print("R=");
       R=feruz.nextInt();
       System.out.println("Sonlarni kiriting...");
       for(int i=0;i<n;i++)
       a[i]= feruz.nextInt();
     
       for(int i=0;i<n;i++) 
       {
           b[i]=Math.abs(a[i]-R);
       }
       x=b[0];
       for(int i=0;i<n;i++)
       {
           if(x>b[i])
           {
              x=b[i];
              q=i;          
           }
       }

       System.out.println(a[q]);
    }
    
}
