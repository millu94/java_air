package people.staff;

import people.People;

public class CabinCrew extends People {

    private Rank rank;

    public CabinCrew(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank(){
        return rank;
    }

}
