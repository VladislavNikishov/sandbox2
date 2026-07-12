public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width ) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Площадь: " + (length*width));
    }

    void  perimeter() {
        System.out.println("Периметр: " + (2*(length+width)));
    }
}