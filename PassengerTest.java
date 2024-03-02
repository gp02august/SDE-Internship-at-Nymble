import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerTest {

    @Test
    public void testSignUpForActivityWithInsufficientBalance() {
        Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD);
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 5, new Destination("Test Destination"));

        assertFalse(passenger.signUpForActivity(activity));
        // Check the expected state or outcome directly
        assertFalse(passenger.getSignedUpActivities().contains(activity));
        assertEquals(0.0, passenger.getBalance(), 0.001);  // Balance should remain unchanged
    }

    @Test
    public void testSignUpForActivityWithSufficientBalance() {
        Passenger passenger = new Passenger("Alice", 2, PassengerType.STANDARD);
        passenger.setBalance(100.0);
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 5, new Destination("Test Destination"));

        assertTrue(passenger.signUpForActivity(activity));
        // Check the expected state or outcome directly
        assertTrue(passenger.getSignedUpActivities().contains(activity));
        assertEquals(50.0, passenger.getBalance(), 0.001);  // Balance should be reduced by the activity price
    }

    @Test
    public void testSignUpForActivityWithGoldPassenger() {
        // Create a Gold passenger with $100 balance
        Passenger passenger = new Passenger("Bob", 3, PassengerType.GOLD);
        passenger.setBalance(100.0);

        // Create an activity with a price of $50
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 5, new Destination("Test Destination"));

        // SignUp for the activity
        assertTrue(passenger.signUpForActivity(activity));

        // Check the expected state or outcome directly
        assertTrue(passenger.getSignedUpActivities().contains(activity));
        assertEquals(95.5, passenger.getBalance(), 0.001);  // Balance should be reduced by 10%
    }


    @Test
    public void testSignUpForActivityWithPremiumPassenger() {
        Passenger passenger = new Passenger("Eve", 4, PassengerType.PREMIUM);
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 5, new Destination("Test Destination"));

        assertTrue(passenger.signUpForActivity(activity));
        // Check the expected state or outcome directly
        assertTrue(passenger.getSignedUpActivities().contains(activity));
        assertEquals(0.0, passenger.getBalance(), 0.001);  // Balance should be reduced to 0
    }
}
