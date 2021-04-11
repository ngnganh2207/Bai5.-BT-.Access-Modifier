package A;

public class Circle {
    public static double radius=1.0;
    public static String color="red";

    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
     public static double getRadius(){
        return this.radius;
    }
     protected static double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    public static void setRadius() {
        this.radius = 20;
    }
}
