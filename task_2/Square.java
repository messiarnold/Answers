package task_2;

public class Square {
    int length;
    int width;
    Square(int width, int length){
        this.width = width;
        this.length = length;
    }

    public double area(){
        return (this.length * this.width);
    }
}
