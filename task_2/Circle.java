package task_2;

import java.lang.Math;

public class Circle {
    int radius;
    Circle(int radius){
        this.radius = radius;
    }

    public double area(){
        return (Math.pow(this.radius,2) * 3.14);
    }
}
