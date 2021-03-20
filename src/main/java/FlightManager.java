import java.util.ArrayList;

public class FlightManager {

    private Plane plane;
    private Passenger passenger;
    private Flight flight;

    public FlightManager(Plane plane, Passenger passenger, Flight flight) {
        this.plane = plane;
        this.flight = flight;
        this.passenger = passenger;
    }

    public Plane getPlane() {
        return plane;
    }


    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public int weightAllowedForPassengers(Plane plane){
        return plane.getWeightAllowedForPassengers();
    }

    public int weightAllowedPerPassenger(Plane plane){
        return weightAllowedForPassengers(plane) / plane.getPassengerCapacityFromEnum();
    }

    public int totalWeightPerBag(Passenger passenger, Plane plane){
        return passenger.getNumberOfBags() * weightAllowedPerPassenger(plane);
    }

    public int weightRemainingOnFlightAfterBookings(Passenger passenger, Plane plane) {
        return weightAllowedForPassengers(plane) - totalWeightPerBag(passenger, plane);
    }


}
