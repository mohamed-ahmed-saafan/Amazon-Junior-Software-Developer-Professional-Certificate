public class Rectangle extends Shape {
    // Rectangle properties
    private float width;
    private float height;
    private String color;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
        this.color = "";
    }

    @Override
    public void draw() {
    System.out.println("Drawing a rectangle with width = " + this.width + " and height = " + this.height + " and color = " + this.color);
    }

    @Override
    public float calculateArea() {
        float area = width * height;
        return area ;
    }

    @Override
    public void LineColor(String color) {
        this.color = color;
    }


    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
