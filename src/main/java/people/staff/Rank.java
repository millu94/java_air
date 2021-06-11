package people.staff;

public enum Rank {

    CAPTAIN(1),
    FIRSTOFFICER(2),
    FLIGHTATTENDANT(3);

    private final int rating;

    Rank(int rating){
        this.rating = rating;
    }

    public int getRating(){
        return this.rating;
    }

}
