
import java.util.ArrayList;
import java.util.Scanner;

class Destination {

    private final String name;
    private final String date;
    private final double budget;
    private final String mapLink; // Placeholder for map link
    private final String weatherInfo; // Placeholder for weather information

    public Destination(String name, String date, double budget, String mapLink, String weatherInfo) {
        this.name = name;
        this.date = date;
        this.budget = budget;
        this.mapLink = mapLink;
        this.weatherInfo = weatherInfo;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getBudget() {
        return budget;
    }

    public String getMapLink() {
        return mapLink;
    }

    public String getWeatherInfo() {
        return weatherInfo;
    }

    @Override
    public String toString() {
        return String.format("\nDestination: %s, Date: %s, Budget: $%.2f, Map: %s, Weather: %s",
                name, date, budget, mapLink, weatherInfo);
    }
}

class Itinerary {

    private final ArrayList<Destination> destinations;

    public Itinerary() {
        destinations = new ArrayList<>();
    }

    public void addDestination(String name, String date, double budget, String mapLink, String weatherInfo) {
        Destination destination = new Destination(name, date, budget, mapLink, weatherInfo);
        destinations.add(destination);
        System.out.println("\nDestination added successfully.");
    }

    public void displayItinerary() {
        if (destinations.isEmpty()) {
            System.out.println("\nNo destinations in your itinerary yet.");
            return;
        }
        System.out.println("\nTravel Itinerary:");
        for (Destination destination : destinations) {
            System.out.println(destination);
        }
    }

    public double calculateTotalBudget() {
        double totalBudget = 0;
        for (Destination destination : destinations) {
            totalBudget += destination.getBudget();
        }
        return totalBudget;
    }
}

public class Travel_Itinerary_Planner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Itinerary itinerary = new Itinerary();
            boolean exit = false;
            System.out.println("\nWelcome to the Travel Itinerary Planner!");

            while (!exit) {
                System.out.println("\nTravel Itinerary Planner Menu:");
                System.out.println("1. Add Destination");
                System.out.println("2. View Itinerary");
                System.out.println("3. Calculate Total Budget");
                System.out.println("4. Exit");
                System.out.print("\nChoose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("\nEnter destination name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter travel date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();
                        System.out.print("Enter estimated budget for this destination: ");
                        double budget = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter map link for this destination: ");
                        String mapLink = scanner.nextLine();
                        System.out.print("Enter weather information for this destination: ");
                        String weatherInfo = scanner.nextLine();
                        itinerary.addDestination(name, date, budget, mapLink, weatherInfo);
                    }
                    case 2 ->
                        itinerary.displayItinerary();
                    case 3 ->
                        System.out.println("\nTotal Estimated Budget: $" + itinerary.calculateTotalBudget());
                    case 4 -> {
                        exit = true;
                        System.out.println("\nExiting the Travel Itinerary Planner. Safe travels!\n");
                    }
                    default ->
                        System.out.println("\nInvalid option. Please try again.");
                }
            }
        }
    }
}
