package PPJ11;

import java.util.Arrays;

public class Main {
        //FUNKCJA DO ZADANIA 1
     public static int countEven(int arr[],int index){
         if(index<arr.length)
             return arr[index]%2==0? 1+countEven(arr,++index):countEven(arr,++index);
     return 0;
     }

    public static void main(String[] args) {
         //Zad 1
        /*int[] a = {2,3,2,4,3,1,6,3,2,3};
        System.out.println("# of even: " + countEven(a,0));*/

        //Zad 2
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factI(12));
        System.out.println(FuncStat.gcdR(12125,40643));
        System.out.println(FuncStat.gcdI(12125,40643));
        int[] a = {3,8,2,9,7,4};
       System.out.println("Max     : " + FuncStat.maxElem(a,0));
        System.out.println("Num even: " + FuncStat.numEven(a,0));
        System.out.println("Before:   " + Arrays.toString(a));
        FuncStat.reverse(a,0);
        System.out.println("After :   " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrom? " +
                FuncStat.isPalindrom("radar"));
        System.out.println("Is 'abba' a palindrom?  " +
                FuncStat.isPalindrom("abba"));
        System.out.println("Is 'rover' a palindrom? " +
                FuncStat.isPalindrom("rover"));


     //Zad 3
    /*    int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(Zadanie_3.add(arr,3)));
     */
     }
}
