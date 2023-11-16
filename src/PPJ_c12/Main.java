package PPJ_c12;

public class Main {
    public static void main(String[] args) {
        //Zad 1
   /*     byte arr[]=new byte[9];*/
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
        int arrX[]=new int[10];
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
        +"Wspolrzedne srodka - > x: " + szerokosc/2 + "  y: " + wysokosc/2);



    }

}
