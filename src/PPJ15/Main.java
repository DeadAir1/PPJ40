package PPJ15;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zad 1
      /*  Child[] children=new Child[3];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < children.length; i++) {
            System.out.print("Name of the child no " + i + " -> ");
            children[i]=new Child(scanner.next());
        }
        Child.printChildren(children);
       String name1=" ", name2="";
        while(true){
            System.out.print("Podaj imie 1 dziecka -> ");
            name1=scanner.next();
            if(name1.charAt(0)=='q')
                break;
            System.out.print("Podaj imie 2 dziecka -> ");
            name2=scanner.next();
            Child.getChildByName(children,name1).givesCandyTo(Child.getChildByName(children,name2));
            Child.printChildren(children);
        }*/

        //Zad 2
        // we want doubles to be printed with a dot
        Locale.setDefault(Locale.US);

        Square[] sqs = {
                new Square(2), new Square(1), new Square(3)
        };

        System.out.print("Squares: ");
        for (Square s : sqs)
            System.out.print(s + " ");
        System.out.print("\nAreas: ");
        for (Square s : sqs)
            System.out.print(s.getArea() + " ");
        System.out.print("\nPerimeters: ");
        for (Square s : sqs)
            System.out.print(s.getPerimeter() + " ");
        System.out.print("\nInscribed circles: ");
        for (Square s : sqs)
            System.out.print(s.getInscribedCircle() + " ");
        System.out.print("\nCircumscribed circles: ");
        for (Square s : sqs)
            System.out.print(s.getCircumscribedCircle() + " ");

        System.out.println("\n\n...and now circles from squares...");
        Circle[] circles = Square.getCircles(sqs);
        System.out.print("Circles: ");
        for (Circle c : circles)
            System.out.print(c + " ");
        System.out.print("\nAreas: ");
        for (Circle c : circles)
            System.out.print(c.getArea() + " ");
        System.out.print("\nInscribed squares: ");
        for (Circle c : circles)
            System.out.print(c.getInscribedSquare() + " ");
        System.out.print("\nCircumscribed squares: ");
        for (Circle c : circles)
            System.out.print(c.getCircumscribedSquare() + " ");

        System.out.println("\n\n...and back to squares...");
        Square[] squares = Circle.getSquares(circles);
        System.out.print("Squares: ");
        for (Square s : squares)
            System.out.print(s + " ");
        System.out.println();

    }

    }

