public enum PlaneType {

    AIRBUSA320(2, 200),
    BOEING737(70, 600),
    BOEING777(70, 600),
    AIRBUSA330(30, 600),
    BOEING767(80, 400);

    private final int passengerCapacity;
    private final int totalWeight;

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

    PlaneType(int passengerCapacity, int totalWeight){
        this.passengerCapacity = passengerCapacity;
        this.totalWeight = totalWeight;


    }
}
