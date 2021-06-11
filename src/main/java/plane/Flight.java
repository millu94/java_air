package plane;

import people.passengers.Passenger;
import people.staff.CabinCrew;
import people.staff.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String time;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String time){

        this.pilot = pilot;
        this.cabinCrew = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.time = time;
    }

    public Plane getPlane(){
        return this.plane;
    }

    public String getPilotsName() {
        return pilot.getName();
    }

    public int staffCount() {
        return this.cabinCrew.size();
    }

    public void addStaff(CabinCrew staff) {
        this.cabinCrew.add(staff);
        this.plane.addOne();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void everyoneOff(){
        this.plane.emptyPlane();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        this.plane.addOne();
    }

    public void bookPassenger(Passenger passenger) {
        if(plane.getCapacity() > 0){
            passengers.add(passenger);
            this.plane.addOne();
        }
    }

    public String flyPlane() {
        return this.pilot.getName() + " is flying the plane.";
    }

    public String relayMessage() {
        return "Buy a scratch card for £1";
    }
}
