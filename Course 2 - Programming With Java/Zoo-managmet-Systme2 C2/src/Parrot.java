public class Parrot extends Animal {

    public Parrot(String name, int age, String gender, Enclosure enclosure) {
        super(name, age , gender,enclosure);
    }

    @Override
    void makeSound() {
        System.out.println(" Parrot is Squawking ");
    }


}
