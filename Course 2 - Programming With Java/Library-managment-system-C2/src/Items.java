    public  abstract class Items {
        protected String id;
        protected String title;
        protected String genre;
        protected int price;
        Borrower borrower;

        Items(String id, String title, String genre, int price) {
            this.id = id;
            this.title = title;
            this.genre = genre;
            this.price = price;
        }

        public abstract void getDetails();
        public abstract void checkout(Borrower borrower);
        public abstract void returnItem(Borrower borrower);

    }
