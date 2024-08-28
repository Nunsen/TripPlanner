public class BeachTrip extends Trip{
        private int degrees;
        public BeachTrip (String country, int duration, boolean isLeisure, int luggageAmount, double budget,int degrees){
            super (country, duration, isLeisure, luggageAmount, budget);
            this.degrees = degrees;
        }

        public int getDegrees() {
            return degrees;
        }

    public String toString() {
        return super.toString() + ", Expected degrees: " + degrees + "\n";
    }

}
