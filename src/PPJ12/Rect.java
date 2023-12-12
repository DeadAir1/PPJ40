package PPJ12;

public class   Rect {
    Point ul,br;
    Rect (Point ul,Point br){
        this.ul=ul;
        this.br=br;
    }
    void showInfo(){
        System.out.println("UL -> " +'(' +ul.x +','+ul.y + ')' +"  BR - >" + '('+ br.x +','+br.y + ')');
    }

    static Rect getRect(Point ul,int width,int height){
        Point br=new Point();
        br.x=ul.x+width;
        br.y=ul.y-height;
        Rect rect=new Rect(ul,br);
        return rect;
    }
    static Rect getContainingRect(Point [] arr){
        int xMin=arr[0].x, yMin=arr[0].y;
        int xMax=arr[0].x, yMax=arr[0].y;
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j].x<xMin)
                xMin=arr[j].x;
            if(xMax<arr[j].x)
                xMax=arr[j].x;
            if(yMax<arr[j].y)
                yMax=arr[j].y;

        if(arr[j].y<yMin)
            yMin = arr[j].y;

        }
        Point ul=new Point();
        ul.x=xMin;
        ul.y=yMax;
        Point br=new Point();
        br.x=xMax;
        br.y=yMin;
        Rect rect =new Rect(ul,br);
        return rect;
    }


    public static void main(String[] args) {
        Rect rec = Rect.getRect(Point.getPoint(2, 6), 6, 4);
        rec.showInfo();

        Point[] points = {
                Point.getPoint(3, 4), Point.getPoint(5, 6),
                Point.getPoint(1, 3), Point.getPoint(5, 3),
                Point.getPoint(4, 1), Point.getPoint(3, 7)
        };
        Rect cont = Rect.getContainingRect(points);
        cont.showInfo();
    }

}
