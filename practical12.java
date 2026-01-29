public class Point {
    private double x;
    private double y;
    
    public Point() {
        x = 5;
        y = 5;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
    
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.print("Default constructor: ");
        p1.display();
        
        Point p2 = new Point(10, 15);
        System.out.print("Parameterized constructor: ");
        p2.display();
        
        Point p3 = new Point(p2);
        System.out.print("Copy constructor: ");
        p3.display();
    }
}