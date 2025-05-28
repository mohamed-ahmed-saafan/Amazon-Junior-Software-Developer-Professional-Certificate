public class Ticket
{
    public static void main (String[] args)
    {
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The source code";
        int numberOfTickets = 8;
        double pricePerTicket = 10.57;
        double totalPrice=  (numberOfTickets * pricePerTicket);
        String username = (firstName + lastName).toLowerCase();
        String movieName = movieTitle.toUpperCase();

        System.out.println("Congratulations!! You have successfully booked the tickets\n" +"\n" + "username: " + username + "\n" +"Movie: " + movieName + "\n" +"number of tickets : " + numberOfTickets + "\n" + "pritce per ticket  :$" + pricePerTicket + "\n" + "total price of 8 tickets  :$" + totalPrice + "\n" +"\n" + "Thank you for choosing us for booking your movie tickets" + "\n" + "Enjoy your movie!!!\n" );





    }
}
