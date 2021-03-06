import java.util.ArrayList;
import java.time.LocalTime;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private LocalTime departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, LocalTime departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = new Plane(PlaneType.AIRBUSA320);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = LocalTime.of(20, 50);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public int addPassengerToFlight(Passenger passenger){
        this.passengers.add(passenger);
        return this.passengers.size();
    }

    public int availableSeats (Plane plane){
        return plane.getPassengerCapacityFromEnum();
    }

    public void bookPassenger(Plane plane, Passenger passenger){
        if(this.availableSeats(plane) > passengerCount()){
            this.addPassengerToFlight(passenger);
        }
    }

}
