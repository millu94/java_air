import org.junit.Before;
import org.junit.Test;
import people.passengers.Passenger;
import people.staff.CabinCrew;
import people.staff.Pilot;
import people.staff.Rank;
import plane.Flight;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;
    Passenger passenger9;
    Passenger passenger10;

    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Pilot pilot;

    Plane plane;
    Flight flight;

    @Before
    public void before(){
        passenger1 = new Passenger("Gregg", 2);
        passenger2 = new Passenger("Steve", 1);
        passenger3 = new Passenger("Pat", 2);
        passenger4 = new Passenger("Selma", 1);
        passenger5 = new Passenger("Mary", 3);
        passenger6 = new Passenger("Lisa", 2);
        passenger7 = new Passenger("Bob", 1);
        passenger8 = new Passenger("Jim", 2);
        passenger9 = new Passenger("Sherry", 1);
        passenger10 = new Passenger("Maria", 3);

        cabinCrew1 = new CabinCrew("Jeff", Rank.FLIGHTATTENDANT);
        cabinCrew2 = new CabinCrew("Sally", Rank.FIRSTOFFICER);
        pilot = new Pilot("Joe", Rank.CAPTAIN, "PL986424");

        plane = new Plane(PlaneType.MINIPLANE);
        flight = new Flight(pilot, plane, "FR756", "IBZ", "GLA", "now");
    }

    @Test
    public void checkPlaneHasCapacity(){
        flight.everyoneOff();
        assertEquals(10, flight.getPlane().getCapacity());
    }

    @Test
    public void checkFlightHasPilot(){
        assertEquals("Joe", flight.getPilotsName());
    }

    @Test
    public void checkPlaneHasNoStaff(){
        assertEquals(0, flight.staffCount());
    }

    @Test
    public void addStaffToPlane(){
        flight.addStaff(cabinCrew1);
        flight.addStaff(cabinCrew2);
        assertEquals(2, flight.staffCount());
    }

    @Test
    public void checkPlaneHasNoPassengers(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void addPassengersToPlane(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        assertEquals(5, flight.passengerCount());
    }

    @Test
    public void checkCapacityGoesDownWhenStaffAndPeopleAreAdded(){
        flight.everyoneOff();
        flight.addStaff(cabinCrew1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(7, flight.getPlane().getCapacity());
    }

    @Test
    public void canBookPassengers(){
        flight.everyoneOff();
        flight.bookPassenger(passenger1);
        assertEquals(9, flight.getPlane().getCapacity());
    }

    @Test
    public void cantBookPassengersWhenPlaneIsFull(){
        flight.everyoneOff();
        flight.addStaff(cabinCrew1);
        flight.addStaff(cabinCrew2);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
        flight.bookPassenger(passenger6);
        flight.bookPassenger(passenger7);
        flight.bookPassenger(passenger8);
        assertEquals(0, flight.getPlane().getCapacity());
        flight.bookPassenger(passenger9);
        assertEquals(0, flight.getPlane().getCapacity());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Joe is flying the plane.", flight.flyPlane());
    }

    @Test
    public void crewCanTalkToPassengers(){
        assertEquals("Buy a scratch card for £1", flight.relayMessage());
    }

}
