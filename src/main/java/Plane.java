public class Plane {

    private PlaneType model;

    public Plane(PlaneType model) {
        this.model = model;
    }

    public PlaneType getModel() {
        return model;
    }

    public int getPassengerCapacityFromEnum(){
        return this.model.getPassengerCapacity();
    }

    public int getTotalWeightFromEnum(){
        return this.model.getTotalWeight();
    }

    public int getWeightAllowedForPassengers(){
        return this.getTotalWeightFromEnum() /2;
    }

}
