public class java36 {
    static int MonthDays(int oy,int yil)
    {
        int a=1;
        if(yil%100==0 && yil%400==0)
        {
             switch(oy)
             {
                 case 1:a=31;break;
                 case 2:a=29;break;
                 case 3:a=31;break;
                 case 4:a=30;break;
                 case 5:a=31;break;
                 case 6:a=30;break;
                 case 7:a=31;break;
                 case 8:a=31;break;
                 case 9:a=30;break;
                 case 10:a=31;break;
                 case 11:a=30;break;
                 case 12:a=31;break;
             }
             return a;
        }
        else
        {
            if(yil%4==0)
            {
                switch(oy)
             {
                case 1:a=31;break;
                case 2:a=29;break;
                case 3:a=31;break;
                case 4:a=30;break;
                case 5:a=31;break;
                case 6:a=30;break;
                case 7:a=31;break;
                case 8:a=31;break;
                case 9:a=30;break;
                case 10:a=31;break;
                case 11:a=30;break;
                case 12:a=31;break;
             }
             return a;
            }
            else
            {
                switch(oy)
                {
                    case 1:a=31;break;
                    case 2:a=28;break;
                    case 3:a=31;break;
                    case 4:a=30;break;
                    case 5:a=31;break;
                    case 6:a=30;break;
                    case 7:a=31;break;
                    case 8:a=31;break;
                    case 9:a=30;break;
                    case 10:a=31;break;
                    case 11:a=30;break;
                    case 12:a=31;break;
                }
                return a;
            }
        }
    }

    public static void main(String args [])
    {
        System.out.print(MonthDays(2,2022) + " " + MonthDays(6, 2022) + " " + MonthDays(7, 2022));
    }
}
