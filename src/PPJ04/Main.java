package PPJ04;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
      //  Scanner scanner =new Scanner(System.in);
        //Zad 1
            /*int var=-1;
            int i=0;
            int mid=0;
            while( var != 0){
                var = scanner.nextInt();
                if(var !=0){
                mid+=var;
                i++;
                }
            }
            System.out.println(mid/=i);
*/

        //Zad 2
       /* int liczba = parseInt(JOptionPane.showInputDialog(System.in));
        int iterator=0;
        System.out.print("Dzielniki licbzy: " + liczba + " -- " );
        for (int i = 2; i <= liczba/2; i++) {
            if(liczba%i==0){
                iterator++;
                System.out.print(i + " ,");
            }
        }if(iterator == 0) System.out.print(" nie ma bo liczba jest pierwsza");

*/
        //Zad 3
      /*  Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a - >");
        int a= scanner.nextInt();
        System.out.print("Enter b - >");
        int b= scanner.nextInt();
        scanner.close();
        String s1 = (a == b) ? "==" : "!=";
        String s2 = (a == b) ? "==" : (a < b) ? "<" : ">";
        System.out.println(a + s1 + b);
        System.out.println(a + s2 + b);
*/
        //Zad 4
  /*      boolean isFemale = false;
        String sex= isFemale ? "Female" : "Male";
        boolean isYoung = false;
        String sex1 = isFemale && !isYoung ? "Female" : isFemale && isYoung ? "Girl" : !isFemale && !isYoung ? "Male" : "Boy";
        System.out.println(sex);
        System.out.println(sex1);
*/
            //Zad 5
           /* int kolor=(int)((Math.random()*4)+1);
        int karta=(int)(Math.random()*14+2);
      String answer= " ";

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
        System.out.println(answer);*/



            //Zad 6
       /* Scanner scanner=new Scanner(System.in);
        boolean figura=false;
        System.out.print("Podaj liczbe - > ");
        int liczba= scanner.nextInt();
        System.out.print("Wpisz nazwe figury - >");
        String nazwaFigury= scanner.next();
        double pole=0;
        int losowaRand=(int)(Math.random()*3+1);
        switch(nazwaFigury){
            case "disc":pole=3.14 * Math.pow(liczba,2);
                System.out.println(pole);
            break;
            case "triangle":pole=(Math.pow(liczba,2)/2)*(Math.sqrt(3)/2);
                System.out.println(pole);
            break;
            case "square" : pole=liczba*liczba;
                System.out.println(pole);
            break;
            case "rand" : switch(losowaRand){
                case 1:pole=3.14 * Math.pow(liczba,2);
                    System.out.println("Figura disc i pole: " + pole);
                    break;
                case 2:pole=(Math.pow(liczba,2)/2)*(Math.sqrt(3)/2);
                    System.out.println("Figura triangle i pole: " + pole);
                    break;
                case 3: pole=liczba*liczba;
                    System.out.println("Figura square i pole: " + pole);
                    break;
            }
            break;
            default:
                System.out.println("Niepoprawna Figura");
        }*/




    }
}
