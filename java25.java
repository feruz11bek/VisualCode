import java.util.*;

public class java25 {
    public static void main(String args [])
    {
        Scanner Feruz = new Scanner(System.in);
        System.out.print("N=");
        int n=Feruz.nextInt();
        Double a[] = new Double [n];
        System.out.print("Massivni kiriting:");
        for(int i=0;i<a.length;i++)
        a[i]=Feruz.nextDouble();
        Invert(a, n);    
    }
    static void Invert(Double a[],int n)
    {
      Double x;
      for(int i=0;i<a.length;i++)
      {
          for(int j=i+1;j<a.length;j++)
          {
              if(a[i]<a[j])
              {
                  x=a[j];
                  a[j]=a[i];
                  a[i]=x;
              }
          }
      }
      for(int i=0;i<a.length;i++)
      System.out.print(a[i] + " ");
    }

}
