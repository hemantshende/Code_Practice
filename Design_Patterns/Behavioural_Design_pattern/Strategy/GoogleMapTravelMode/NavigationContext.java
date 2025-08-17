package Design_patterns.Behavioural_Design_pattern.Strategy.GoogleMapTravelMode;

public class NavigationContext {
    private TravelStrategy strategy;

    NavigationContext(TravelStrategy strategy){
        this.strategy=strategy;                         //traveling mode is settled here
    }

    public void estimateTime(){
        if(strategy==null){
            throw new RuntimeException("plz select traveling mode");
        }
        strategy.calculateTime(); //go to particular traveling mode and calculate time ..
    }
}
