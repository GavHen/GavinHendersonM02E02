package Module2;

public class Triangle extends GeometricObject {
    // Data fields
    private double side1;
    private double side2;
    private double side3;

    // Constructors
    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Accessor methods
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Method to calculate area
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate parameter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // toString method
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }

    // Test program
    public static void main(String[] args) {
        // Prompt user for input
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Create Triangle object
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display triangle information
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}