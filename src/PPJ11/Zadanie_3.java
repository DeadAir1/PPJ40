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

    //FUNKCJA DO PUNKTU 1 WERSJA 2
    static int[] add1(int arr[],int elem){
        int arr1[]=new int[arr.length+1];
        int index=0;
        while(arr[index]<=elem){
            index++;
        }
        System.arraycopy(arr,0,arr1,0,index);
        arr1[index]=elem;
        System.arraycopy(arr,index,arr1,index+1,arr.length-index);

    return arr1;}

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

    //FUNKCJA DO PUNKTU 2 WERSJA 2
    static int[] delIndex1(int arr[],int index){
        int arr1[]=new int[arr.length-1];
        System.arraycopy(arr,0,arr1,0,index);          //int arr[]={0,1,2,3,4,5,6,7,8,9};
        System.arraycopy(arr,index+1,arr1,index,arr1.length-index);
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

    //FUNKCJA DO PUNKTU 3 WERSJA 2
    static int [] delFirst1(int arr[],int e){
        if(arr[0]!=e)
            return arr;
        int arr1[]=new int[arr.length-1];
        System.arraycopy(arr,1,arr1,0,arr1.length);
       return arr1;
    }
    //FUNKCJA DO PUNKTU 4
    static int [] delLast(int arr[],int e){
        if(arr[arr.length-1]!=e)
            return arr;

        int arr1[]=new int[arr.length-1];
            for (int i = 0; i <arr1.length ; i++) {
                arr1[i]=arr[i];
            }
        return arr1;
    }
    //FUNKCJA DO PUNKTU 4 WERSJA 2
    static int [] delLast1(int arr[],int e){
        if(arr[arr.length-1]!=e)
            return arr;
        int arr1[]=new int[arr.length-1];
        System.arraycopy(arr,0,arr1,0,arr1.length);
        return arr1;
    }
    //FUNKCJA DO PUNKTU 5
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

    //FUNKCJA DO PUNKTU 5 WERSJA 2
    static int [] delAll1(int arr[],int a) {
        int counter=0;
        int i=0;
        while(arr[i]<=a){
            i++;
            if(arr[i]==a)
                counter++;
        }
        if(counter==0)
            return arr;
        int arr1[]=new int[arr.length-counter];
        System.arraycopy(arr,0,arr1,0,i-counter);
        System.arraycopy(arr,i,arr1,i-counter,arr.length-i);
            return arr1;
    }

    //FUNKCJA DO PUNKTU 6
    static void info(int []arr){
        System.out.println(Arrays.toString(arr)+'\n'
                + "Rozmiar tej tablicy to -> " + arr.length);
    }



    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,4,6,7,8,9};
        int  elem=4;       //i=6
        info(arr);
        //Punkt 1
      //  System.out.println(Arrays.toString(add(arr,elem)));info(arr);
        //System.out.println(Arrays.toString(add1(arr,elem)));
        //Punkt 2
      //  System.out.println(Arrays.toString(delIndex(arr,elem)));
      //  System.out.println(Arrays.toString(delIndex1(arr,elem)));
        //Punkt 3
       // System.out.println(Arrays.toString(delFirst(arr,elem)));
      //  System.out.println(Arrays.toString(delFirst1(arr,elem)));
        //Punkt 4
        //System.out.println(Arrays.toString(delLast(arr,9)));
       // System.out.println(Arrays.toString(delLast1(arr,9)));
        //Punkt 5
       // System.out.println(Arrays.toString(delAll(arr,elem)));
        //System.out.println(Arrays.toString(delAll1(arr,elem)));
    }
}