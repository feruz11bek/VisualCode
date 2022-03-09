import java.util.*;

public class java17 {
    public static void main(String args [])
    {
         Scanner feruz = new Scanner(System.in);
         System.out.print("Massiv o'lchamini kiriting:");
         int n=feruz.nextInt();
         int a [] = new int [n];
         System.out.print("\nMassivni kiriting:");
         for (int i=0;i<a.length;i++)
         a[i] = feruz.nextInt();
         tartiblash(a);
    }   
    static void tartiblash(int a[])
    {
        int c=a[0];
        for (int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    c=a[j];
                    a[j]=a[i];
                    a[i]=c;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        System.out.print(a[i] + " ");
    } 
}
