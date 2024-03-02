import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity, List<Destination> itinerary) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = new ArrayList<>();
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("- Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("  - Activity: " + activity.getName() +
                        ", Cost: " + activity.getCost() +
                        ", Capacity: " + activity.getCapacity() +
                        ", Description: " + activity.getDescription());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name);
        System.out.println("Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("- Passenger: " + passenger.getName() +
                    ", Number: " + passenger.getPassengerNumber());
        }
    }

    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Details for Passenger: " + passenger.getName());
        System.out.println("Number: " + passenger.getPassengerNumber());
        if (passenger.getType() != PassengerType.PREMIUM) {
            System.out.println("Balance: " + passenger.getBalance());
        }
        System.out.println("Signed Up Activities:");
        for (Activity activity : passenger.getSignedUpActivities()) {
            System.out.println("- Activity: " + activity.getName() +
                    ", Destination: " + activity.getDestination().getName() +
                    ", Price: " + activity.calculatePriceForPassenger(passenger));
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities for Travel Package: " + name);
        for (Destination destination : itinerary) {
            for (Activity activity : destination.getActivities()) {
                if (activity.getCapacityStatus()) {
                    System.out.println("- Activity: " + activity.getName() +
                            ", Destination: " + activity.getDestination().getName() +
                            ", Price: " + activity.getCost());
                }
            }
        }
    }

    // Other methods and getters
}
