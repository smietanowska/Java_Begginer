package chapter6;

public class Rectangle {

    // non || protected = only classes within the package can access methods
    // public = all classes can access
    // private = can only be accessed within the scope / class

    private double length;
    private double width;

    // constructor for default values
    public Rectangle () {
        length = 0;
        width = 0;
    }

    public Rectangle (double length, double width) {
        setLength(length);
        setWidth(width);
        // this.length = length;
    }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }
    public void  setWidth(double width) { this.width = width; }

    public double calculatePerimeter() {
        return (2*length) + (2*width);
    }
    public double calculateArea() {
        return length*width;
    }

}
