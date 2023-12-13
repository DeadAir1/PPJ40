package PPJ12;

import java.util.Arrays;

public class Main {
    static void selSort(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++)
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]<arr[i]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
    }
    static void sortRows(int arr[][]){
        for (int i = 0; i <arr.length ; i++) {
            selSort(arr[i]);
        }
    }
    static void sortCols(int arr[][]){
        for (int i = 0; i <arr[0].length ; i++) {
            for (int j = 0; j <arr.length; j++) {
                for (int k = j; k <arr.length ; k++) {
                    if(arr[k][i]<arr[j][i]){
                        int t=arr[k][i];
                        arr[k][i]=arr[j][i];
                        arr[j][i]=t;
                    }
                }
            }
            }
        }
    static void getAverages(int arr[][]){

    }
    static void printArr2D(int arr[][]){
        for (int i = 0; i <arr.length ; i++)
            System.out.println(Arrays.toString(arr[i]));
    }



    public static void main(String[] args) {
        int[][] a = { {3,2,6,1,3,5,6,1,3},
                {3,1,2,1,5,7,2},
                {8,9,2,1} };
        System.out.println("Before:");
        printArr2D(a);
        sortRows(a);
        System.out.println("After:");
        printArr2D(a);

        int[][] b = {   {3,2,6,1,6},
                        {7,1,2,1,5},
                        {5,3,1,8,7},
                        {8,9,2,7,1} };
        System.out.println("Now columns\nBefore:");
        printArr2D(b);
        sortCols(b);
        System.out.println("After:");
        printArr2D(b);
    }

}
