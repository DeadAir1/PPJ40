package PPJ02;

import java.util.Scanner;
import javax.swing.*;
class Main{
    public static void main(String [] args){
        //Zad 1
/*		Scanner scanner=new Scanner(System.in);
		System.out.print("Print your height: ");
		double height=scanner.nextDouble();
		System.out.println();
		System.out.print("Print your weight: ");
		double weight=scanner.nextDouble();
		double BMI=weight/Math.pow(height,2);
		JOptionPane.showMessageDialog(null,"Your BMI is: " + BMI);
	*/

        //Zad 2
/*  Scanner scanner=new Scanner(System.in);
	System.out.print("Print first walue: ");
	double firstWalue=scanner.nextDouble();
	System.out.print("Print second walue: ");
	double secondWalue=scanner.nextDouble();
	System.out.print("What you wanna do? ");
	String sign=scanner.next();
	double result=0;
	if(sign.equals("+")){
		result=firstWalue+secondWalue;
		System.out.print("Your answer is: " + result);
	}
	if(sign.equals("-")){
		result=firstWalue-secondWalue;
		System.out.print("Your answer is: " + result);
	}
	if(sign.equals("*")){
		result=firstWalue*secondWalue;
		System.out.print("Your answer is: " + result);
	}
	if(sign.equals("/")){
		result=firstWalue/secondWalue;
		System.out.print("Your answer is: " + result);
	}
	*/

        //Zad 3
  /*
  Scanner scanner=new Scanner(System.in);
			System.out.print("Print a:");
			double a=scanner.nextDouble();
			System.out.print("Print b:");
			double b=scanner.nextDouble();
			System.out.print("Print c:");
			double c=scanner.nextDouble();
			if(a==0) {System.out.print("Your answer is:" + ((-1)*c)/b); return;
			}
			if(b==0){ System.out.print("x1:" + Math.sqrt((-1)*c/a)); return;
			}
			double x1=0;
			double x2=0;
			double delta=Math.pow(b,2)-4*a*c;
			if(delta<0) System.out.println("Nie ma pierwiastków");
			if(delta==0) {
				x1=b*(-1)/2*a;
				x2=x1;
				System.out.println("x1:" + x1 + " x2:" + x2);
			}
			if(delta>0){
				x1=(b*(-1)+Math.sqrt(delta))/2*a;
				x2=(b*(-1)-Math.sqrt(delta))/2*a;
				System.out.println("x1:" + x1 + " x2:" + x2);
			}
	*/
        //Zad 4
	/*
	Scanner scanner=new Scanner(System.in);
			System.out.print("Print a:");
			double a=scanner.nextDouble();
			System.out.print("Print b:");
			double b=scanner.nextDouble();
			System.out.print("Print c:");
			double c=scanner.nextDouble();
	if(a==b || b==c || a==c){
		System.out.println("OK");
		}else System.out.println("NOT OK");
	*/
        //Zad 5
/*
	Scanner scanner=new Scanner(System.in);
			System.out.print("Print a:");
			double a=scanner.nextDouble();
			System.out.print("Print b:");
			double b=scanner.nextDouble();
			System.out.print("Print c:");
			double c=scanner.nextDouble();
			if(a+b>c && b+c>a && a+c>b ){
					System.out.println("OK");
		}else System.out.println("NOT OK");
	*/


    }
}

