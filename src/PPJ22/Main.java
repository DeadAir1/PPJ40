package PPJ22;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Zad 1
/*        try{
            FileInputStream fis=new FileInputStream("C:/Users/s27565/IdeaProjects/PPJ40/src/PPJ01/Main.class");
        int bajt=0;
        String word="";
        while((bajt= fis.read())!=-1){
            if((bajt>='A' && bajt<='Z') || (bajt>='a' && bajt <='z')){
                word+=(char)bajt;
            }else if(word.length()!=0 && word.length()>=4) {
                System.out.println(word);
                word="";
            }
        }
            if(word.length()!=0 && word.length()>=4)
                System.out.println(word);


        }catch (IOException e){
            e.printStackTrace();
        }*/
        //Zad 2
        try{
            BufferedReader bufferedReader =new BufferedReader(new FileReader("src/PPJ22/file.txt"));
            String line;
            while((line= bufferedReader.readLine())!=null){
                String name;
                int birthYear;
                String make;
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
