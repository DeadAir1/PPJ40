package PRIVATE.Wisielec;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        String word=WordList.getWord();
        int attemps=10;
        char[] secret=new char[word.length()];
        for (int i = 0; i < secret.length; i++) {
            secret[i]='_';
        }
        char maybe;
        Scanner in=new Scanner(System.in);
        boolean zgadnal=false;
        while(attemps>0 && !Arrays.equals(secret,word.toCharArray())){
            System.out.println(Arrays.toString(secret));
            System.out.print("Try to guess a char -> ");
                 maybe=in.next().charAt(0);
                    for (int i = 0; i <word.length() ; i++) {
                        if(zgadnal) break;
                        if(word.charAt(i)==maybe){
                            secret[i]=maybe;
                            zgadnal=true;
                        }
                    }
                    if(!zgadnal)
                        attemps--;
                    zgadnal=false;
        }
        in.close();
        if(attemps==0)
            System.out.println("You lose! The correct word was -> " + word);
        else {
            System.out.println("You won! The word was ->  " + word);
        }
    }
}
