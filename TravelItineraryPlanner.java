//Task - 3

//Travel Itinerary Planner

/*Create a travel itinerary planner that allows users to
input destinations, dates, and preferences to generate
a detailed travel plan.*/

import java.util.*;

public class TravelItineraryPlanner {

    // A class to represent a destination with details like name, dates, preferences, weather, and famous places
    static class Destination {
        String name;
        String startDate;
        String endDate;
        String preferences;
        String weather;
        String famousPlaces;

        // Constructor to initialize a Destination object
        public Destination(String name, String startDate, String endDate, String preferences, String weather, String famousPlaces) {
            this.name = name;
            this.startDate = startDate;
            this.endDate = endDate;
            this.preferences = preferences;
            this.weather = weather;
            this.famousPlaces = famousPlaces;
        }

        // Method to return a string representation of the Destination object
        @Override
        public String toString() {
            return "Destination: " + name + "\nDates: " + startDate + " to " + endDate + "\nPreferences: " + preferences + "\nWeather: " + weather + "\nFamous Places: " + famousPlaces + "\n";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List to hold all destinations entered by the user
        List<Destination> destinations = new ArrayList<>();

        System.out.println("Welcome to the Travel Itinerary Planner!");

        while (true) {
            // Display the main menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add a Destination");
            System.out.println("2. View Itinerary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Prompt user for destination details
                    System.out.print("Enter destination name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter start date (yyyy-mm-dd): ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter end date (yyyy-mm-dd): ");
                    String endDate = scanner.nextLine();
                    System.out.print("Enter preferences (e.g., adventure, relaxation): ");
                    String preferences = scanner.nextLine();
                    System.out.print("Enter expected weather (e.g., sunny, rainy): ");
                    String weather = scanner.nextLine();
                    System.out.print("Enter famous places to visit (comma-separated): ");
                    String famousPlaces = scanner.nextLine();

                    // Add the destination to the list
                    destinations.add(new Destination(name, startDate, endDate, preferences, weather, famousPlaces));
                    System.out.println("Destination added successfully!");
                    break;

                case 2:
                    // Display the user's itinerary or a message if none exists
                    if (destinations.isEmpty()) {
                        System.out.println("No destinations added yet!");
                    } else {
                        System.out.println("\nYour Itinerary:");
                        for (Destination dest : destinations) {
                            System.out.println(dest);
                        }
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Thank you for using the Travel Itinerary Planner. Safe travels!");
                    scanner.close();
                    return;

                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
