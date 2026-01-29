public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        
        System.out.println();
        if (rect1.getArea() > rect2.getArea()) {
            System.out.println("Rectangle 1 has a larger area");
        } else if (rect2.getArea() > rect1.getArea()) {
            System.out.println("Rectangle 2 has a larger area");
        } else {
            System.out.println("Both rectangles have the same area");
        }
    }
}