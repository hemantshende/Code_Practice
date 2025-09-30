package Design_patterns.Behavioural_Design_pattern.Observer.YouTubeNotification;

public class Subscriber implements Observer{
    private String name;

    Subscriber(String name){   //constructor
        this.name=name;
    }


    @Override
    public void update(String message) {
        System.out.println(name+ " Received notification: "+message);
    }

    @Override
    public String toString() {
        return "Subscriber{" + "name='" + name +"}";
    }
}
