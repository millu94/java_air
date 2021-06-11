package plane;

public enum PlaneType {

    BOEING747(366, 187000),
    MINIPLANE(10, 69000);

    private int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addOneToPlane(){
        this.capacity -= 1;
    }

    public void resetCapacity(){
        this.capacity = 10;
    }

    public int getWeight(){
        return this.weight;
    }
}
