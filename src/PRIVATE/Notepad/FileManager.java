package PRIVATE.Notepad;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    Note note;
    static int index;

    public FileManager(String title) {
        for (int i = 0; i <NoteManager.listOfNotes.length ; i++) {
            if(NoteManager.listOfNotes[i]!=null){
                if(NoteManager.listOfNotes[i].getName().equals(title)){
                    this.note=NoteManager.listOfNotes[i];
                    index=i;
                    break;
                }
            }
        }
    }
    void delete(){
        if(this.note==null){
            System.out.println("Note does not exists;");
            return;
        }
        String path=this.note.getPath();
            File file=new File(path);
            if(file.delete()) System.out.println("Note was deleted;");
            else System.out.println("Note was note deleted;");
            Note noteList[]=new Note[NoteManager.listOfNotes.length];
        for (int i = 0; i <NoteManager.listOfNotes.length-1 ; i++) {
            if(i<index) noteList[i]=NoteManager.listOfNotes[i];
            else noteList[i]=NoteManager.listOfNotes[i+1];

        }
        NoteManager.listOfNotes=noteList;
        rememberInformation();

    }

    void write() throws NullPointerException{
        if(this.note==null){
            System.out.println("Note does not exists;");
            return;
        }
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter text that will be added to you note: \n" +
                "If you want to finish write close:" );
        String text="";
        while(!(text=in.nextLine()).equals("close")) {
                try {
                    PrintWriter writer = new PrintWriter(new FileWriter(this.note.getPath(), true));
                    writer.println(text);
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Your text was written");

    }
    void edit(){
        try {
            File file = new File(this.note.getPath());
                if(file.exists()){
                    ProcessBuilder processBuilder=new ProcessBuilder("nano",this.note.getPath());
                    Process process= processBuilder.start();
                    process.waitFor();
                    System.out.println("Note edited;");
                }else System.out.println("Note was not edited;");
        }catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
     void read() throws NullPointerException{
        try {
           BufferedReader reader=new BufferedReader(new FileReader(this.note.getPath()));
            String line="";
            System.out.println("This is text from your note: \n" +
                    "===============");
            while((line=reader.readLine())!= null){
                System.out.println(line);
            }
            System.out.println("===============");
        }catch(IOException e ){
            e.printStackTrace();
        }
    }

    static void rememberInformation(){
        String path="C:/Users/Public/Documents/special.txt";
        try{
            File file=new File(path);
            if(!file.exists())
                file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            PrintWriter printWriter=new PrintWriter(new FileWriter(path));
            int i=0;
            while(NoteManager.listOfNotes[i]!=null){
                printWriter.println(NoteManager.listOfNotes[i].info());
                i++;
            }
            printWriter.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
    static Note[] getInformation(){
            Note [] note=new Note[10];
        String path="C:/Users/Public/Documents/special.txt";
        try{
            File file=new File(path);
            if(file.exists()){
                BufferedReader reader=new BufferedReader(new FileReader(path));
                int index=0;
                String line="";
                while((line=reader.readLine())!= null){
                    String name=line;
                    line=reader.readLine();
                    String path1=line;
                    line=reader.readLine();
                    String date=line;
                    note[index]=new Note(name,path1,date);
                    index++;
                }
            reader.close();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    return  note;
    }

}
