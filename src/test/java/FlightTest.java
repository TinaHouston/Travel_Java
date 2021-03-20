import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight(plane, "FR756", "GLA", "EDI", "1300");
        passenger = new Passenger("Tina", 20);
        passenger2 = new Passenger("Sara", 10);
        passenger3 = new Passenger("Emily", 5);
        plane = new Plane(PlaneType.AIRBUSA320);
    }

    @Test
    public void assignPlaneToFlight(){
        assertNotNull(flight.getPlane());
    }

    @Test
    public void getFlightPassengerCount(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void addPassengerToFlight(){
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger2);
        assertEquals(2, flight.passengerCount());
    }

    @Test
    public void returnTotalSeats(){
        assertEquals(2, plane.getPassengerCapacityFromEnum());
    }

    @Test
    public void getAvailableSeats(){
        assertEquals(2, flight.availableSeats(plane));
    }

    @Test
    public void bookPassengerIfSeatsAvailable(){
        flight.bookPassenger(plane, passenger);
        flight.bookPassenger(plane, passenger2);
        flight.bookPassenger(plane, passenger3);
        assertEquals(2, flight.passengerCount());
    }

}
