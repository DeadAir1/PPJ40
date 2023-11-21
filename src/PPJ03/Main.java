package PPJ03;

import java.util.Scanner;


public class Main {

    static boolean prime(int liczba){
        for (int i = 3; i <liczba/2+1 ; i++) {
             if(liczba%i==0) {

                 return false;
             }
        }

    return true;
    }
    public static void main(String[] args) {
        //Zad 1
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz a: ");
        boolean a=scanner.nextBoolean();
        System.out.println("Wprowadz b: ");
        boolean b=scanner.nextBoolean();
        System.out.println("Wprowadz c: ");
        boolean c=scanner.nextBoolean();
        scanner.close();
        boolean allThree = a && b && c;
        boolean exactlyOne = a ^ b ^ c;
        boolean exactlyTwo = (a && b) ^ (b && c) ^ (a && c);
        boolean atLeastOne = a || b || c;
        boolean atLeastTwo = (a && b ) || (b && c ) || (a && c );
        System.out.println("a, b, c =" + a +", "+ b + ","+c + "\nallThree: " + allThree +
                "\nexactlyOne: " +exactlyOne +
        "\nexactlyTwo:" + exactlyTwo +
       " \natLeastOne: " + atLeastOne +
                "\natLeastTwo: " + atLeastTwo);*/




        //Zad 2
        /*Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();




        System.out.println("a: " + a + " b: " + b + " c: " + c);*/



        //Zad 3
        /*Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        a=scanner.nextInt();
        b=scanner.nextInt();
        scanner.close();
        System.out.println("Suma: " + (a+=b+c));*/



       //Zad 4
        /*Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        boolean var=(a%2==0 && b%2==0) ^ (a%3==0 && b%3==0) ^ (a%5==0 && b%5==0);
        System.out.println(var);
        scanner.close();*/



        //Zad 5








        //Zad 6

        Scanner in =new Scanner(System.in);
        System.out.print("Wprowadz liczbe ->  ");
        int liczba=in.nextInt();
        
        in.close();


    }                                                                                                                             
}
