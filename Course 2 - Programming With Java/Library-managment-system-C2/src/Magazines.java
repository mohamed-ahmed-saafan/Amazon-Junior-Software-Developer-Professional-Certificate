public class Magazines extends Items {
    public String brand;

    Magazines(String id, String title,String brand,String genre, int price) {
        super(id, title, genre, price);
        this.brand = brand;
    }

    @Override
    public void getDetails() {
        System.out.println("** Magazine Details **");
        System.out.println("title : " + title);
        System .out.println("brand : " + brand);
        System.out.println("ID : " + id);
    }

    @Override
    public void checkout(Borrower borrower) {
        if (borrower.checkItems(title)) {
            System.out.println(" Magazine Checkout ");
            System.out.println("Book title : " + title);
            System.out.println("ID : " + id);
            System.out.println("price : " + price);
        }
        else
            System.out.println(" Magazine is not Available ");
    }
    @Override
    public void returnItem(Borrower borrower) {
        System.out.println (" Magazine Return Item " + "title : " + title + " price : " + price + " id : " + id);
    }
}
