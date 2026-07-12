public class Rectangle {
    int a;
    int b;

    Rectangle(int a, int b ) {
        this.a = a;
        this.b = b;
    }

    void s() {
        System.out.println("Площадь: " + (a*b));
    }

    void  p() {
        System.out.println("Периметр: " + (2+(a+b)));
    }
}

