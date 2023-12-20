package task_2;

public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(22);
        Square square = new Square(11, 12);
        System.out.println(circle.area());
        System.out.println(square.area());
    }
}
