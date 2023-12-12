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
        public static long factR(int n){
            return n>0? n*factR(--n) : 1;
        }
        public static long factI(int n){
            int fact=n;
            while(n>0){
                fact*=--n;
            }
            return fact+1;
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
        public static int maxElem(int arr[],int from) {
          if(from<arr.length-1) {
              int max = maxElem(arr, ++from);
              return Math.max(arr[from], max);
          }
          return 0;
        }
    public static int numEven(int []arr,int from){
        if(from<arr.length-1)
            return arr[from]%2==0 ? 1 + numEven(arr,++from) : numEven(arr,++from);
        return 0;
    }
    public static void reverse(int arr[],int from){
        if(from<arr.length/2) {
            int tmp = arr[(arr.length - 1) - from];
            arr[(arr.length - 1) - from]=arr[from];
            arr[from]=tmp;
         reverse(arr,++from);
        }
    }
 /*   public static boolean isPalindrom(String s){
            int i=0;
            while(i<=(s.length()/2)-1){
                if(s.charAt(i)!=s.charAt((s.length()-1)-i)) return false;
                i++;
            }
            return true;
    }*/
    public static boolean isPalindrom (String s) {
        if(s.length()<=1)
            return true;
        else if(s.charAt(0)!=s.charAt(s.length()-1))
        return false;
            else return isPalindrom(s.substring(1,s.length()-1));
    }

}
