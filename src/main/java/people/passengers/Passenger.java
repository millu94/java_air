package people.passengers;

import people.People;

public class Passenger extends People {

    private int numberOfBags;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
    }

    public int getNumberOfBags(){
        return this.numberOfBags;
    }
}
