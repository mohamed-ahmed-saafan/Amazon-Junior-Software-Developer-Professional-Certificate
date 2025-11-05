import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Shape");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Exit");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Enter rectangle width: ");
                rectangle.setWidth(scanner.nextInt());
                System.out.println("Enter rectangle height: ");
                rectangle.setHeight(scanner.nextInt());
                System.out.println("Enter the color of the rectangle: ");
                rectangle.setColor(scanner.next());
                System.out.println("the rectangle area = " + rectangle.calculateArea());
                rectangle.draw();
                break;

            case 2:
                System.out.println("Enter Circle Radius");
                circle.setRadius(scanner.nextInt());
                System.out.println("Enter the color of the Circle: ");
                circle.setColor(scanner.next());
                System.out.println("the Circle area = " + circle.calculateArea());
                circle.draw();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
        }


    }
}
