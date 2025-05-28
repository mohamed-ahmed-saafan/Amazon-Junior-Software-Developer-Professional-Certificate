public class Dolphin extends Animal implements Swim{
private String color;
private int swimmingSpeed;
public Dolphin() {
    super("Dolphin");
}
    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: i am eating delicious fish");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("Dolphin: i am swimming at speed: " + swimmingSpeed + "nautical mph");
    }
}
