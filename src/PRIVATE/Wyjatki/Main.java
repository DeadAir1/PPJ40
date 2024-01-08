package PRIVATE.Wyjatki;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws MyExcept {
            Czytac in=new Czytac();
            try{
        System.out.println(in.read());
    }catch(MyExcept e){
                System.out.println("Noob");
            }
        System.out.println("Try again!");
        System.out.println(in.read());
    }
}
