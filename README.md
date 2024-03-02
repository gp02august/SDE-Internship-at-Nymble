# Travel Package Management System
  This Java application, Travel Planner, allows users to create travel packages with destinations, activities, and sign up passengers for various activities within those destinations. The application demonstrates the usage of classes such as 'Destination', 'Activity, Passenger', and 'TravelPackage' to organize and manage travel-related information.
# Editor Used:
* Visual Studio Code
# Extension which are used for testing the cases:
* JUnit

# Table of Contents
* Getting Started
* Usage
* Classes Overview
* Sample Usage
# Usage
  The Travel Planner application provides a simple framework for creating travel packages, destinations, activities, and managing passenger sign-ups. Users can customize their travel itineraries and sign up passengers for specific activities within each destination.
# Classes Overview
* Destination: Represents a travel destination and contains a list of activities available in that destination.
* Activity: Represents an activity within a destination, including details such as name, description, cost, and duration.
* Passenger: Represents a passenger who can sign up for activities. Each passenger has a name, ID, and type (standard or gold).
* TravelPackage: Represents a complete travel package with a name, duration, and an itinerary containing a list of destinations.
# Sample Usage
 The 'Main' class provides a sample usage of the Travel Planner application. It demonstrates how to create destinations, activities, a travel package, passengers, and sign up passengers for activities. Run the 'Main' class to see the application in action.
# Destination Class
 The 'Destination' class is part of a Travel Planner application, designed to organize travel destinations and their associated activities. This README file provides an overview of the 'Destination' class and its usage.
# Table of Contents
* Class Overview
* Methods
* Sample Usage
# Destination
The Destination class represents a travel destination and contains a list of activities available within that destination. It has the following attributes:
* 'name' (String): The name of the destination.
* 'activities' (List<Activity>): A list containing activities associated with the destination.
# Methods
'public Destination(String name)'
* Constructor for the 'Destination' class. Initializes the destination with the provided name and an empty list of activities.
'public void addActivity(Activity activity)'
* Adds a new activity to the list of activities associated with the destination.
'public String getName()'
* Returns the name of the destination.
'public List<Activity> getActivities()'
* Returns the list of activities associated with the destination.
# Activity Class
 The 'Activity' class is a component of a Travel Planner application, responsible for managing activities within travel destinations. This README file provides an overview of the 'Activity' class and its functionalities.
# Table of Contents
* Class Overview
* Methods
* Sample Usage
# class overview
# Activity
The Activity class represents an activity available within a travel destination. It includes details such as name, description, cost, capacity, associated destination, and enrolled passengers. Key attributes include:
* 'name' (String): The name of the activity.
* 'description' (String): A brief description of the activity.
* 'cost (double)': The cost of participating in the activity.
* 'capacity (int)': The maximum number of passengers allowed to enroll in the activity.
* 'destination (Destination)': The destination associated with the activity.
* 'enrolledPassengers (List<Passenger>)': A list of passengers enrolled in the activity.
# Methods
# Constructor
'public Activity(String name, String description, double cost, int capacity, Destination destination)'
* Initializes an activity with the provided name, description, cost, capacity, and associated destination. Also initializes the list of enrolled passengers.
# Main Methods
 'public boolean signUpPassenger(Passenger passenger)'
* Registers a passenger for the activity if there is available capacity. Returns 'true' if the passenger is successfully enrolled, otherwise 'false'.
 'public double calculatePriceForPassenger(Passenger passenger)'
* Calculates the price for participating in the activity based on the passenger's type (standard, gold, premium). Returns the calculated price.
# Getters
* 'getName()': Returns the name of the activity.
* 'getDescription()': Returns the description of the activity.
* 'getCost()': Returns the cost of participating in the activity.
* 'getCapacity()': Returns the maximum capacity of the activity.
* 'getDestination()': Returns the destination associated with the activity.
* 'getEnrolledPassengers()": Returns the list of passengers enrolled in the activity.
* 'getCapacityStatus()': Returns true if there is available capacity for the activity, otherwise false.
# Additional Methods
* 'addEnrolledPassenger(Passenger passenger)': Adds a passenger to the list of enrolled passengers.
# ActivityStatus Enum
 The 'ActivityStatus' enum is a simple representation of the status of an activity within a Travel Planner application. This README file provides a brief overview of the 'ActivityStatus' enum and its intended usage.
# Table of Contents
* Enum Overview
* Values
* Sample Usage
* Enum Overview
* ActivityStatus
 The 'ActivityStatus' enum represents the status of an activity, indicating whether it is open for enrollment or full.

# Values
* 'OPEN': Indicates that the activity is open for enrollment, and passengers can sign up.
* 'FULL': Indicates that the activity is full, and no additional passengers can enroll.
# TravelPackage Class
 The 'TravelPackage' class is a fundamental component of a Travel Planner application, responsible for managing travel packages, itineraries, passengers, and activities. This README file provides an overview of the 'TravelPackage' class and its functionalities.

# Table of Contents
* Class Overview
* Methods
* Sample Usage
# Class Overview
* TravelPackage
 The 'TravelPackage' class represents a complete travel package, including a name, passenger capacity, itinerary (list of destinations), and a list of passengers. It provides methods for printing itinerary details, passenger information, details for a specific passenger, and available activities within the travel package.

# Methods
# Constructor
 'public TravelPackage(String name, int passengerCapacity, List<Destination> itinerary)'
* Initializes a travel package with the provided name, passenger capacity, and itinerary. Also initializes the list of passengers.
# Main Methods
 'public void printItinerary()'
* Prints the details of the travel package itinerary, including destinations, activities, costs, capacities, and descriptions.
 'public void printPassengerList()'
* Prints the list of passengers enrolled in the travel package, including their names and passenger numbers.
 'public void printPassengerDetails(Passenger passenger)'
* Prints detailed information for a specific passenger, including their name, number, balance (if not premium), and signed-up activities.
 'public void printAvailableActivities()'
* Prints the list of available activities within the travel package, including activity names, destinations, and prices.
# Passenger Class
 The 'Passenger' class is a crucial component of a Travel Planner application, responsible for managing information about passengers, including their name, passenger number, type, balance, and signed-up activities. This README file provides an overview of the 'Passenger' class and its functionalities.

# Table of Contents
* Class Overview
* Methods
* Sample Usage
# Class Overview
# Passenger
 The 'Passenger' class represents an individual participating in a travel package. It includes attributes such as name, passenger number, type (standard, gold, premium), balance, and a list of signed-up activities.

# Methods
# Constructor
 'public Passenger(String name, int passengerNumber, PassengerType type)'
* Initializes a passenger with the provided name, passenger number, and type. Sets the initial balance to 0 and initializes the list of signed-up activities.
# Getters
'public String getName()': Returns the name of the passenger.
'public int getPassengerNumber()': Returns the passenger number.
'public PassengerType getType()': Returns the type of the passenger (standard, gold, premium).
'public double getBalance()': Returns the current balance of the passenger.
'public List<Activity> getSignedUpActivities()': Returns the list of activities that the passenger has signed up for.
# Setters
'public void setBalance(double balance)': Sets the balance of the passenger.
# Main Method
'public boolean signUpForActivity(Activity activity)'
 Allows the passenger to sign up for a specific activity. Checks the activity's capacity, the passenger's balance, and the passenger type to determine eligibility. If eligible, deducts the appropriate amount from the balance, adds the passenger to the activity's enrolled list, and adds the activity to the passenger's signed-up activities. Returns 'true' if the signup is successful, otherwise 'false'.
# PassengerTest
 The 'PassengerTest' class contains a set of JUnit tests to verify the functionality of the Passenger class in a Travel Planner application. These tests cover scenarios related to signing up passengers for activities with different passenger types and varying balances.

# Table of Contents
* Test Cases
* Running the Tests
# Test Cases
# 'testSignUpForActivityWithInsufficientBalance'
* 'Scenario': A standard passenger attempts to sign up for an activity with an insufficient balance.
* 'Expected Outcome': The signup should fail, and the passenger's balance and signed-up activities should remain unchanged.
# 'testSignUpForActivityWithSufficientBalance'
* 'Scenario': A standard passenger with a sufficient balance attempts to sign up for an activity.
* 'Expected Outcome': The signup should succeed, and the passenger's balance should be reduced by the activity price.
# 'testSignUpForActivityWithGoldPassenger'
* 'Scenario': A gold passenger attempts to sign up for an activity.
* 'Expected Outcome': The signup should succeed, and the gold passenger's balance should be reduced by 10% of the activity price.
# 'testSignUpForActivityWithPremiumPassenger'
* 'Scenario': A premium passenger attempts to sign up for an activity.
* 'Expected Outcome': The signup should succeed, and the premium passenger's balance should be reduced to 0.
# Running the Tests
 To run the tests, execute the following steps:

1. Ensure you have JUnit configured in your project.
2. Run the PassengerTest class.
  The tests will validate the correct behavior of the signUpForActivity method for different passenger types and balance scenarios.
