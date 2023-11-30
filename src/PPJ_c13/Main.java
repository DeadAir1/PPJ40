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
    static void show(int a){
        System.out.println(a);
    }
    static void modifyValue(int wrt){
        show(wrt);
        wrt*=5;
        show(wrt);
    }
    static int findMax(int a,int b,int c){
        if(a>=b && a>=c) return a;
        if(b>=c && b>=a) return b;
    return c;
    }
    static int[]func(int a[],int b[],int wrt){
        int arr[]=new int[Math.min(a.length, b.length)];;
        if (wrt<0){
            for (int i = 0; i <arr.length ; i++) {
                arr[i]=b[i]+a[i];
            }
        }
        else if(wrt>0){

        }


    return arr;}
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
        /*int[][] arr = {
                {1,4,3,4,5,3},
                {2,2,4,5,2,7},
                {7,4,5,6,7,8},
                {9,5,6,7,8,9}
        };
        int arr1[][]=new int[arr.length][];*/


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
        int wrt=10;
        int a[]=new int[10];
        int b[]=new int[10];
        for (int i = 0; i <a.length ; i++) {
            a[i]=(int)(Math.random()*10+1);
            b[i]=(int)(Math.random()*10+1);
        }

    }
}

