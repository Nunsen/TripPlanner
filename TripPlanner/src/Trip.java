public class Trip {
    private String country;
    private int duration;
    private boolean isLeisure;
    private int luggageAmount;

    private double budget;


    public Trip (String country, int duration, boolean isLeisure, int luggageAmount, double budget){
        this.country = country;
        this.duration = duration;
        this.isLeisure = isLeisure;
        this.luggageAmount = luggageAmount;
        this.budget = budget;
    }

    public String getCountry(){
        return country;
    }

    public int getDuration(){
        return duration;
    }
    public boolean getIsLeisure(){
        return isLeisure;
    }

    public int getLuggageAmount(){
        return luggageAmount;
    }

    public double getBudget(){
        return budget;
    }

    public String toString() {
        return "Trip to " + country + " for " + duration + " days, Leisure: " + isLeisure + ", Amount of checked luggage: " + luggageAmount + "bags, Budget: $" + budget +"\n";
    }
}



