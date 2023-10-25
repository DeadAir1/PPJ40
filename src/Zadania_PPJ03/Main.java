package Zadania_PPJ03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zad 1
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz a: ");
        boolean a=scanner.nextBoolean();
        System.out.println("Wprowadz b: ");
        boolean b=scanner.nextBoolean();
        System.out.println("Wprowadz c: ");
        boolean c=scanner.nextBoolean();
        scanner.close();
        boolean allThree = a && b && c;
        boolean exactlyOne = (a && !b && !c ) || (b && !a && !c ) || (c && !b && !a);
        boolean exactlyTwo = (a && b && !c) || (b && c && !a) || (a && c && !b);
        boolean atLeastOne = a || b || c;
        boolean atLeastTwo = (a && b ) || (b && c ) || (a && c );
        System.out.println("a, b, c =" + a +", "+ b + ","+c + "\nallThree: " + allThree +
                "\nexactlyOne: " +exactlyOne +
        "\nexactlyIwo:" + exactlyTwo +
       " \natLeastOne: " + atLeastOne +
                "\natLeastTwo: " + atLeastTwo);*/


        //Zad 2
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();


        System.out.println("a: " + a + " b: " + b + " c: " + c);
    }
}
