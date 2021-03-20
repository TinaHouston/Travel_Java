import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PassengerTest {

    Passenger passenger;
    Flight flight;
    Plane plane;
    LocalTime departureTime;

    @Before
    public void before(){
        passenger = new Passenger("Tina", 5, flight, 40);
        flight = new Flight(plane, "765", "GLA", "EDI", departureTime);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Tina", passenger.getName());
    }

    @Test
    public void passengerHasSNumberOfBags(){
        assertEquals(5, passenger.getNumberOfBags());
    }

    @Test
    public void printSeatNumber(){
        assertNotNull(passenger.getSeatNumber());
    }

}
