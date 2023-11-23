package PPJ_c07;


import java.util.Scanner;

class Main{
    public static void main(String [] args ) {
        //Zad 1
	/*
	Scanner scanner=new Scanner(System.in);
	int wrt=scanner.nextInt();
	boolean inA=(wrt>(-15) && wrt <=(-10)) || (wrt>(-5) && wrt<0) || (wrt>5 && wrt<10);
	boolean inB=(wrt<=-13) || (wrt>(-8) && wrt<=(-3));
	boolean inC=(wrt>=(-4));
	if(inA && inB && inC){
		System.out.println("Wrt nalezy do czesci wspolnej");
	}else {System.out.println("Wrt nie nalezy do czesci wspolnej");}
	*/


        //Zad 2
	/*Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	if(!(a<b) && !(a>b)){
		System.out.println("Warunek podany spelniony");
	}else System.out.println("Warunek podany nie spelniony");

	if((a==b)){
		System.out.println("Warunek zmieniony spelniony");
	}else System.out.println("Warunek zmieniony nie spelniony");
	*/
        //Zad 3
	/*
	Scanner scanner=new Scanner(System.in);
	System.out.print("Podaj rok: ");
	int year=scanner.nextInt();
	System.out.print("Podaj miesiac :");
	int month=scanner.nextInt();
	boolean dni31=(month%2 != 0 || month == 8);
	boolean yearP=(year%400 != 0) && (year%100 !=0 && year%4 ==0);
	if(dni31){System.out.println("31 dni");
	return;
	}else if(!dni31 && month!=2){
		System.out.println("30 dni");
	return;
	}else if(month==2 && yearP){
		System.out.println("29 dni");
	return;
	}else if(month==2 && !yearP){System.out.println("28 dni");
	}
			*/
        //Zad 4
	/*Scanner scanner=new Scanner(System.in);
	char ch =scanner.next.charAt(0);
	String samogloski="aeiouy";
	if(samogloski.contains(ch)){
		System.out.println("Jest");
	}else System.out.println("Nie jest");*/

//Zad 5
    /*    java.util.Scanner in =new java.util.Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        in.close();
        boolean same=a-b<0.01;
        System.out.println(same);*/



        //Zad 6
        System.out.println("Hello");
        for (int i = 0; i <10 ; i++) {
            System.out.println("i");
        }


    }


    }


