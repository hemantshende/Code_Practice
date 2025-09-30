package Design_patterns.Behavioural_Design_pattern.Strategy.GoogleMapTravelMode;

public class ByTrain implements TravelStrategy {

    @Override
    public void calculateTime() {
        System.out.println("calculating time by Train Mode...!!");
    }
}
