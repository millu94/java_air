package plane;

public class Plane {

    private PlaneType type;

    public Plane(PlaneType planetype){
        this.type = planetype;

    }

    public PlaneType getPlaneType(){
        return this.type;
    }

    public int getCapacity() {
        return this.type.getCapacity();
    }

    public void addOne(){
        this.type.addOneToPlane();
    }

    public void emptyPlane(){
        this.type.resetCapacity();
    }

    public int getWeight() {
        return type.getWeight();
    }
}
