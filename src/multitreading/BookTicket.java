package multitreading;

public class BookTicket {
    int totalseat=10;

    synchronized void bookseat(int seat){
        if (totalseat>seat){
            System.out.println("Your Seat has been Booked");
            totalseat=totalseat-seat;
            System.out.println("Remaining Seat "+totalseat);
        }
        else {
            System.out.println("Seat can not be Booked");
            System.out.println("Remaining seat is "+totalseat);
        }
    }
}


class busticket implements Runnable{
    int seat;
    BookTicket b;
    @Override
    public void run() {
       b.bookseat(seat);
    }

    public static void main(String[] args) {
        BookTicket b=new BookTicket();
        Thread t1 = new Thread(String.valueOf(b));
        Thread t2 = new Thread(String.valueOf(b));
        b.bookseat(7);
        t1.start();

        b.bookseat(6);
        t2.start();

    }
}