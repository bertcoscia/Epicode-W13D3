package ex1;

public class Rectangle {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public static void printTwoRectangles(Rectangle rect1, Rectangle rect2) {
        rect1.printRectangle();
        rect2.printRectangle();
        double totalPerimeter = rect1.perimeter() + rect2.perimeter();
        double totalArea = rect1.area() + rect2.area();
        System.out.println("Total perimeter: " + totalPerimeter);
        System.out.println("Total area: " + totalArea);
    }

    public double perimeter() {
        return this.length * 2 + this.height * 2;
    }

    public double area() {
        return this.length * this.height;
    }

    public void printRectangle() {
        System.out.println(this.perimeter());
        System.out.println(this.area());
    }

}
