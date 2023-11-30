package PPJ_c13;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    static void printMatrix(int arr[][]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]<10 && arr[i][j]>=0)
                    System.out.print( "  " + arr[i][j]);
                else  System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
    //FUNKCJA DO ZADANIA 3
    static void show(int a){
        System.out.println(a);
    }
    //FUNKCJA DO ZADANIA 4
    static void modifyValue(int wrt){
        show(wrt);
        wrt*=5;
        show(wrt);
    }
    //FUNKCJA DO ZADANIA 5
    static int findMax(int a,int b,int c){
        if(a>=b && a>=c) return a;
        if(b>=c && b>=a) return b;
    return c;
    }
    //FUNKCJA DO ZADANIA 6
    static int[] func(int a[],int b[],int wrt){
        int arr[]=null;
        if (wrt<0){
            arr=new int[Math.min(a.length, b.length)];
            for (int i = 0; i <arr.length ; i++) {
                arr[i]=b[i]+a[i];
            }
        }
        else if(wrt>0){
            boolean aLonger= a.length > b.length;
            arr=new int[aLonger ? a.length-b.length : b.length-a.length];
            for (int i = 0; i <arr.length ; i++) {
                if(aLonger){
                    arr[i]=a[i+b.length];
                }
                else{ arr[i]=b[i+a.length];
                }
            }
        }

             return arr;
    }
    public static void main(String[] args) {
        //Zad 1
       /* int arr[][]={
                {1,0,0,0,0},
                {0,1,0,0},
                {0,0,1}
        };
        int size=0;
        for (int i = 0; i <arr.length ; i++) {
            size+=arr[i].length;
        }
        int counter=0;
        int arr1[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[counter]=arr[i][j];
                counter++;

            }
        }
        System.out.println(Arrays.toString(arr1));*/


        //Zad 2
   /*     int[][] arr = {
                {1,4,3,4,5,3},
                {2,2,4,5,2,7},
                {7,4,5,6,7,8},
                {9,5,6,7,8,9}
        };
        int tab[]=new int[arr[0].length];
        int arr1[][]=new int[arr.length][];
        int index=0;
        boolean jest=false;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                for (int k = 0; k < tab.length; k++) {
                    if(tab[k]==arr[i][j]) {
                        jest=true;
                        break;
                    }
                }
                if(!jest){
                    tab[index]=arr[i][j];
                    index++;
                }
                jest=false;

            }
            index=0;
            int a=0;
            while(tab[a]!=0){
                a++;
            }
            arr1[i]=new int[a];
            for (int j = 0; j <arr1[i].length ; j++) {
                arr1[i][j]=tab[j];
                tab[j]=0;
            }
            a=0;
        }
        printMatrix(arr1);*/


        //Zad 3
        /*int a=9;
        show(a);*/

        //Zad 4
       /* int wrt=5;
        show(wrt);
        modifyValue(wrt);
        show(wrt);*/


        //Zad 5
       /* int a=3,b=5,c=7;
        System.out.println(findMax(a,b,b));*/


        //Zad 6
        int wrt=-10;
        int a[]=new int[9];
        int b[]=new int[10];
        for (int i = 0; i <a.length ; i++) {
            a[i]=(int)(Math.random()*10+1);
            b[i]=(int)(Math.random()*10+1);
        }
        b[9]=12;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.toString(func(a,b,wrt)));

    }
}

