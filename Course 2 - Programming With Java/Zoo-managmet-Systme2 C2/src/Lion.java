public class Lion extends Animal {

    public Lion(String name, int age, String gender, Enclosure enclosure) {
        super(name, age , gender,enclosure);
    }

    @Override
    void makeSound() {
        System.out.println("Lion Roaring");
    }


}
