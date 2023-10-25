package PPJ03;

public class Main {
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
   /*     int a1=4;
        int a2=15;
        int b1=7;
        int b2=20;
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        scanner.close();
            boolean inA= (x>=a1 && x<=a2);
            boolean inB= (x>=b1 && x<=b2);
            boolean roznicaA = (x>=a1 && x<b1);    ;
            boolean roznicaB= (x>a2);
            boolean iloczyn=(x>=b1 && x<=a2);
            boolean suma=(x>=a1 &&  x<=b2);
            boolean roznicaSymetryczna=(x>=a1 && x<b1) || (x>a2 && x<=b2);
                System.out.println("Interval A: " + "[" + a1 + "," +a2 + "]\n" +
                        "Interval B: " +"[" + b1 + "," +b2 + "]\n" +
                        "x in A: " + "       " +  inA + '\n' +
                        "x in B: " + "       " +  inB + '\n' +
                        "x in A/B:" + "      " + roznicaA + '\n' +
                        "x in B/A:" + "      " + roznicaB + '\n' +
                        "x iloczyn:"+ "     " + iloczyn + '\n' +
                        "x suma:" + "        " + suma + '\n' +
                        "x roznica symetryczna: " + "      " +roznicaSymetryczna );*/
    }
}
