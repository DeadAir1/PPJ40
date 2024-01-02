package PRIVATE.Notepad;

import java.io.File;
import java.util.Scanner;

public class NotepadApp {
    public static void main(String[] args) {
        System.out.println("Hi you opened your notepad,\nif you need help,type it;"
        );
        Scanner in=new Scanner(System.in);
        String command="";
        while(!(command= in.nextLine()).equals("exit")){
            switch (command ){
                case "help":{
                    NoteManager.help();
                }break;
                case "create": {
                    System.out.println("Please type title for your note:");
                    String title=in.next();
                    NoteManager.create(title);
                }break;
                case "delete":
                    System.out.println("Sorry i have no idea how to delete it");
                    break;
                case "review":{
                    System.out.println("Please type the title of note to get info:");
                    String title=in.next();
                    NoteManager.review(title);
                }
                break;
                case "write":{
                    System.out.println("Please type the title of note you want write to:");
                    String title=in.next();
                    FileManager fileManager=new FileManager(title);
                    fileManager.write();
                }
                break;
                case "read"  : {
                    System.out.println("Please type the title of note you want read :");
                    String title=in.next();
                    FileManager fileManager=new FileManager(title);
                    fileManager.read();
                }
                break;
                case "show my notes": {
                    NoteManager.showListOfNotes();
                }
                    break;
                case "exit":{
                    FileManager.rememberInformation();
                    return;
                }
            }



    }
}
}
