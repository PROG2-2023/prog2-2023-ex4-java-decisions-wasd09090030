


package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;


public class FlightBooking {

    String passengerFullName;
    String company;

    TripSource tripSource;
    LocalDate returnDate;
    LocalDate departureDate;
    BookingClass bookingClass;
    TripType tripType;
    int child;
    int adults;
    double Departingprice;
    double DeturnTicketPrice;
    double getTotalTicketPrice;
    TripDestination tripDestination;
    TripDestination tripDestination1;

    String sreturn;
    String sdepart;



    enum TripSource {
        NANJING, BEIJING, OULU, Helsinki
    }

    enum BookingClass {
        FIRST, Business, Economy
    }

    enum TripDestination {
        NANJING, BEIJING, OULU, Helsinki
    }

    enum TripType {
        ONE_WAY, RETURN
    }





    public FlightBooking(Object o, Object o1, Object o2, int i, int i1) {

    }


    public FlightBooking(){}

    public void setTripDestination(String s, String s1) {

         if (s.equals(s1)){
            switch (s) {
                case "1":tripDestination=TripDestination.NANJING;break;
                case "2":tripDestination=TripDestination.BEIJING;break;
                case "3":tripDestination=TripDestination.OULU;break;
                case "4":tripDestination=TripDestination.Helsinki;break;

            }
             switch (s1) {
                 case "1":tripDestination1=TripDestination.NANJING;break;
                 case "2":tripDestination1=TripDestination.BEIJING;break;
                 case "3":tripDestination1=TripDestination.OULU;break;
                 case "4":tripDestination1=TripDestination.Helsinki;break;

             }




        }

    }
    public void setDepartingTicketPrice(int child, int adults) {
        this.child=child;
        this .adults=adults;
       double Departingprice=(((child *(300 * (0.1*300) + (0.05*300))) + (adults*(300 * (0.1*300) + (0.05*300)))) + 250);
         this.Departingprice=Departingprice;
    }



    public double getDepartingTicketPrice(){
        return Departingprice;
    }
    public void setReturnTicketPrice() {
        double DeturnTicketPrice=Departingprice;
        this.DeturnTicketPrice=DeturnTicketPrice;
    }
    public double DeturnTicketPrice(){
        return DeturnTicketPrice;
    }



    public void  setTotalTicketPrice(){

        double getTotalTicketPrice=Departingprice+DeturnTicketPrice;
        this.getTotalTicketPrice=getTotalTicketPrice;
    }



    public double getTotalTicketPrice(){

        return getTotalTicketPrice;
    }




    public void setBookingClass(String s) {
        switch (s) {
            case "1":bookingClass=BookingClass.FIRST;break;
            case "2":bookingClass=BookingClass.Business;break;
            case "3":bookingClass=BookingClass.Economy;break;

        }
    }


    public BookingClass  getBookingClass(){
        return bookingClass;
    }
    public void setTripSource(String s) {


        switch (s) {
            case "1":tripSource=TripSource.NANJING;break;
            case "2":tripSource=TripSource.BEIJING;break;
            case "3":tripSource=TripSource.OULU;break;


        }


    }

    public TripSource getTripSource(){
        return tripSource;
    }



    public void setTripType(String s) {


        switch (s) {
            case "1":
                tripType = TripType.ONE_WAY;break;
            case "2":
                tripType = TripType.RETURN;break;


        }
    }

    public TripType getTripType(){
        return  tripType;
    }



        public void setDepartureDate (LocalDate departureDate){
            this.departureDate = departureDate;

        }

        public void setReturnDate (LocalDate returnDate){
            this.returnDate = returnDate;
        }


        String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT";
        String destinationAirport = "OULU AIRPORT";


        public String getTicketNumber () {

            String flight = "11FASDFDOM";

            return flight;

        }


        public java.time.LocalDate getReturnDate () {
            String sreturn = "2023-03-06";
            this .sreturn=sreturn;
            LocalDate returnDate = LocalDate.parse(sreturn);
            return returnDate;
        }




    public java.time.LocalDate getdepartDate () {
        String sdepart= "2023-03-06";
        this .sdepart=sdepart;
        LocalDate departDate = LocalDate.parse(sdepart);
        return departDate;
    }

        public void setPassengerFullName () { /*System.out.println("please enter your name ");

         Scanner sc = new Scanner(System.in);

        String passengerFullName = sc.next();*/
            String passengerFullName="null";
            this .passengerFullName=passengerFullName;

        }
        public String getPassengerFullName(){
            return passengerFullName;
        }



        public void setFlightCompany () {
            String company = "nanjinfight";
            this.company=company;
        }


        public String getFlightCompany(){
            return company;
        }
        public String getTripDestination () {
            String tripDestination = "oulu";
            return tripDestination;
        }




        public int getChildrenPassengers () {
            int childPassengers = 2;
            return childPassengers;
        }

        public int getAdultPassengers () {
            int adultPassengers = 3;
            return adultPassengers;
        }

        public int getTotalPassengers ( int i, int t){
            int totalPassengers = i + t;
            return totalPassengers;
        }

    public void  work() {
        FlightBooking run = new FlightBooking();

        String passengerFullName = run.getPassengerFullName();
        String company = run.getFlightCompany();
        TripSource source = run.getTripSource();
        String tripDestination = run.getTripDestination();
        String ticketNumber = run.getTicketNumber();
        int chi = run.getChildrenPassengers();
        int adu = run.getAdultPassengers();
        int totalPassengers = run.getTotalPassengers(chi, adu);

        String testString = "Dear " + passengerFullName + ". Thank you for booking your flight with " +
                company + ". Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + ticketNumber + "\n" +
                "From " + tripDestination + " to " + tripDestination1 + "\n" +
                "Date of departure: " + sdepart + "\n" +
                "Date of return: " + sreturn + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " +  getTotalTicketPrice;

    }

    }

