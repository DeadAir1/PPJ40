package PRIVATE.Notepad;

import java.io.File;
import java.util.Scanner;

public class NotepadApp {
    public static void main(String[] args) {
        NoteManager noteManager=new NoteManager();
        System.out.println("Hi you opened your notepad\n" +
                "Here you have 6 options: \n" +
                "1.create\n" +
                "2.delete\n" +
                "3.review\n" +
                "4.write\n" +
                "5.read\n" +
                "6.show my notes\n" +
                "7.exit"
        );
        System.out.print("Please  type a number,if you want to exit just type it :");
        Scanner in=new Scanner(System.in);
        int command=-1;
        while((command= in.nextInt())!=8){
            switch (command ){
                case 1: {
                    System.out.println("Please type title for your note:");
                    String title=in.next();
                    noteManager.create(title);
                }break;
                case 2:
                    System.out.println("Sorry i have no idea how to delete it");
                    break;
                case 3:{
                    System.out.println("Please type the title of note to get info:");
                    String title=in.next();
                    noteManager.review(title);
                }
                break;
                case 4:{
                    System.out.println("Please type the title of note you want write to:");
                    String title=in.next();
                    FileManager fileManager=new FileManager(title);
                    fileManager.write();
                }
                break;
                case 5: {
                    System.out.println("Please type the title of note you want read :");
                    String title=in.next();
                    FileManager fileManager=new FileManager(title);
                    fileManager.read();
                }
                break;
                case 6: {
                    noteManager.showListOfNotes();
                }
                    break;
                case 7:{
                    FileManager.rememberInformation();
                    return;
                }
            }



    }
}
}
