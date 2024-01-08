package PRIVATE.Wyjatki;

import java.util.Scanner;

public class Czytac {
    public String read(){
        System.out.println("Enter a name!");
        Scanner in=new Scanner(System.in);
        String name=in.next();
        if(name.equals("Oleksandr")){
            throw new MyExcept("It's not allowed to have the same name!");
        } else return name;
    }
}
