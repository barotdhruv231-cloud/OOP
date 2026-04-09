class Shape {
    double d1, d2;
    
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double getArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double getArea() {
        return d1 * d2;
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getData(6.0, 4.0);
        System.out.println("Triangle Area: " + t.getArea());

        Rectangle r = new Rectangle();
        r.getData(5.0, 3.0);
        System.out.println("Rectangle Area: " + r.getArea());
    }
}