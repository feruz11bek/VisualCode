import java.util.*;
public class java28 {
    
    public static void main(String args [])
    {
        Scanner Feruz = new Scanner(System.in);
        System.out.print("N=");
        int n=Feruz.nextInt(),x=0,mn;
        int a[] = new int [n],b[]=new int [n];
        System.out.print("a[]=");
        for(int i=0;i<a.length;i++)
        {
            a[i]=Feruz.nextInt();
        }

       for(int i=1;i<a.length-1;i++)
        {
            if(a[i-1]<a[i] && a[i]>a[i+1])
            {
                b[x]=a[i];
                x++;
            }
        }
        mn=b[0];
        for(int i=1;i<x-1;i++)
        {
            if(mn>b[i]) mn=b[i];
        }
        System.out.print(mn);
    }
}
