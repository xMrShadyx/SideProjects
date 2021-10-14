package o3_YTCollection.Abstract.o3_Abstract;

interface Shape {
    void draw();
    double area();
}

//abstract class Shape {
//    String objectName;
//
//    Shape(String objectName) {
//        this.objectName = objectName;
//    }
//
//    abstract public void draw();
//    abstract public double area();
//}

class Rectangle implements Shape {
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn");
    }

    @Override
    public double area() {
        return (double) length * width;
    }
}

class Circle implements Shape {
    double pi = Math.PI;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle have been drawn");
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * pi;
    }
}

public class abstractButWithInterface {
    public static void main(String[] args) {
        Shape rect = new Rectangle(20, 30);
        rect.draw();
        System.out.println(rect.area());
        System.out.println("------------------");
        Shape circle = new Circle(20);
        circle.draw();
        System.out.println(circle.area());
    }
}
