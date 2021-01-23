public class Touristticket extends Ticket {
    private Address hotelAddress;
    private String[] location;

    public Touristticket(int PNR, String departureLocation, String destinationLocation, Flight flight, String departureTime, String arrivalTime, Passenger passenger, int seatNo, double ticketPrice, boolean cancelled) {
        super(PNR, departureLocation, destinationLocation, flight, departureTime, arrivalTime, passenger, seatNo, ticketPrice, cancelled);
    }

    public Address getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(Address hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }
}
