package ex1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 2);
        Rectangle rectangle2 = new Rectangle(8, 5);
        rectangle1.printRectangle();
        rectangle2.printRectangle();
        Rectangle.printTwoRectangles(rectangle1, rectangle2);
    }
}
