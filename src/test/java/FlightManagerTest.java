import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Passenger passenger;
    Passenger passenger2;
    Flight flight;
    Plane plane;
    LocalTime departureTime;

    @Before
    public void before(){
        flightManager = new FlightManager(plane, passenger, flight);
        flight = new Flight(plane, "FR756", "GLA", "EDI", departureTime);
        passenger = new Passenger("Sara", 2, flight, 28);
        passenger2 = new Passenger("Tina", 3, flight, 30);
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void weightAllowedForPassengers(){
        assertEquals(300, flightManager.weightAllowedForPassengers(plane));
    }

    @Test
    public void calculateBaggagePerPassenger(){
        assertEquals(4, flightManager.weightAllowedPerPassenger(plane));
    }


    @Test
    public void calculateTotalWeightOfPassengerBags(){
        flight.addPassengerToFlight(passenger2);
        assertEquals(12, flightManager.totalWeightPerBag(passenger2, plane));
    }

    @Test
    public void calculateRemainingWeightOnPlane(){
        flight.addPassengerToFlight(passenger2);
        assertEquals(288, flightManager.weightRemainingOnFlightAfterBookings(passenger2, plane));
    }
}
