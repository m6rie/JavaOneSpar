package Classes.Triangle;

public class Triangle {
    double base;
    double height;
    double sideLengthOne;
    double sideLengthTwo;
    double sideLengthThree;

    // to create a triangle constructor
    public Triangle(double base, double height, double sideLengthOne, double sideLengthTwo, double sideLengthThree) {
        this.base = base;
        this.height = height;
        this.sideLengthOne = sideLengthOne;
        this.sideLengthTwo = sideLengthTwo;
        this.sideLengthThree = sideLengthThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
