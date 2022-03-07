import java.util.*;

import javax.xml.catalog.CatalogFeatures.Feature;
public class java16 {
    public static void main(String args [])
    {
        Scanner feruz = new Scanner(System.in);
        int m=feruz.nextInt();
        int a [] = new int [m];
        for(int i=0;i<m;i++)
        {
          a[i]=feruz.nextInt();
        }

        System.out.print(IsLeapYear(a) + " ta");
        
    }

    static int IsLeapYear(int a[])
    {
      boolean k;
      int z=0;
      for(int i=0;i<a.length;i++)
      {
          k=false;
          if(a[i]%100==0)
          {
              if(a[i]%400==0) k=true;
              else k=false;
          }
          else
          {
              if(a[i]%4==0) k=true;
              else k=false;
          }
          if(k==true) z++;
      }
      return z;
    }
}
