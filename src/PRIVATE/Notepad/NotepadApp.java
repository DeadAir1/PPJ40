package PRIVATE.Notepad;

import java.util.Scanner;

public class NotepadApp {
    public static void main(String[] args) {
        System.out.println("Hi you open tour notepad\n" +
                "Here you have 5 options: \n" +
                "1.create\n" +
                "2.delete\n" +
                "3.review\n" +
                "4.write\n" +
                "5.read");
        System.out.print("Please type what you wanna do or type a number,if you want to exit just type it :");
        Scanner in=new Scanner(System.in);
        String command="";
        String [] commands={"create","delete","review","write","read"};
        while((command= in.next()).equals("exit")){
            switch (command ){

            }
        }



    }
}
