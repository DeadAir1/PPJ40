package PPJ06;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class Main {
   /* private static int roll(){
        int i=0;
        int f=0;
        int s=0;
        while(f!=6 && s!=6){
         f=(int)(Math.random()*6+1);
         s=(int)(Math.random()*6+1);
         i++;
    }

    return i;
    }*/
    public static void main(String[] args) {
        //Zad 1
        /*Scanner scanner=new Scanner(System.in);
        System.out.print("Wpisz szerokosc -> ");
        int w= scanner.nextInt();
        System.out.println("Wpisz wysokosc ->");
        int h= scanner.nextInt();
        for (int i = 0; i < w; i++) {
            System.out.print("*");
        }
        System.out.print('\n');
        for (int i = 0; i <h-2 ; i++) {
            System.out.print("*");
            for (int j = 0; j < w-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println(" ");
        }

        for (int i = 0; i < w; i++) {
            System.out.print("*");
        }*/
        //Zad 2
      /*  Scanner scanner =new Scanner(System.in);
        System.out.print("Wpisz liczbe -> ");
        int n= scanner.nextInt();
        scanner.close();
        for (int i = 1; i <=n ; i++) {
            System.out.println();
            for (int j = 1; j <=n ; j++) {
               int liczba=i*j;
               if(liczba>=100) System.out.print(liczba + " ");
               else if(liczba<=100 && liczba>=10) System.out.print(liczba + "  ");
               else System.out.print(liczba + "   ");
            }
        }*/
        //Zad 3
   /*     Scanner scanner =new Scanner (System.in);
        System.out.print("Wprowadz liczbe -> ");
        int n= scanner.nextInt();
        int pomocnicza=0;
        scanner.close();
        int b=n;
        if(n%2 == 0) System.out.println("Liczba musi byc nieparzysta");
        else{
            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j <n-b ; j++) {
                    System.out.print(" ");
                    pomocnicza++;
                }
                System.out.print("*");
                b--;
                for (int j = 0; j <b-(n-b) ; j++) {
                    System.out.print(" ");

                }
                System.out.print("*");
                System.out.print('\n');

            }
            pomocnicza=n/2;
            for (int i = 0; i < pomocnicza; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print('\n');
            b=n;
            //Górna czesc i srodkowa gwiazdka konczy sie tu
            for (int i = 0; i <n/2 ; i++) {
                pomocnicza--;
                for (int j = 0; j <pomocnicza ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                b--;
                for (int j = 0; j <n-b ; j++) {
                    System.out.print(" ");
                }
                b--;
                System.out.print("*");
                System.out.print('\n');
            }

        }*/
        //Zad 4
   /*     System.out.println(roll());
        int first=0;
        int ninethy=0;
        for (int i = 0; i <1000000 ; i++) {
                    if(roll()<90) first++;
                    else ninethy++;
        }
        System.out.print("first ->"+first + ";" + "ninethy ->" + ninethy);
*/
    }

}
