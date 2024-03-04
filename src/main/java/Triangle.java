public class Triangle extends GeometricObject{
    //data fields
    private double side1;
    private double side2;
    private double side3;

    // Constructors
    public Triangle() {
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    //setters
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    //getters
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    //calculate the area of the triangle
    public double getArea() {
        //heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //calculate the perimeter of the triangle
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    //toString Methode
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
