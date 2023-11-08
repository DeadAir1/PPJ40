package PPJ05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zad 1
        /*int i=0;
        int kolor=0;
        int karta=0;
        String answer= " ";
        while(i!=5){
         kolor=(int)((Math.random()*4)+1);
         karta=(int)(Math.random()*14+2);

       answer = switch(karta){
            case 2:
                yield  "Dwójka";

            case 3:
                yield "Trójka";

            case 4:
                yield "Czwórka";

            case 5:
                yield "Piątka";

            case 6:
                yield "Szóstka";

            case 7:
                yield "Siódemka";

            case 8:
                yield "Ósemka";

            case 9:
                yield "Dziewiątka";

            case 10:
                yield "Dziesiątka";

            case 11:
                yield "Wallet";

            case 12:
                yield "Dama";

            case 13:
                yield "Król";

            default:
                yield "As";
        };

       answer+= switch(kolor){
            case 1:
                yield " Trefl";

            case 2:
                yield " Taro";

            case 3:
                yield " Tier";

            default :yield " Pik";
        };
            System.out.println(answer);
        i++;
        }*/

        //Zad 2
       /* Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();*/

        //Zad 3



        //Zad 4
        Scanner scanner=new Scanner(System.in);
        System.out.println("Trzymaj w glowie liczbe od 1:1 000 000");
        int i=0;
        int max=1000000;
        int min=1;
        int n=max;
        String answer=" ";
        while(i<20){
            System.out.print("It's your answer? :" + n +" - >");
            answer=scanner.next();
            switch(answer){
                case "b":max=n;
                n/=2;
                    break;
                case "s": min=n;
                    n=(min+max)/2;
                    break;
                case "y":
                    System.out.println("Pomyslana liczba to: " + n);
                    i=20;
                    break;
            }
            i++;
        }



    }

}
