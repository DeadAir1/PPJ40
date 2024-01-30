package PRIVATE.FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        int wrt=12345678;
        int toOut=0;
        //        128 64 32 16 8 4 2 1
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("src/PRIVATE/Practise/FileStream/out.bin");
            for (int i = 24; i >=0; i-=8) {
                    fileOutputStream.write((wrt >> i) & 0xFF);
                    //00000000 00000000 00000000 00000000
            }
            fileOutputStream.close();
            FileInputStream fileInputStream=new FileInputStream("src/PRIVATE/Practise/FileStream/out.bin");
            for (int i = 0; i < 4; i++) {
                int read=fileInputStream.read();
            if(read != -1){
                toOut=(toOut << 8) | read;
            }
            }


            fileInputStream.close();
            System.out.println(toOut);

        }catch(IOException  e){
            e.printStackTrace();

        }
    }
}
