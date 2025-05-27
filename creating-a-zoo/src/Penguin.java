public class Penguin extends Animal implements Walk,Swim,Eat {
    private boolean isSwimming;
    private int swimSpeed;
    private int walkSpeed;
    private int age;
    private int height;
    private int weight;

    public Penguin() {
        super("penguin");
        isSwimming = false;
        swimSpeed = 0;
        walkSpeed = 0;
        age = 0;
        height = 0;
        weight = 0;
    }
    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: i am eating delicious fish");
    }

    @Override
    public void swim() {
        System.out.println("Penguin: i am swimming at speed: " + swimSpeed + "nautical mph");
    }

    @Override
    public void walk() {
        System.out.println("Penguin : walking at speed of " + walkSpeed + "mph" );
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getSwimmingSpeed() {
        return swimSpeed;
    }

    public void setSwimmingSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public int getWalkingSpeed() {
        return walkSpeed;
    }

    public void setWalkingSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }
}
