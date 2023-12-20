package task_1;

public class Screen{
    public static void main(String args[]){
        Point point1 = new Point(0,1,"green");
        Point point2 = new Point(1,0,"blue");
        Point point3 = new Point(point1.x + point2.x,point1.y + point2.y,"black");
    }
}
