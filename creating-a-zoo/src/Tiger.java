public class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed;
    private int soundLevel;

    public Tiger() {
        super("Tiger");
    }
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger : i have eaten meat");
    }


    @Override
    public void walk() {
        System.out.println("Tiger : walking at speed of " + speed + "mph" );
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevel;
    }

    public void setSoundLevelOfRoar(int soundLevel) {
        this.soundLevel = soundLevel;
    }
}
