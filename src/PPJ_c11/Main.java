package PPJ_c11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zad 1
   /*     double arr[]=new double[10];
      for (int i = 0; i <10 ; i++) {
            arr[i]=(Math.random()*20+1);
            System.out.println(arr[i]);
        }
        System.out.print("//////////////////////////////////////");
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.print("//////////////////////////////////////");
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            int a=(int)arr[i];
            if(a%2!=0) System.out.println(a);
        }*/


        //Zad 2
        /*char arr[]={'g','a','u'};
        char a=arr[0];
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<a){
                a=arr[i];
                index=i;
            }
        }
        System.out.println("Index elementu -> " + "[" + a + "]" +" w arr to -> " + index);*/

        //Zad 3
      /*  Scanner in=new Scanner(System.in);
        char arr[]=new char[5];
        int counter=0;
        int counter0=0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(char)(Math.random()*26+'A');
            System.out.println(arr[i]);
        }
        char zmienna=0;

        do{
            System.out.print("Podaj litere -> ");
            zmienna=in.next().charAt(0);
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]==zmienna) { counter++;
                arr[i]='0';
                counter0++;

                }
                System.out.println(arr[i]);
            }
            System.out.println("------------------------");
            System.out.println("Bylo tyle wystepowan -> " + counter +" litery -> "+ zmienna);
            counter=0;
            System.out.println("Counter0 -> " + counter0);
        }while(counter0 !=arr.length);
*/


        //Zad 4
      /*          int arr[]={1,2,3,4,4,3,2,1};
                int arr1[]=new int[arr.length];
                int counter=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            counter++;
            arr1[counter-1]=arr[i];

        }
        counter=0;
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i]==arr[i])  counter++;
        }
        boolean same=counter==arr.length;
        System.out.println(same);*/

        //Zad 5
       /* boolean arr[]=new boolean[10];
        for (int i = 0; i <arr.length ; i++) {
            int a=(int)(Math.random()*2);
            arr[i]=a==1;
            System.out.println(arr[i]);
        }
        int counterTrue=0;
        int counterFalse=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]) counterTrue++;
            else counterFalse++;
        }
        boolean tabTrue[]=new boolean[counterTrue];
        boolean tabFalse[]=new boolean[counterFalse];*/


        //Zad 6
        long arr[]=new long[10];
        arr[0]=(int)(Math.random()*10+1);
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=arr[i-1]+1;
            System.out.println(arr[i]);
        }
        int counter=1;
        while(counter==0){
            int index1=(int)(Math.random()*10+1);
            int index2=(int)(Math.random()*10+1);
            for (int i = 1; i <arr.length ; i++) {
                if(arr[i]==arr[i-1]+1) counter++;
            }
        }
    }
}
