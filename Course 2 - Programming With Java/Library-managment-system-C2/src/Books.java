public class Books extends Items {
    public int numberOfPages;

    Books(String id, String title, String genre,int numberOfPages, int price) {
        super(id, title, genre, price);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void getDetails() {
        System.out.println("** Books Details **");
        System.out.println("Book title : " + title);
        System.out.println("Genre : " + genre);
        System.out.println("numberOfPages: " + numberOfPages);
        System.out.println("ID : " + id);
    }

    @Override
    public void checkout(Borrower borrower) {
        if(borrower.checkItems(title)) {
        System.out.println("The Book is Available");
        System.out.println("Checkout Book");
        System.out.println("Book title : " + title);
        System.out.println("ID : " + id);
        System.out.println("price = " + price);
        borrower.addItems(title);
    }
        else
            System.out.println("This Book is not available");
}
    @Override
    public void returnItem(Borrower borrower) {
        if (borrower.checkItems(title)) {
            System.out.println("Return Book " + "Book title : " + title + " Id :  " + id + " numberOfPages : " + numberOfPages);
        }
        else
            System.out.println("This Book didn't Checkout");
    }
}
