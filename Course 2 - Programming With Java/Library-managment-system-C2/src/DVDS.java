public class DVDS extends Items {
    public int duration;
    
    DVDS(String id, String title,int duration ,String genre, int price) {
        super(id, title, genre, price);
        this.duration = duration;
    }

    @Override
    public void getDetails() {
        System.out.println("** DVDS Details **");
        System.out.println("Book title : " + title);
        System.out.println(" duration: " + duration);
        System.out.println("Genre : " + genre);
        System.out.println("ID : " + id);
    }

    @Override
    public void checkout(Borrower borrower) {
        if(borrower.checkItems(title)){
        System.out.println(" DVDS Checkout ");
        System.out.println("Book title : " + title);
        System.out.println("ID : " + id);
        System.out.println("price : " + price);
    }
        else
            System.out.println(" DVDS is not Available ");
}
    @Override
    public void returnItem(Borrower borrower) {
        System.out.println ("DVDS Return Item "+ "Title : " + title  + "Id : " + id + " Genre : " + genre + " Price : " + price );
    }
}
