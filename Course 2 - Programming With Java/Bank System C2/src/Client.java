public class Client {
    String name;
    String id;
    String dob;
    String email;

    public Client(String name, String id, String dob , String email) throws InvalidInputException {
        this.name = name;
        this.dob = dob;
        // checking Email validity
        if(email.contains("@")) {
            this.email=email;
        }
        else {
            throw new InvalidInputException("Email is not valid , please enter a valid email address");
        }
        // checking ID validity
        if (id.length() == 8){
            this.id = id;
        }
        else {
            throw new IllegalArgumentException("ID is not valid , please enter a valid id");
        }


    }


    @Override
    public String toString() {
        return "Client{" +
                "name=" + name +
                ", id=" + id +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
