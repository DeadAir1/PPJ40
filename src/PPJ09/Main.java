package PPJ09;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    static void rotateMatrix(int arr[][]){

    }
    public static void main(String[] args) {
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

               }
}
