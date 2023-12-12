package PPJ11;

import java.util.Arrays;

public class Zadanie_3 {

    //FUNKCJA DO PUNKTU 1
    static int[] add(int [] arr,int elem){
        int arr1[]=new int[arr.length+1];
        int i=0;
        while(arr[i]<=elem){
            arr1[i]=arr[i];
            i++;
        }
        arr1[i]=elem;
        i++;

        for (int j = i; j <arr1.length ; j++) {
            arr1[j]=arr[j-1];
        }

        return arr1;
    }

    //FUNKCJA DO PUNKTU 2
    static int[] delIndex(int arr[],int index){
        int arr1[]=new int[arr.length-1];
        for (int i = 0; i <arr1.length ; i++) {
            if(i<index){
                arr1[i]=arr[i];
            }else{
                arr1[i]=arr[i+1];
            }
        }
    return arr1;
    }
    //FUNKCJA DO PUNKTU 3
    static int[] delFirst(int arr[],int e){
        if(arr[0]!=e)
            return arr;
        int arr1[]=new int[arr.length-1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[i+1];
        }

    return arr1;
    }
    static int [] delLast(int arr[],int e){
        if(arr[arr.length-1]!=e)
            return arr;
            int arr1[]=new int[arr.length-1];
            for (int i = 0; i <arr1.length ; i++) {
                arr1[i]=arr[i];
            }
        return arr1;
    }
    //FUNKCJA DO ZADANIA 5
    static int [] delAll(int arr[],int a){
        int counter=0;
        for (int i = 0; i <arr.length ; i++)
            if(arr[i]==a) counter++;
        int arr1[]=new int[arr.length-counter];
        for (int i = 0; i <arr1.length ; i++) {
             if(arr[i]<a)
                 arr1[i]=arr[i];
             else arr1[i]=arr[i+counter];
        }

    return arr1;
    }
    //FUNKCJA DO PUNKTU 6
    static void info(int []arr){
        System.out.println(Arrays.toString(arr)+'\n'
                + "Rozmiar tej tablicy to -> " + arr.length);
    }



    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int  elem=4;
        //Punkt 1
      //  System.out.println(Arrays.toString(add(arr,elem)));
        //Punkt 2
      //  System.out.println(Arrays.toString(delIndex(arr,elem)));
        //Punkt 3
       // System.out.println(Arrays.toString(delFirst(arr,elem)));
        //Punkt 4
        //System.out.println(Arrays.toString(delLast(arr,9)));
        //Punkt 5
       // System.out.println(Arrays.toString(delAll(arr,elem)));
        //Punkt 6
        info(arr);
    }
}