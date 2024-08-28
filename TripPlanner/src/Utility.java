import java.util.*;

public class Utility {
    static ArrayList<Trip> trips = new ArrayList<>();
    //jeg har lavet arraylist her static så den kan bruges i metoderne nedenunder, husker ikke om det er dårlig kodeskik?
    public static final String ANSI_PURPLE = "\u001B[35m"; //udelukkende æstetik for at skifte farve en ansi escape code, 35 er farvekoden
    public static final String ANSI_RESET = "\u001B[0m";


    public static void mainMenu() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("*****************************");
            System.out.println(ANSI_PURPLE + "*Welcome to the Trip Planner*" + ANSI_RESET);
            System.out.println("*****************************");
            System.out.println("\nType 1 to Create a new Trip\nType 2 To View your latest created Trips in a List\nType 3 to Exit the Trip Planner");
            System.out.println("****************************");
            int answer = scan.nextInt();

            switch (answer) {
                case 1:
                    System.out.println("You have chosen to create a new trip.");
                    createTrip();
                    break;
                case 2:
                    System.out.println("You have chosen to view your latest trips.");
                    viewList();
                    break;
                case 3:
                    System.out.println("Exiting, bon voyage enjoy your new trip!");
                    return;
                default:
                    System.out.println("Invalid please try again.");
            }
        }
    }

    public static void createTrip() {
        Scanner scan = new Scanner(System.in);

        System.out.println("What type of trip would you like to create?");
        System.out.println("1. Beach Trip");
        System.out.println("2. Ski Trip");
        int tripType = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the country: ");
        String country = scan.nextLine();

        System.out.print("Enter the duration in days: ");
        int duration = scan.nextInt();

        System.out.print("Is this a leisure trip? (true/false): ");
        boolean isLeisure = scan.nextBoolean();

        System.out.print("Enter the amount of needed checked in luggage : ");
        int luggageAmount = scan.nextInt();

        System.out.print("Enter the budget: ");
        double price = scan.nextDouble();
        scan.nextLine();

        Trip trip;

        if (tripType == 1) {
            System.out.print("Enter the degrees of the destination (for clothing reference): ");
            int degrees = scan.nextInt();
            trip = new BeachTrip(country, duration, isLeisure, luggageAmount, price, degrees);
        } else if (tripType == 2) {
            System.out.print("Enter the name of the ski rental company: ");
            String skiRental = scan.nextLine();
            trip = new SkiTrip(country, duration, isLeisure, luggageAmount, price, skiRental);
        } else {
            System.out.println("Invalid trip type. Returning to main menu.");
            return;
        }

        trips.add(trip);
        System.out.println("\n" + ANSI_PURPLE + "Trip created successfully!\n" + ANSI_RESET);
    }

    public static void viewList() {
        if (trips.isEmpty()) {
            System.out.println("No trips available.");
        } else {
            for (Trip trip : trips) { //foretrækker et for each loop her
                System.out.println(trip);
            }
        }
    }
}
