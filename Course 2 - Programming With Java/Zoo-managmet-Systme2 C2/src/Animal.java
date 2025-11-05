public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    Enclosure enclosure;

    public Animal(String name, int age , String gender, Enclosure enclosure) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.enclosure = enclosure;
    }
    abstract void makeSound();

    public void displayInfo(){
        System.out.println("Animal: " + this.name + " " + "Age : "+ this.age + " Enclosure Type :"+ this.enclosure);

    }

}
