package PPJ_c15;

import java.util.Arrays;

public class Main {
    //FUNKCJA DO ZADANIA 1
    public static void bubbleSortIt(int arr[]){
        int length=arr.length;
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
            --length;
        }
    }

    //FUNKCJA DO ZADANIA 2
    public static void bubbleSortRe(int arr[],int to){
        if(to<1)
            return;
        for (int i = 0; i <to ; i++) {
            if(arr[i]>arr[i+1]){
                int t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
        }
        bubbleSortRe(arr,--to);
    }

    //FUNKCJA DO ZADANIA 3
    public static int [][] trans(int arr[][]){
        int arr1[][]=new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr1[i][j]=arr[j][i];
                arr1[j][i]=arr[i][j];
            }
        }
    return arr1;
    }
    //FUNKCJA DO ZADANIA 4
    public static int binSearch ( int arr [] , int begin , int end , int value ){
        if(arr[end/2]==value)
                return end/2;
            else if(value<arr[end/2])
                return binSearch(arr,begin,end/2,value);
            else
                return binSearch(arr,end/2,2+end,value);

    }
    //FUNKCJE DO ZADANIA 7
    public static int wordCount(String s){
        int counter=1;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==' ' || s.charAt(i)==',' || s.charAt(i)==';' || s.charAt(i)=='.' )
                ++counter;
        }
    return counter;
    }

    
    public static void main(String[] args) {
        //Zad 1
        /*int arr[]={1,5,7,9,4,2,6,3,8};
        bubbleSortIt(arr);
        System.out.println(Arrays.toString(arr));
*/
        //Zad 2
     /*   int arr[]={1,5,7,9,4,2,6,3,8};
        bubbleSortRe(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));*/

        //Zad 3
     /*   int[][] arr = {
                {1, 4, 3, 4},
                {2, 2, 4, 5},
                {7, 4, 5, 6},
                {9, 0, 1, 7}
        };
       int arr1[][]=trans(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }*/

        //Zad 4
        /*int arr[]={0,1,2,3,4,5,6,7,8,9};
        System.out.printf("%d to indeks w tablicy -> %d",7,binSearch(arr,0,arr.length-1,7));*/

        //Zad 5
           /* Person person=new Person();
            person.name="Oleksandr";
            person.surname="Voloshyn";
            person.birthYear=18;*/


            //Zad 6
          /*  Fruit apple=new Fruit("Apple");
            apple.show();*/

        //Zad 7
            String s="I like programming,I think that the best language is Java";
        System.out.println(wordCount(s));


    }
}
