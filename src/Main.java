import java.util.Scanner;

public class Main {
    static boolean pair(int value){
        boolean pair=value%2==0;
        if(pair) return true ;
return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        int value=scanner.nextInt();
        if(pair(value)) System.out.println("Pair");
        else System.out.println("Not paired");
    }
}
