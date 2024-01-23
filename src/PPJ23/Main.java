package PPJ23;

public class Main {
    public static void main(String[] args) {
        //Zad1
     /*   int n=1437226410;
        // 1
         System.out.println(n & 0x1F);
        //2
         System.out.println((n >>7) & 1);
        //3
         System.out.println((n)& 0xFF);
         System.out.println((n >> 8)& 0xFF);
         System.out.println((n >> 16)& 0xFF);
         System.out.println((n >> 24)& 0xFF);
         //4
        System.out.println((n>>8) & 0xFFFF);
        //5
        System.out.println();*/

        //Zad 2
       /* int a = 23, r = 121, g = 255, b = 130, color = 0;
        color=(color | a ) << 8;
        color=(color | r ) << 8;
        color=(color | g ) << 8;
        color=(color | b ) ;
        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);
        System.out.println("color = " + color);
        a = r = g = b = 0;
        b=color & 0xFF;
        g=(color>>8) & 0xFF;
        r=(color >> 16)  & 0xFF;
        a=(color>>24) & 0xFF;
        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);*/

        //Zad 3
        int period = pack(2000, 2, 3, 2127, 11, 29);
        showPeriod(period);





    }
    public static int pack (int y1,int m1,int d1,int y2,int m2,int d2 ){
        int period=0;
        y1=y1 & 0xF;
            y2=y2 & 0xF;
            period=(period | y1) << 7;
            period=(period | m1) << 4;
            period=(period | y1) << 5;
        period=(period | y2) << 7;
        period=(period | m2) << 4;
        period=(period | y2) ;


        return period;
    }
    private static void showPeriod(int period) {
        System.out.println(

        );
    }
}
