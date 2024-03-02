import java.util.List;
import java.util.ArrayList;

public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType type;
    private double balance;
    private List<Activity> signedUpActivities;

    public Passenger(String name, int passengerNumber, PassengerType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = 0.0;
        this.signedUpActivities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public PassengerType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public List<Activity> getSignedUpActivities() {
        return signedUpActivities;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean signUpForActivity(Activity activity) {
        if (activity.getCapacityStatus()) {
            double price = activity.calculatePriceForPassenger(this);
            if (type == PassengerType.STANDARD && balance < price) {
                System.out.println("Insufficient balance. Cannot sign up for the activity.");
                return false;  // Return false if signup fails
            } else {
                if (type == PassengerType.STANDARD) {
                    balance -= price;
                } else if (type == PassengerType.GOLD) {
                    balance -= price * 0.10;
                } else if (type == PassengerType.PREMIUM) {
                    balance = 0.0;
                }

                activity.addEnrolledPassenger(this);
                signedUpActivities.add(activity);

                System.out.println(name + " signed up for " + activity.getName() + " at " + activity.getDestination().getName() +
                        ". Price paid: " + price);
                return true;  // Return true if signup is successful
            }
        } else {
            System.out.println("Activity is full. Cannot sign up.");
            return false;  // Return false if signup fails
        }
    }
}