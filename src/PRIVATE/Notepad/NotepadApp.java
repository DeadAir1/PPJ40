package PRIVATE.Notepad;

public class NotepadApp {
    public static void main(String[] args) {
        NoteManager manager=new NoteManager();
       Note note=manager.create("file");
       System.out.println(note.getCreationDate());
        FileManager.write(note);
        FileManager.read(note);
        manager.review(note);
    }
}
