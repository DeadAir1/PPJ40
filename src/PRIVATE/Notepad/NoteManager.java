package PRIVATE.Notepad;

import java.io.File;
import java.time.LocalDate;

public class NoteManager {

     Note create(String title){
        LocalDate date= LocalDate.now();
        return new Note(title, date.toString());
    }
     void delete(Note note){

    }
     void review(Note note){
        System.out.println(note.toString());
    }
}
