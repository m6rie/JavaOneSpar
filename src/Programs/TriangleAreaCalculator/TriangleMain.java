package Programs.TriangleAreaCalculator;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3,2.598,3,3,3);

        double triangleAArea = triangleA.findArea();
        double triangleBArea = triangleB.findArea();

        // Triangle.findArea() doesn't work because it can only work on an existing instance of triangle
        // findArea() is an instance method (non-static method), not a class method
        // Static method don't need an instance of the class to use the function

        System.out.println(triangleAArea);
        System.out.println(triangleBArea);

    }
}
