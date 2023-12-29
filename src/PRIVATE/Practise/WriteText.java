package PRIVATE.Practise;

import java.io.*;
import java.util.Scanner;

public class WriteText {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hi enter your text and i will write it");
        String text= scanner.next();
        File file=new File("src/PRIVATE/file.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(text);
                fileWriter.close();
        }catch(IOException e){
                e.printStackTrace();
        }
        }
}
