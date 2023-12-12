package PPJ11;

import java.util.Arrays;

public class Zadanie_3 {
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

    public static void main(String[] args) {
            int arr[]={0,1,2,3,4,5,6,7,8,9};
            int  elem=4;
        System.out.println(Arrays.toString(add(arr,elem)));
    }
}
