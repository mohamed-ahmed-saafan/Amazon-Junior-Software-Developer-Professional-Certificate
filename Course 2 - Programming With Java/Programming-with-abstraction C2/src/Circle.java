import static java.lang.Math.PI;

public class Circle extends Shape {
    private float radius;
    private float area;
    private String color;

    public Circle (){
        this.radius = 0;
        this.area = 0;
        this.color = "";
    }

    @Override
    public void draw() {
    System.out.println("Drwaing Circle with radius " + radius + " and area " + area + " and color " + color);
    }

    @Override
    public float calculateArea() {
        float area = (float) (radius * radius * PI);
        return area;
    }

    @Override
    public void LineColor(String color) {
    this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
