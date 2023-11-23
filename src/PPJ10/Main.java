package PPJ10;

import java.util.Arrays;

public class Main {
    public static int[] func(int[][] arr){
        int arr1[]=new int[2];
        int counterPair=0;
        int counterNotPair=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0) counterPair++;
                else counterNotPair++;
            }
        }
        arr1[0]=counterPair;
        arr1[1]=counterNotPair;
    return arr1;
    }
    static int indeksPanstwa(String panstwo){
        int indeks=switch (panstwo){
            case "Germany":
                yield 0;
            case "Ireland":
                yield 1;
            case "Poland":
                yield 2;
            case "Scotland":
                yield 3;
            default :
                System.out.println("Nie ma tego panstwa");
                yield -1;

        };
        return indeks;

    }

    static int[][] inner(int arr[][]){
        int counter=0,counter2=0;
        int arr1[][]=new int[arr.length-2][arr[1].length-2];
        for (int i = 1; i <arr.length-1 ; i++) {
            for (int j = 1; j <arr[i].length-1 ; j++) {
                arr1[counter][counter2]=arr[i][j];
            counter2++;
            }
            counter2=0;
        counter++;
        }
    return arr1;
    }
    static int[][] trans(int arr[][]){
        int arr1[][]=new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr1[j][i]=arr[i][j];
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        //Zad 1
        /*int arr[][]={{1,2,3,4,5},{1,9},{3,1,8}};
        int arr1[]=func(arr);
        for (int a:arr1) System.out.println(a);*/

        //Zad 2
      /*  String[][] arr =
                { {"Germany",  "2", "Scotland", "1"},
                        {"Poland",   "2", "Germany",  "0"},
                        {"Germany",  "1", "Ireland",  "1"},
                        {"Poland",   "2", "Scotland", "2"},
                        {"Scotland", "1", "Ireland",  "0"},
                        {"Ireland",  "1", "Poland",   "1"},
                        {"Ireland",  "1", "Scotland", "1"},
                        {"Germany",  "3", "Poland",   "1"},
                        {"Scotland", "2", "Germany",  "3"},
                        {"Ireland",  "1", "Germany",  "0"},
                        {"Scotland", "2", "Poland",   "2"},
                        {"Poland",   "2", "Ireland",  "1"}
                };
        int punkty[]=new int[4];
        for (int i = 0; i < arr.length ; i++) {
            if(Integer.parseInt(arr[i][1]) > Integer.parseInt(arr[i][3])){
                punkty[indeksPanstwa(arr[i][0])]+=3;
            } else if  (Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[i][3])){
                punkty[indeksPanstwa(arr[i][2])]+=3;
            } else {
                punkty[indeksPanstwa(arr[i][0])] += 1;
                punkty[indeksPanstwa(arr[i][2])] += 1;
            }
            }
        for(int a:punkty) System.out.print(a+",");*/


        //Zad 3
       /* int[][][] opers = {
                { {100, -50, 25}, {150,-300}, {300,-90,100} },
                { {90, -60, 250}, {300,20,-100} },
                { {20, 50}, {300}, {20,-20,40}, {100,-200} }

        };

        int sum[]=new int[opers.length];
        for (int i = 0; i <sum.length ; i++) {
            for (int j = 0; j <opers[i].length ; j++) {
                for (int k = 0; k < opers[i][j].length; k++) {
                    sum[i]+=opers[i][j][k];
                }
            }
        }
        for(int a:sum) System.out.print(a+ ",");*/


        //Zad 4
       /* int[][] a = { {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9} };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : inner(a))
            System.out.println(Arrays.toString(r));*/




        //Zad 5
     /*   int[][] a = { {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9} };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : trans(a))
            System.out.println(Arrays.toString(r));*/











    }
}
