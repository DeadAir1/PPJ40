package PPJ_20;

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
    public void insert (int ind,int[] other ){
        if(ind<0 || ind > this.size) throw new IndexOutOfBoundsException();
        if(other.length+this.size<=this.cap){
            System.arraycopy(this.arr,ind,this.arr,ind+other.length,other.length);
            System.arraycopy(other,0,this.arr,ind,other.length);
        }
        else{
            int tmp[]=new int[2*(other.length+this.size)];
            System.arraycopy(this.arr,0,tmp,0,ind-1);//Poprawic ilosc elementow

        }

    }
}
