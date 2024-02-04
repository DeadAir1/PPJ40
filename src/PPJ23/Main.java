package PPJ23;

public class    Main {
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
        int data=0;
        y1-=2000;
        y2-=2000;
            data=(data | y1);
            data=(data << 4) | m1;
            data=(data << 5) | d1;
        data=(data << 7 ) | y2;
        data=(data << 4) | m2;
        data=(data << 5) | d2;


        return data;
    }
    private static void showPeriod(int period) {
        int d2=period & 0b11111;
        int m2=(period >> 5) & 0b1111;
        int y2=(period >> 9) & 0b1111111;
        int d1=(period >> 16) & 0b11111;
        int m1=(period >> 21) & 0b1111;
        int y1=(period >> 25) & 0b1111111;
        System.out.printf("%d/%d/%d - %d/%d/%d",y1+2000,m1,d1,y2+2000,m2, d2);
}
}
