package PPJ01;

public class Main {
    public static void main(String[] args) {
        //Zad 1
	/*
	Scanner scanner=new Scanner(System.in);
			System.out.print("Print a:");
			int a=scanner.nextInt();
			System.out.print("Print b:");
			int b=scanner.nextInt();
			System.out.print("Print c:");
			int c=scanner.nextInt();
			System.out.println("a: " + a + " b: " + b + " c: "  + c);
			int help=0;
			if(a<b && b<c){System.out.println("a: " + a + " b: " + b + " c: "  + c);
			return;
			}
			if(b>c){
				help=c;
				c=b;
				b=help;
			}
			if(a>c){
				help=c;
				c=a;
				a=help;
			}
			if(a>b){
				help=b;
				b=a;
				a=help;
			}


			System.out.println("a: " + a + " b: " + b + " c: "  + c);
	*/
        //Zad 2(1)
   /*     int liczba = 679;
        int binarny = 0b001010100111;
        System.out.println("Dzisientny: " + liczba);
        System.out.println("Binarny: " + Integer.toBinaryString(liczba));
        System.out.println("Octadecymalny: " + Integer.toOctalString(liczba));
        System.out.println("Hexadecymalnym: " + Integer.toHexString(liczba));*/
        //Zad 2(2)
      /*  char a='A';
        System.out.println(a);
        System.out.println('A' + 0);
        //W tabliczce utf-8 A znajdujew sie na miejscu 65
        */
        //Zad 2(3)
      /*  System.out.println('!' + '!');
        System.out.println((char)('!' + '!'));
        //W tabliczce utf-8 B znajdujew sie na miejscu 66 a '!' na 33
*/
        //Zad 2(5)
    /*boolean a=false;
    boolean b=true;
        System.out.println(a^b);
        //True wtw kiedy maja rozne znaczenia\]
        */
        //Zad 2(8)
        /*short a=5,b=6;
        short c=(short)(a+b);
        System.out.println(c);
        //Bo dostajemy wynnik typu int i musimy go przekonwertowac do short*/
        //Zad 2(9)
        /*long a=1500000000;
        long b=1500000000;
        System.out.println(a+b);*/
        //Int jest zamaly zeby przechowac te wartosci
//Zad 3
      /*  int a=Integer.parseInt(JOptionPane.showInputDialog(System.in));

        int b=Integer.parseInt(JOptionPane.showInputDialog(System.in));

        int c=Integer.parseInt(JOptionPane.showInputDialog(System.in));

            System.out.println(a);

            System.out.println(b);

            System.out.println(c);

            if(a<b && b<c) {System.out.println("Srodkowa liczba to: " + b);
                return;
            }
            if(a>b && a<c) {System.out.println("Srodkowa liczba to: " + a);
                return;
            }
            if(c>a && c<b) {System.out.println("Srodkowa liczba to: " + c);
                return;
            }
            if(a>b && b>c) System.out.println("Srodkowa liczba to: " + b);*/
        //Zad 4
        /*int suma=0;
        for (int i = 0; i <5 ; i++) {
            int liczba=Integer.parseInt(JOptionPane.showInputDialog(System.in));
            if(i>1){
                suma+=liczba;
            }
        }
        System.out.println(suma);
*/
        //Zad 5
      /*  int a = Integer.parseInt(JOptionPane.showInputDialog(System.in));
        System.out.println(a);
        int b = Integer.parseInt(JOptionPane.showInputDialog(System.in));
        System.out.println(b);
        int c = Integer.parseInt(JOptionPane.showInputDialog(System.in));
        System.out.println(c);
        int d = Integer.parseInt(JOptionPane.showInputDialog(System.in));
        System.out.println(d);

       //Szukamy najmniejsza
        int minAB=a < b ? a : b;
        int minCD=c < d ? c : d;
        int min=minAB < minCD ? minAB : minCD;
        //Szukamy Najwieksza
        int maxAB=a > b ? a:b;
        int maxCD=c > d ? c:d;
        int max=maxAB > maxCD ? maxAB : maxCD;
        System.out.println("Roznica to: " + (max-min));*/

        //Zad 6
       /* int a=Integer.parseInt(JOptionPane.showInputDialog(System.in));
        int b=Integer.parseInt(JOptionPane.showInputDialog(System.in));
        if(a==b){
            System.out.println("NWD is: " + a);
        }else{
            while(a!=b){
                if(a>b){
                a=a-b;
                }else if(b>a){
                    b=b-a;
                }
            }System.out.println("NWD is: " + a);

        }*/
        //Zad 8
        /*int a=Integer.parseInt(JOptionPane.showInputDialog(System.in));
        System.out.println(first(a));
*/
    }
        /*static boolean first(int  liczba){
        boolean answer = true;
        if(liczba == 0 || liczba==1) return false;
            for (int i = 2; i <=liczba/2 ; i++) {
                if(liczba%i==0){
                    answer=false;
                }
            }
                return answer;
    }*/
}