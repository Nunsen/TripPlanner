public class SkiTrip extends Trip{
    private String skiRental;
    public SkiTrip (String country, int duration, boolean isLeisure, int luggageAmount, double budget, String skiRental){
       super (country, duration, isLeisure, luggageAmount, budget);
       this.skiRental = skiRental;
    }

    public String getSkiRental() {
        return skiRental;
    }

    public String toString() {
        return super.toString() + ", Ski Rental: " + skiRental + "\n";
    }
}
