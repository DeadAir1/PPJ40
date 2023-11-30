package PPJ09;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //FUNKCJA DLA ZADANIA 2
    static void function(int [][]arr){
        int sumRow=0, sumCol=0,counterRow=0,
         counterCol=0, rowNumber=0, colNumber=0;
        for (int i = 0; i <arr.length ; i++) {
            counterRow=0;
            for (int j = 0; j <arr[i].length ; j++) {
                counterRow+=arr[i][j];

            }
            if(sumRow<counterRow){
                sumRow=counterRow;
                rowNumber=i;
            }

        }
        for (int i = 0; i <arr[0].length ; i++) {
            counterCol=0;
            for (int j = 0; j <arr.length ; j++) {
                counterCol+=arr[j][i];
            }
            if(sumCol<counterCol){
                sumCol=counterCol;
                colNumber=i;
            }
        }
        System.out.printf("Highest sum in row -> %d and this equals %d \n" +
                "Highest sum in column %d and this equals %d",rowNumber,sumRow,colNumber,sumCol);


    }


    //FUNKCJA DO ZADANIA 3

    static int[] func(int arr[][]){
        int max=0;
        int arr1[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            max=0;
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max){
                max=arr[i][j];
                }
            }
            arr1[i]=max;
        }

    return arr1;
    }


    //FUNKCJA DO ZADANIA 4

    static int[][] rotateMatrix(int arr[][]){
        int counter=0;
        int arr1[][]=new int[4][4];
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = 0; j < arr.length; j++) {
                arr1[j][counter]=arr[i][j];
            }
            counter++;
        }


   return arr1;
    }

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


    //FUNKCJA DO ZADANIA 5

    static void zerosMatrix(int arr[][]){
        int counter=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==0) {
                    counter++;
                    break;
                }
            }
        }
        int x[]=new int[counter];
        int y[]=new int[counter];
        counter=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==0) {
                     x[counter]=j;
                     y[counter]=i;
                     counter++;
                        break;
                }
            }
        }
        for (int  i= 0; i <y.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr[y[i]][j]=0;
            }
            for (int j = 0; j <arr.length ; j++) {
                arr[j][x[i]]=0;
            }
        }

    }
    public static void main(
            String[] args) {
        //Zad 1
        /*int[][] arr = {
                {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9}
        };
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i][arr[i].length-1];
        }
        System.out.println(sum);
        */


        //Zad 2
        /*int arr[][]={
                {1,3,2},
                {3,4,8},
                {2,6,8},
                {1,8,5}
        };
        function(arr);*/

        //Zad 3
       /* int arr[][]= {
                {1, 3},
                {3, 4, 5, 8},
                {6, 8},
                {1, 9, 6}
        };
        System.out.println(Arrays.toString(func(arr)));*/

        //Zad 4
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,7,5,3},
                {8,6,4,2}
        };
        printMatrix(arr);
        rotateMatrix(arr);
        System.out.println("---------------------------");
        printMatrix(rotateMatrix(arr));

        //Zad 5
      /*  int[][] arr = {
                {  4,  9, 10,  0,  1,  2 },
                {  7, -8, 20,  1,  5,  8 },
                {  1,  8,  3,  2,  1, -3 },
                {  1,  8, -3,  2, 11, -3 },
                { 17,  0,  5, -9, 21, 10 }
        };
        printMatrix(arr);
        zerosMatrix(arr);
        System.out.println("-----------------------------------------------------");
        printMatrix(arr);*/



 //Zad 6
       /* String[][] arr =
                { {"Kenya",  "Nairobi"},
                        {"Rwanda", "Kigali"},
                        {"Gambia", "Banjul"},
                        {"Ghana",  "Accra"},
                        {"Niger",  "Niamey"},
                        {"Zambia", "Lusaka"} };
        Scanner in=new Scanner(System.in);
        String pobrane=in.next().toLowerCase();
        String answer="";
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][0].equalsIgnoreCase(pobrane)){
                    answer=arr[i][1];
                }
            }
        }
        System.out.println("It's your answer -> " + answer);*/


    }
}
