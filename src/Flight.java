public class Flight {
    private int flightNum;
    private String airline;
    private int capacity;
    private int seatsBooked;

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public Flight(int flightNum, String airline, int capacity) {
        this.flightNum = flightNum;
        this.airline = airline;
        this.capacity = capacity;
    }
}


