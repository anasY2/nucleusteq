package oops;

abstract class Shape{
    abstract void perimeter();
    abstract void area();
}
class Circle extends Shape{
    private double radius;
   Circle(double radius){
    this.radius = radius;
   }
    void perimeter(){
        System.out.println("Perimeter of the Circle: " + String.format("%.2f",2 * Math.PI * radius));
    }
    void area(){
        System.out.println("Area of the Circle: " + String.format("%.2f",Math.PI * radius * radius));
    }
  
}
class Rectangle extends Shape{
    private double length;
    private double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void perimeter(){
        System.out.println("Perimeter of the Rectangle: " + String.format("%.2f",2 * (length + breadth)));
    }
    void area(){
        System.out.println("Area of the Rectangle: " + String.format("%.2f",length * breadth));
    }
}
public class Abstract {
    public static void main(String[] args) {
        Circle c = new Circle(2.50);
        Rectangle r = new Rectangle(1.4, 2.50);
        c.perimeter();
        c.area();
        r.perimeter();
        r.area();

    }
}
