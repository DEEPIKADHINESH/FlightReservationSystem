public class Regularticket extends Ticket {
    private Boolean food = false;
    private Boolean water = false;
    private Boolean snacks = false;

    public Regularticket(int PNR, String departureLocation, String destinationLocation, Flight flight, String departureTime, String arrivalTime, Passenger passenger, int seatNo, double ticketPrice, boolean cancelled) {
        super(PNR, departureLocation, destinationLocation, flight, departureTime, arrivalTime, passenger, seatNo, ticketPrice, cancelled);
    }

    public Boolean isFood() {
        return food;
    }

    public void setFood(Boolean food) {
        this.food = food;
    }

    public Boolean isWater() {
        return water;
    }

    public void setWater(Boolean water) {
        this.water = water;
    }

    public Boolean isSnacks() {
        return snacks;
    }

    public void setSnacks(Boolean snacks) {
        this.snacks = snacks;
    }
}
