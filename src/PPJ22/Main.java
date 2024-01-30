package PPJ22;

import java.awt.*;
import java.io.*;
import java.util.Arrays;

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
        int n=0;
        String line="";
        String tab[];
        Person arr[];
        int counter=0;
        try{
            BufferedReader reader=new BufferedReader(new FileReader("src/PPJ22/file.txt"));
            line= reader.readLine();
            n=Integer.parseInt(line);
            arr=new Person[n];
            while((line=reader.readLine())!=null){
                tab=line.split(" ");
                if(tab.length==2){
                    arr[counter]=new Person(tab[0],Integer.parseInt(tab[1]));
                }else {
                    arr[counter]=new Person(tab[0],Integer.parseInt(tab[1]),new Car(tab[2],
                            new Color(Integer.parseInt(tab[3]),Integer.parseInt(tab[4]),Integer.parseInt(tab[5]))));
                }
                counter++;
            }
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i].toString());
            }
            System.out.println(Arrays.toString(Person.findAllCars(arr)));
            System.out.println(Arrays.toString(Person.findOwners(arr,"Mazda")));
            System.out.println(Person.findColor(arr,"Michael",1990));

        }catch(IOException e) {
            e.printStackTrace();
        }


    }
}
