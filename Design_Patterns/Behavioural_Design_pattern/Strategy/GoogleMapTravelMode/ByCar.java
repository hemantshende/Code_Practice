package Design_patterns.Behavioural_Design_pattern.Strategy.GoogleMapTravelMode;

public class ByCar implements TravelStrategy {
    @Override
    public void calculateTime() {
        System.out.println("calculating time by car Mode...!!");
    }
}
