import java.util.ArrayList;
import java.util.List;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;
    private List<Passenger> enrolledPassengers;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.enrolledPassengers = new ArrayList<>();
    }

    public boolean signUpPassenger(Passenger passenger) {
        if (getCapacityStatus()) {
            addEnrolledPassenger(passenger);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public Destination getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Passenger> getEnrolledPassengers() {
        return enrolledPassengers;
    }

    public double calculatePriceForPassenger(Passenger passenger) {
        if (passenger.getType() == PassengerType.PREMIUM) {
            return 0.0;
        } else if (passenger.getType() == PassengerType.GOLD) {
            return cost * 0.9;
        } else {
            return cost;
        }
    }

    public String getDescription() {
        return description;
    }

    public boolean getCapacityStatus() {
        return enrolledPassengers.size() < capacity;
    }

    public void addEnrolledPassenger(Passenger passenger) {
        enrolledPassengers.add(passenger);
    }
}
