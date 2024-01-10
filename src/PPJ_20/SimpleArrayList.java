package PPJ_20;

import java.util.Arrays;

public class SimpleArrayList {
    final static int INITIAL_CAPACITY=2;
     int size=0, cap=INITIAL_CAPACITY;
     int arr[]=new int[cap];


    public SimpleArrayList() {

    }

    public SimpleArrayList(int val) {
       this.size=1;
       this.arr[0]=val;
    }

    public SimpleArrayList(int arr[]) {
        this.size=arr.length;
        this.cap+=arr.length;
        for (int i = 0; i < this.arr.length; i++) {
        this.arr[i]=arr[i];
        }
    }
    public SimpleArrayList (SimpleArrayList simpleArrayList){
       this.size = simpleArrayList.size;
       this.cap+=simpleArrayList.size;
        for (int i = 0; i < size; i++) {
            this.arr[i]=simpleArrayList.arr[i];
        }
    }
    public int size(){
        return this.size;
    }
    public void clear(){
        this.size=0;
        this.cap=INITIAL_CAPACITY;
        this.arr=new int[cap];
    }
    public void trim(){
        this.cap=this.size;
        int tmp[]=new int[this.cap];
        for (int i = 0; i <cap ; i++) {
            tmp[i]=this.arr[i];
        }
        this.arr=tmp;
    }
    public SimpleArrayList insert (int ind,int[] other ){
        if(ind<0 || ind > this.size) throw new IndexOutOfBoundsException();
        if(other.length+this.size<=this.cap){
            System.arraycopy(this.arr,ind,this.arr,ind+other.length,other.length);
            System.arraycopy(other,0,this.arr,ind,other.length);
            this.size+= other.length;
        }
        else{
            int tmp[]=new int[2*(other.length+this.size)];
            System.arraycopy(this.arr,0,tmp,0,ind-1);
            System.arraycopy(other,0,tmp,ind,other.length);
            System.arraycopy(this.arr,ind,tmp,ind-1+other.length,this.arr.length-(ind-1));
            this.arr=tmp;
            this.size+= other.length;
        }

    return this;
    }
    public SimpleArrayList insert(int ind, int e){
        int wrt[]={e};
        return insert(ind,wrt);
    }
 public SimpleArrayList append(int e){
        this.arr[this.size]=e;
        this.size++;
        return this;
 }
 public SimpleArrayList append(int[] a){
        insert(size,a);
        return this;
 }
 public SimpleArrayList append(SimpleArrayList a){
        insert(size,a.arr);
        return this;
 }
    public int get(int ind){
        return this.arr[ind];
    }
    public SimpleArrayList set(int ind, int val) {
        this.arr[ind]=val;
        return this;
    }

    @Override
    public String toString() {
        return "SimpleArrayList{" +
                "size=" + size +
                ", cap=" + cap +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
    public static void main(String[] args) {
        SimpleArrayList a =
                new SimpleArrayList()
                        .append(new int[]{1,3}).insert(1,2)
                        .append(6).insert(3,new int[]{4,5});
        SimpleArrayList b = new SimpleArrayList(a);
        for (int i = 0; i < a.size(); ++i)
            a.set(i,a.get(i)+6);
        b.append(a).append(13).trim();
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
    }
}
