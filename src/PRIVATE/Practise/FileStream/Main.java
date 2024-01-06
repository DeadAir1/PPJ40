package PRIVATE.Practise.FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi enter a number -> ");
        Scanner in=new Scanner(System.in);
        int wrt=in.nextInt();
        int out=0;
        in.close();
        try{
            FileOutputStream fos=new FileOutputStream("out1.bin");
            for (int i = 24; i >=0 ; i-=8) {
                fos.write((wrt >> i) & 0xFF);
            }
            fos.close();
            FileInputStream fis=new FileInputStream("out1.bin");
            for (int i = 0; i <4 ; i++) {
                out = out << 8 | fis.read();
            }
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(out);
    }
}
