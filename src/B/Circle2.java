package B;

import A.Circle;

public class Circle2 extends Circle {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        System.out.println(Circle.color);
        Circle.setRadius();
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}
