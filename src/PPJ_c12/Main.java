package PPJ_c12;

import java.util.Scanner;

public class Main {
    static void prGame(byte arr[]){
        int counter=0;
        for (int i = 0; i <arr.length/3 ; i++) {
            for (int j =0; j <arr.length/3 ; j++) {
                System.out.print(arr[j+counter] + " ");
            }
            System.out.println();
            counter+=3;
        }
    }
    static boolean repeat(int counterKolko, int counterKrzyzyk){
        boolean win=false;
        if(counterKrzyzyk==3) {
            System.out.println("Grac 1 win");
            return win=true;
        }
        if(counterKolko==3) {
            System.out.println("Grac 2 win");
            return win=true;
        }
   return win; }
    static boolean win( byte arr[]){
       int line=0;
       int counterKrzyzyk=0;
       int counterKolko=0;
       //spwawdzenie poziome
        for (int i = 0; i <arr.length/3 ; i++) {
            counterKrzyzyk=0;
            counterKolko=0;
            for (int j =0; j <arr.length/3 ; j++) {
                if(arr[j+line]==2) counterKrzyzyk++;
                if(arr[j+line]==1) counterKolko++;
            }
            repeat(counterKolko,counterKrzyzyk);
            line+=3;
        }
        //sprawdzanie pionowe
        int column=3;
                int add=0;
        for (int i = 0; i <arr.length/3 ; i++) {
            counterKrzyzyk=0;
            counterKolko=0;
            add=0;
            for (int j = 0; j <arr.length/3 ; j++) {
                if(arr[add+i]==2) counterKrzyzyk++;
                if(arr[add+i]==2) counterKolko++;
                add+=3;
            }
            repeat(counterKolko,counterKrzyzyk);
            column+=3;
        }
        //sprawdzanie przekatne left
        counterKrzyzyk=0;
        counterKolko=0;
        for (int i = 0; i < arr.length; i+=4) {
            if(arr[i]==2)  counterKrzyzyk++;
            if(arr[i]==1) counterKolko++;
        }
        repeat(counterKolko,counterKrzyzyk);
        //sprawdzanie przekatna prawe
        counterKrzyzyk=0;
        counterKolko=0;
        for (int i = 2; i <=(arr.length*2)/3 ; i+=2) {
            if(arr[i]==2)  counterKrzyzyk++;
            if(arr[i]==1) counterKolko++;
        }
        repeat(counterKolko,counterKrzyzyk);
   return false; }



  public static void main(String[] args) {
        //Zad 1
        Scanner in=new Scanner(System.in);
        byte arr[]=new byte[9];
        prGame(arr);
        int pass=0;
        while(pass!=9 && !win(arr)){
            int pozyczja =0;
            System.out.print("Grac 1 -> ");
            pozyczja=in.nextByte();
            if(arr[pozyczja]==0 )
                arr[pozyczja]=2;
            else System.out.println("This posytion is not empty");
            pass++;
            prGame(arr);
            if(!win(arr)) {
                System.out.print("Grac 2 -> ");
            pozyczja=in.nextByte();
            if(arr[pozyczja]==0 )
                arr[pozyczja]=1;
            else System.out.println("This posytion is not empty");
            pass++;
            prGame(arr);
            }
        }



        //Zad 2
      /*  int arr[]={153,333,370,515,407,80};
        for (int i = 0; i <arr.length ; i++) {
            int liczba =arr[i];
            int potega=0;
            int suma=0;
            while(liczba!=0){
                liczba/=10;
                potega++;
            }
            liczba = arr[i];
            while(liczba!=0) {
                suma += (int) Math.pow(liczba % 10, potega);
                liczba /= 10;
            }
            boolean ans=arr[i]==suma;
            System.out.println("Liczba -> " + arr[i] +" " + ans);
        }*/



        //Zad 3
     /*   int arrInt[]=new int[10];
        double arrDouble[]=new double[10];
        for (int i = 0; i <arrInt.length ; i++) {
            arrDouble[i]=Math.random()*10+1;
            arrInt[i]=(int)arrDouble[i];
        }
        for (int i = 0; i <arrInt.length-1 ; i++) {
            int sum=arrInt[i]+(int)arrDouble[i];
              for (int j = i+1; j <arrInt.length ; j++) {
                  int sum1=arrInt[j]+(int)arrDouble[j];
                  if(sum1<sum) {
                  int intHelp=arrInt[i];
                  double doubleHelp=arrDouble[i];
                arrInt[i]=arrInt[j];
                arrInt[j]=intHelp;
                arrDouble[i]=arrDouble[j];
                arrDouble[j]=doubleHelp;
                sum=sum1;
              }
              }
          }
          for (int i = 0; i <arrInt.length ; i++) {
            System.out.print(arrInt[i] + ",");
        }
        System.out.println();
        for (int i = 0; i <arrDouble.length ; i++) {
            System.out.print(arrDouble[i] + ",");
        }*/




        //Zad 4
      /*  int arrX[]=new int[10];
        int arrY[]=new int[10];
        for (int i = 0; i < arrX.length ; i++) {
            arrX[i]=(int)(Math.random()*10+1);
            arrY[i]=(int)(Math.random()*10+1);
        }
        int maxX=0;
        int maxY=0;
        int minX=0;
        int minY=0;
        for (int i = 0; i < arrX.length ; i++) {
            if(arrX[i]>maxX) maxX=arrX[i];
            if(arrY[i]>maxY) maxY=arrY[i];
            if(arrX[i]<minX) minX=arrX[i];
            if(arrY[i]<minY) minY=arrY[i];
        }
        minY--;
        minX--;
        maxY++;
        maxX++;
        int szerokosc=maxX-minX;
        int wysokosc=maxY-minY;
        for (int i = 0; i <arrX .length; i++) {
            System.out.print(arrX[i]+ " ,");

        }
        System.out.println();
        for (int i = 0; i <arrY.length ; i++) {
            System.out.print(arrY[i] + " ,");
        }
        System.out.println();
        System.out.println("Szerokosc -> " +szerokosc + '\n'
        +"Wysokosc -> " + wysokosc + '\n'
        +"Wspolrzedne srodka - > x: " + szerokosc/2 + "  y: " + wysokosc/2);*/

        //Zad 5
        /*int a[]={1,2,3,4,5};
        int b[]={10,9,8,7,6};
        int c[]=new int[a.length+b.length];
        for (int i = 0; i <a.length ; i++) {
            c[i]=a[i];
            c[i+(a.length)]=b[i];
        }
        for (int i = 0; i < c.length-1; i++) {
            for (int j = i+1; j <c.length ; j++) {
                if(c[j]<c[i]){
                    int t=c[j];
                    c[j]=c[i];
                    c[i]=t;

                }
            }
        }
        for(int abc :c){
            System.out.print(abc + ",");
        }*/



        //Zad 6
/*        int arr[]=new int[(int)(Math.random()*20+2)];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*20+1);
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[i]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=arr[i];
                }

            }
        }
        for(int a: arr){
            System.out.print(a + ",");
        }
        int counter=1;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i-1]!=arr[i]) counter++;
        }
        System.out.println();
        System.out.print("Counter ->" + counter);*/



    //Zad 7
    /*    int arr[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*20+1);
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[i]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=arr[i];
                }

            }
        }
        for(int a: arr){
            System.out.print(a + ",");
        }
        int counter=0;
        int counter1=0;
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if(counter<counter1){
            index=i-1;
            counter=counter1;
            }
            counter1=0;
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]==arr[i]) counter1++;
            }

        }
        System.out.println();
        System.out.println("Liczba pod indexem -> " + arr[index] + " wystopila -> " + counter + " razy");*/


    //Zad 8
       /* int a[]=new int[(int)(Math.random()*10+1)];
        int b[]=new int[(int)(Math.random()*10+1)];
        int c[]=new int[(int)(Math.random()*10+1)];

        int size=a.length<b.length? a.length: b.length<c.length? b.length:c.length;
        for (int i = 0; i < size; i++) {
            a[i]=(int)(Math.random()*20+1);
            b[i]=(int)(Math.random()*20+1);
            c[i]=(int)(Math.random()*20+1);
        }
        int arr[][]={a,b,c};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }*/
            //Zad 9
/*            float arr[][]=new float[8][8];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=(int)(Math.random()*20+1);
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
        float left=0;
        for (int i = 0; i < arr.length; i++) {
            left+=arr[i][i];
        }
        float right=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            right+=arr[i][i];
        }
        System.out.println("Left sum -> " + left);
        System.out.println("Right sum -> " + right);*/
    }

}
