package PRIVATE.Notepad;

import java.io.File;
import java.time.LocalDate;

public class NoteManager {

    static Note create(String title){
        LocalDate date= LocalDate.now();
        return new Note(title, date.toString());
    }
    static void delete(Note note){

    }
    static void review(){

    }
}
