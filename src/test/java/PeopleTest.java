import org.junit.Before;
import org.junit.Test;
import people.passengers.Passenger;
import people.staff.CabinCrew;
import people.staff.Pilot;
import people.staff.Rank;

import static org.junit.Assert.assertEquals;

public class PeopleTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Pilot pilot;


    @Before
    public void before(){
        passenger1 = new Passenger("Gregg", 2);
        passenger2 = new Passenger("Steve", 1);
        passenger3 = new Passenger("Pat", 2);
        passenger4 = new Passenger("Selma", 1);
        passenger5 = new Passenger("Mary", 3);

        cabinCrew1 = new CabinCrew("Jeff", Rank.FLIGHTATTENDANT);
        cabinCrew2 = new CabinCrew("Sally", Rank.FIRSTOFFICER);
        pilot = new Pilot("Joe", Rank.CAPTAIN, "PL986424");
    }

    @Test
    public void checkPassengerName(){
        assertEquals("Pat", passenger3.getName());
    }

    @Test
    public void checkPassengerHasBags(){
        assertEquals(2, passenger3.getNumberOfBags());
    }

    @Test
    public void checkCabinCrewHasName(){
        assertEquals("Jeff", cabinCrew1.getName());
    }

    @Test
    public void checkCabinCrewHasRank(){
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrew1.getRank());
    }

    @Test
    public void checkPilotHasName(){
        assertEquals("Joe", pilot.getName());
    }

    @Test
    public void checkPilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void checkPilotHasLicense(){
        assertEquals("PL986424", pilot.getLicense());
    }
}
