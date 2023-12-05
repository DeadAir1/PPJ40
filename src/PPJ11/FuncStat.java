package PPJ11;

import java.util.Arrays;

public class FuncStat {
        public static int fiboR(int n){
            return n>=2?  fiboR((n-1))+fiboR(n-2):n;
        }
        public static int fiboI(int n){
            if(n<2) return n;
            int fib=1,
                    prevFib=1;
            for (int i = 2; i <n ; i++) {
                int tmp=fib;
                fib+=prevFib;
                prevFib=tmp;
            }
                return fib;
        }
        public static int factR(int n){
            return n>0? n+factR(--n) : n;
        }
        public static int factI(int n){
            int fact=n;
            while(n>0){
                fact+=--n;
            }
            return fact;
        }
        public static int gcdR(int a,int b){
            return a!=b ? (a>b ? gcdR(a-b,b): gcdR(a,b-a)) :  a;
        }
        public static int gcdI(int a,int b){
            while(a!=b){
                if(a<b) b-=a;
                else a-=b;
            }
            return a;
        }
        public static int maxElem(int arr[],int from){
            int max=arr[from];
            if(from<arr.length){

            }
        return 0;}

    public static void main(String[] args) {
        System.out.println("fiboR->" + fiboR(5));
        System.out.println("fiboI->" + fiboI(5));
        System.out.println("factR->" + factR(5));
        System.out.println("factI->" + factI(5));
        System.out.println("gcdR->" + gcdR(12,18));
        System.out.println("gcdI->" + gcdI(12,18));
    }

}
