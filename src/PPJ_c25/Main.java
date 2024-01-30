package PPJ_c25;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

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
 /*   String name="inputDataX.txt";
    int arr[]=new int[10];
    for (int i = 0; i < name.length(); i++) {
            File file=new File("src/PPJ_c25/"+name.charAt(i) +".txt");
            try{
            FileWriter fileWriter=new FileWriter(file.getPath());
            for (int j = 0; j < arr.length; j++) {
                arr[j]=(int)(Math.random()*1000-1);
            }
                for (int j = 0; j < arr.length-1; j++) {
                    for (int k = j+1; k < arr.length; k++) {
                        if(arr[k]<arr[j]){
                            int t=arr[k];
                            arr[k]=arr[j];
                            arr[j]=t;
                        }
                    }
                }
                for (int j = 0; j <arr.length ; j++) {
                    fileWriter.write(arr[j] + "");
                    fileWriter.write('\n');
                }
                fileWriter.close();


        }catch(IOException e){
            e.printStackTrace();
        }

      }*/
        //Zad 4
    /*     String name="inputData.txt";
       int arr[]=new int[9];
       int indexs[]=new int[9];
       boolean finished=false;
        Arrays.fill(arr, -1);
        while(!finished) {
            finished=true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == -1) {
                    arr[i]=read("src/PPJ_c25/" + name.charAt(i) + ".txt", indexs[i]);
                indexs[i]++;
                }
            }
            int min=1000;
            int counter=0;
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]<min && indexs[i]!=10) {min=arr[i];
                counter=i;
                }

            }
            System.out.println(min);
            try {
                FileWriter fileWriter = new FileWriter("src/PPJ_c25/file.txt",true);
                fileWriter.write(min + " ");
                fileWriter.write('\n');
                arr[counter]=-1;
                fileWriter.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            for (int i = 0; i < indexs.length ; i++) {
                if(indexs[i]!=10) finished=false;
            }
        }*/
        //Zad 5
        InputStream stream=System.in;
        int a=0;
        try {
            a=stream.read();

        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(a);



    }
    public static int read(String path,int index){
        if(index>10) return -1;
        String result=" ";
        int ans=0;
        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader(path));
            for (int i = 0; i <= index; i++) {
                result= bufferedReader.readLine();
            }
            if(!(result.equals(" "))) ans=Integer.parseInt(result);
        }catch(IOException e){
            e.printStackTrace();
        }

   return ans;
    }
}
