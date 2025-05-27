public class ShapeMetricCalculator {
    // rectangle variable is of type Rectangle
    // static method to calculate the area of a rectangle ( doesn't need an object to call the method
    public static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
    // circle variable is of type Rectangle
    public static double calculateCircleArea(Circle circle) {
        return circle.radius * 2;
    }

}
