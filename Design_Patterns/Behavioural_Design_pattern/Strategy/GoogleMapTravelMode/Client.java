package Design_patterns.Behavioural_Design_pattern.Strategy.GoogleMapTravelMode;

public class Client {
    public static void main(String[] args) {
        NavigationContext navigationContext=new NavigationContext(new ByBike());
        navigationContext.estimateTime();

        NavigationContext navigationContext1=new NavigationContext(new ByBus());
        navigationContext1.estimateTime();

        NavigationContext navigationContext2=new NavigationContext(new ByCar());
        navigationContext2.estimateTime();

        NavigationContext navigationContext3=new NavigationContext(new ByTrain());
        navigationContext3.estimateTime();
    }
}
