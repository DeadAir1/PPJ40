package PRIVATE.Notepad;

import java.io.File;
import java.time.LocalDate;

public class NoteManager {
     static Note[] listOfNotes=new Note[10];
     static int index=0;

    public NoteManager() {
        listOfNotes=FileManager.getInformation();
    }

    void create(String title){
        LocalDate date= LocalDate.now();
        Note note= new Note(title,"src/PRIVATE/Notepad" + "/"+ title + ".txt", date.toString());
        listOfNotes[index]=note;
        index++;
    }
     void delete(Note note){

    }
     void review(String title){
         for (int i = 0; i < listOfNotes.length ; i++) {
             if(listOfNotes[i].getName().equals(title))
                 System.out.println(listOfNotes[i].toString());
             break;
         }
    }
    void showListOfNotes(){
        int i=0;
        System.out.println("============");
       while(listOfNotes[i]!=null){
           System.out.println(listOfNotes[i].getName());
           i++;
       }
        System.out.println("============");
    }
}
