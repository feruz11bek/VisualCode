import java.util.*;
public class java24 {
    public static void main(String args [])
    {
        Scanner Feruz = new Scanner(System.in);
        System.out.print("N=");
        int n=Feruz.nextInt();
        int a[] = new int [n];
        System.out.print("Massivni kiriting:");
        for(int i=0;i<a.length;i++)
        a[i]=Feruz.nextInt();
        MinElement(a, n);    
    }
    static void MinElement(int a[],int n)
    {
      int x=a[0];
      for(int i=1;i<a.length;i++)
      {
          if(x>a[i]) x=a[i];
      }
      System.out.println(x);
    }
}