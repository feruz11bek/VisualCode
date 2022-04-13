public class java34 {
    
    static int DigitN(int k,int n)
    {
      int h=0,d,g,r=1;
      d=(int) (Math.log(k)/Math.log(10)+1);
      if(d<n) return -1;
      if(d>=n)
      {
        while(k>0)
        {
             g=k%10;
             h++;
             if(h==(d-n+1))
             {
                 r=g;break;
             }
             k=k/10;
        } 
      }return r; 
      
    } 


    public static void main(String args [])
    {
        System.out.print(DigitN(10120,5));
    }
}
