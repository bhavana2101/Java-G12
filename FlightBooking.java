public class FlightBooking implements TravelBooking{

    private String name;
    private String gender;
    private int age;
    private String aadharNumber;
    private String phoneNumber;
    private int seats = 200;
    private int bookings = 100;

    public FlightBooking(){
        super();
    }

    public FlightBooking(String name, String gender, int age, String aadharNumber, String phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.aadharNumber = aadharNumber;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void bookTicket(int n) {
        System.out.println("You are in a waiting list...");
        System.out.println("We are glad to inform you that your seat is confirmed.");
        bookings += n;
    }

    @Override
    public void cancelTicket() {
        System.out.println("Wait while we process... ");
        System.out.println("Your ticket is cancelled successfully!");

    }
    public int availableBookings(){
        return seats-bookings;
    }

}
