import java.util.ArrayList;
public class Borrower {
    public String name;
    public int customerID;
    public ArrayList<String> borrowers=new ArrayList<>();
    Borrower(String name , int customerID) {}
    public void addItems(String name){
        this.borrowers.add(name);

    }
    public boolean checkItems(String name){
        return borrowers.contains(name);
    }


}
