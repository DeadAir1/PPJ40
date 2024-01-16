package PPJ_c25;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Zad 1
       /* int [] arr=new int[256];
        try{
            FileInputStream fis=new FileInputStream("src/PPJ_c25/file.txt");
           int read=0;
           int tmp=0;
            while ((read=fis.read())!=-1){
                ++arr[read];
            }
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                System.out.println(arr[i]+" " + i + " " + (char)i);
            }
        }*/
        //Zad 2
        /*try{
            FileInputStream fis=new FileInputStream("src/PPJ_c25/zad1.txt");
            int read=0;
            int wrt=0;
            while((read = fis.read())!=-1) {
                 if(read>='0'){
                     wrt = wrt*10 + read -'0';
                 }else {
                     System.out.println(wrt);
                     wrt=0;
                 }

            }
            System.out.println(wrt);
        }catch(IOException e){
            e.printStackTrace();
        }*/

        //Zad 3
    String name="inputData.txt";
    int arr[]=new int[10];
    for (int i = 0; i < name.length(); i++) {
            File file=new File("src/PPJ_c25/"+name.charAt(i) +".txt");
            if(!file.exists()){
                try{
                file.createNewFile();
            }catch(IOException e){
                    e.printStackTrace();
                }
            }
            try{
            FileWriter fileWriter=new FileWriter(file.getPath());
            for (int j = 0; j < arr.length; j++) {
                arr[i]=(int)(Math.random()*1000-1);

            }

        }catch(IOException e){
            e.printStackTrace();
        }

        }



    }

}
