public class Person {
    //TODO 1: declare instance variables
    String name;
    int age ;
    double weightInKG;

    public Person(String name, int age, double weightInKG) {
        //TODO 2: complete the constructor
        this.name = name;
        this.age = age;
        this.weightInKG = weightInKG;
    }

    public String toString() {
        //TODO 3: use the String.format() method to return string representation of the object
        return "name: " + name + ", age: " + age + ", weight: " + weightInKG;
    }
}
