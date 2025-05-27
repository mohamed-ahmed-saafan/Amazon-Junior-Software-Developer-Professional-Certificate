public class Main {
    public static void main(String[] args) {
        //Rectangle object with specified length and width
        Rectangle rectangle = new Rectangle(5.0,3.0);
        // Circle object with specified radius
        Circle circle = new Circle(2.5);

        double rectangleArea = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        double circleArea = ShapeMetricCalculator.calculateCircleArea(circle);

        System.out.println("Area of rectangle =  " + rectangleArea);
        System.out.println("Area circle =  " + circleArea);

    }
}
