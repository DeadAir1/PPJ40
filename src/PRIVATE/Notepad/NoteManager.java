package PRIVATE.Notepad;

import java.io.File;
import java.time.LocalDate;

public class NoteManager {
     static Note[] listOfNotes=FileManager.getInformation();
     static int index=0;


   static void create(String title){
        LocalDate date= LocalDate.now();
        Note note= new Note(title,"src/PRIVATE/Notepad" + "/"+ title + ".txt", date.toString());
        listOfNotes[index]=note;
        index++;
    }
     void delete(Note note){

    }
     static void review(String title){
         for (int i = 0; i < listOfNotes.length ; i++) {
             if(listOfNotes[i].getName().equals(title))
                 System.out.println(listOfNotes[i].toString());
             break;
         }
    }
    static void showListOfNotes(){
        int i=0;
        System.out.println("============");
       while(listOfNotes[i]!=null){
           System.out.println(listOfNotes[i].getName());
           i++;
       }
        System.out.println("============");
    }
    static void help(){
        System.out.println("This notepad, created by Oleksandr Voloshyn;\n" +
                "Student of PJATK,student number s27565;\n"+
                "Here you have 7 options: \n" +
                "1.create;\n" +
                "2.delete;\n" +
                "3.review;\n" +
                "4.write;\n" +
                "5.read;\n" +
                "6.show my notes;\n" +
                "7.exit;"
        );
    }
}
