import java.util.Scanner;

public class java35 {
    public static void main(String args [])
    {
       Scanner MSI = new Scanner(System.in);
       String s="Assalomu alaykum";
       int x=0;
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i) == ' ') x++;
       }
         x++;
         System.out.println(x);
    }
}
