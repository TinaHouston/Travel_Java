public class Passenger {

    private String name;
    private int bagNumber;

    public Passenger(String name, int bagNumber) {
        this.name = name;
        this.bagNumber = bagNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return bagNumber;
    }
}
