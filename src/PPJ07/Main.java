package PPJ07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zad 1
           /*int arr[]=new int[10];
            for(int a:arr){
                System.out.print(a + " ");
            }*/

        //Zad 2
       /* Scanner scanner=new Scanner(System.in);
        System.out.print("Prosze podac rozmiar tablicy -> ");
        int size= scanner.nextInt();
        if(size%2!=0) {
            System.out.println("Rozmiar musi byc parzysty");
       return;
        }
            int arr[]=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i;
        }
            int arr1[]=new int[arr.length/2];
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=arr[i];
        }
        int j= arr1.length-1;
        for (int i = arr1.length-1; i >=0 ; i--) {
            arr[i-j]=arr1[i];
            j-=2;

        }
        for(int a:arr){
            System.out.println(a);
        }*/


        //Zad 3
      /*  //1
        int arr[]=new int[20];
        //2
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(int)(Math.random()*10+1);
            if(i==arr.length-1) System.out.print(arr[i]);
            else{
                System.out.print(arr[i]+" ");
            }
        }
        //3
        int min=10;
        int min_indeks=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min) {
                min=arr[i];
                min_indeks=i;
            }
        }
        //4
        int max=0;
        int max_indeks=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max){
                max=arr[i];
                max_indeks=i;
            }
        }
        //5
        System.out.println();
        System.out.println("Min -> "  + min + ";" + "On znajduje sie pod indeksem -> " + min_indeks + ";");
        System.out.println("Max -> "  + max + ";" + "On znajduje sie pod indeksem -> " + max_indeks + ";");

        //6
        for (int i = 0; i <arr.length ; i++) {
            if(i==arr.length-1) System.out.print(arr[i]);
            else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        //7
        for (int i = arr.length-1; i >=0 ; i--) {
            if(i==0) System.out.print(arr[i]);
            else{
                System.out.print(arr[i]+" ");
            }
        }*/


        //Zad 4
       /* Scanner scanner=new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy -> ");
        int size=scanner.nextInt();
        System.out.print("Podaj maksymalny element ktory musi byc wiekszy rowny rozmiaru tablicy -> ");
        int max= scanner.nextInt();
        if(max<size){
            System.out.println("Oszukujesz mnie,Zegnam!");
            return;
        }
        int iterator_for=0;
        int iterator_while=0;
        int liczba_losowan=0;
        int arr[]=new int[size];
        while (arr[arr.length-1] == 0 )  {
            int random=(int)(Math.random()*max+1);
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]==random)iterator_for++;
            }
            if(iterator_for==0){ arr[iterator_while]=random;
            iterator_while++;
            }
            iterator_for=0;
            liczba_losowan++;

        }
        System.out.println("Liczba losowan -> " + liczba_losowan);
        for (int a: arr){
            System.out.print(a+ " ");
        }*/

        //Zad 5
       /* Scanner scanner =new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy -> ");
        int size=scanner.nextInt();
        scanner.close();
        int arr[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*10+1);
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
            int counter =0;
        for (int i = 0; i < arr.length ; i++) {
            counter=0;
            for (int j = 0; j <arr.length; j++) {
                if(arr[i]==arr[j]) counter++;
            }
            if(counter<=1) System.out.print(arr[i] + " ");

        }
*/


    }




}
