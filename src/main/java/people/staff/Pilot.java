package people.staff;

import people.People;

public class Pilot extends People {

    private Rank rank;
    private String license;

    public Pilot(String name, Rank rank, String license) {
        super(name);
        this.rank = rank;
        this.license = license;
    }

    public Rank getRank(){
        return rank;
    }

    public String getLicense(){
        return this.license;
    }
}
