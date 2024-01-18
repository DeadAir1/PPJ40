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
/*    String name="inputDataX.txt";
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
                arr[j]=(int)(Math.random()*1000-1);
            }
                for (int j = 0; j < arr.length-1; j++) {
                    for (int k = i; k < arr.length; k++) {
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
       /* String name="inputDataX.txt";
        int arr[]=new int[name.length()];
        File[] fileArr=new File[name.length()];
        for (int i = 0; i < name.length(); i++) {
            fileArr[i] = new File("src/PPJ_c25/" + name.charAt(i) + ".txt");
        }
        for (int i = 0; i < fileArr.length ; i++) {
            try{
              BufferedReader bufferedReader=new BufferedReader(new FileReader(fileArr[i].getPath()));
              String line= bufferedReader.readLine();
              arr[i]=Integer.parseInt(line);
          } catch (IOException e){
              e.printStackTrace();
          }
            System.out.println(Arrays.toString(arr));

            for (int j = 0; j < arr.length-1; j++) {
                for (int k = j; k <arr.length ; k++) {
                    if(arr[k]<arr[j]){
                        int t=arr[k];
                        arr[k]=arr[j];
                        arr[j]=t;
                    }
                }
            }
            try {
                FileWriter fileWriter = new FileWriter("src/PPJ_c25/numbers.txt",true);
                for (int j = 0; j <arr.length ; j++) {
                    fileWriter.write(arr[j] + "");
                    fileWriter.write('\n');
                }
                fileWriter.close();
            }catch(IOException e){
                e.printStackTrace();
            }


    }*/
    }

}
