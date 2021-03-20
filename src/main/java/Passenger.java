import java.util.Random;

public class Passenger {

    private String name;
    private int bagNumber;
    private Flight flight;
    private Random seatNumber;

    public Passenger(String name, int bagNumber, Flight flight, int seatNumber) {
        this.name = name;
        this.bagNumber = bagNumber;
        this.flight = flight;
        this.seatNumber = new Random();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return bagNumber;
    }

    public Random getSeatNumber() {
        int min = 1;
        int max = 100;
        return seatNumber;
    }

    public Flight getFlight(Passenger passenger){
        if(flight != null){
            flight.addPassengerToFlight(passenger);
        } return flight;
    }
}
