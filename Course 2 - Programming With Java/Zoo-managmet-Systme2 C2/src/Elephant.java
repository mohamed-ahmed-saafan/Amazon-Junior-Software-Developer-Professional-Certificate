public class Elephant extends Animal {

    public Elephant (String name, int age, String gender, Enclosure enclosure) {
        super(name, age , gender,enclosure);
    }

    @Override
    void makeSound() {
        System.out.println("Elephant is Trumpeting");
    }


}
