public abstract class Person {
    private String name;
     Date dob;
public Person(String name, Date dob) {
    this.name = name;
    this.dob = dob;
}
    abstract void getDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
