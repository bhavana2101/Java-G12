import java.util.Scanner;

public class Booking{
    public static void main(String[] args) {
        FlightBooking fb = new FlightBooking();
        BusBooking bb = new BusBooking();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to book a fight, 2 to book bus or 0 to exit : ");
        int n = sc.nextInt();
        if(n==0){
            return;
        }
        else if(n==1){
            System.out.println("Hurry up!.The available bookings in flight are  : "+fb.availableBookings());
            System.out.println("Enter the number of seats you need to book : ");
            int num = sc.nextInt();
            if(num> fb.availableBookings()){
                System.out.println("We are sorry to inform you that the number of bookings available are less than your requirement.");
                return;
            }
            else{
                System.out.println("Enter your details : ");
                System.out.println("Enter your name : ");
                String name = sc.next();
                System.out.println("Enter your age : ");
                int age = sc.nextInt();
                System.out.println("Enter your gender : ");
                String gender = sc.next();
                System.out.println("Enter your aadhaar number : ");
                String aadhaar = sc.next();
                System.out.println("Enter your contact info : ");
                String phoneNum = sc.next();
                fb = new FlightBooking(name,gender,age,aadhaar,phoneNum);
                System.out.println("Confirmation: Are you sure you want to proceed..? (Enter yes to continue) : ");
                String s = sc.next();
                if(s.toLowerCase().equals("yes")){
                    fb.bookTicket(num);
                    String details = "Flight Booking : Details of the passenger \n" +
                            "Name : "+name+" \nGender: "+gender+"\nAge : "+age+"\nContactInfo : "+phoneNum;
                    System.out.println(details);
                    System.out.println("Thank you for choosing us.");
                }
                else{
                    System.out.println("Process terminated.");
                    return;
                }
            }

        }
        else if(n==2){
            System.out.println("Hurry up!.The available bookings in the bus are  : "+bb.availableBookings());
            System.out.println("Enter the number of seats you need to book : ");
            int num = sc.nextInt();
            if(num> fb.availableBookings()){
                System.out.println("We are sorry to inform you that the number of bookings available are less than your requirement.");
                return;
            }
            else{
                System.out.println("Enter your details : ");
                System.out.println("Enter your name : ");
                String name = sc.next();
                System.out.println("Enter your age : ");
                int age = sc.nextInt();
                System.out.println("Enter your gender : ");
                String gender = sc.next();
                System.out.println("Enter your aadhaar number : ");
                String aadhaar = sc.next();
                System.out.println("Enter your contact info : ");
                String phoneNum = sc.next();
                bb = new BusBooking(name,gender,age,aadhaar,phoneNum);
                System.out.println("Confirmation: Are you sure you want to proceed..? (Enter yes to continue) : ");
                String s = sc.next();
                if(s.toLowerCase().equals("yes")){
                    bb.bookTicket(num);
                    String details = "Bus Booking : Details of the passenger \n" +
                            "Name : "+name+" \nGender: "+gender+"\nAge : "+age+"\nContactInfo : "+phoneNum;
                    System.out.println(details);
                    System.out.println("Thank you for choosing us.");
                }
                else{
                    System.out.println("Process terminated.");
                    return;
                }
            }
        }

    }
}
