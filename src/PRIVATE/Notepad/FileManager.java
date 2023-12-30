package PRIVATE.Notepad;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    static void write(Note note){
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter text that will be added to you note: \n" +
                "If you want to finish write close:" );
        String text="";
        while(!(text=in.nextLine()).equals("close")){
            try {
                PrintWriter writer = new PrintWriter(new FileWriter(note.getPath(), true));
                writer.println(text);
                writer.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("Your text was writted");

    }
    static void read(Note note){
        try {
           BufferedReader reader=new BufferedReader(new FileReader(note.getPath()));
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
}
