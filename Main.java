import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample usage to test the classes

        // Create destinations
        Destination destination1 = new Destination("Destination 1");
        Destination destination2 = new Destination("Destination 2");

        // Create activities for each destination
        Activity activity1 = new Activity("Activity 1", "Description 1", 100.0, 5, destination1);
        Activity activity2 = new Activity("Activity 2", "Description 2", 50.0, 3, destination1);
        Activity activity3 = new Activity("Activity 3", "Description 3", 80.0, 4, destination2);

        // Add activities to destinations
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);
        destination2.addActivity(activity3);

        // Create a travel package
        List<Destination> itinerary = new ArrayList<>();
        itinerary.add(destination1);
        itinerary.add(destination2);

        TravelPackage travelPackage = new TravelPackage("My Travel Package", 15, itinerary);

        // Print itinerary
        travelPackage.printItinerary();

        // Create passengers
        Passenger passenger1 = new Passenger("Passenger 1", 1, PassengerType.STANDARD);
        Passenger passenger2 = new Passenger("Passenger 2", 2, PassengerType.GOLD);

        // Sign up passengers for activities
        passenger1.signUpForActivity(activity1);
        passenger2.signUpForActivity(activity2);

        // Print passenger details
        travelPackage.printPassengerDetails(passenger1);
        travelPackage.printPassengerDetails(passenger2);

        // Print available activities
        travelPackage.printAvailableActivities();
    }
}
