package Design_patterns.Behavioural_Design_pattern.Observer.YouTubeNotification;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<Observer> subscribers=new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for(Observer subscriber:subscribers){
            subscriber.update(message);
        }
    }

    public void printListOfObserver(){
        for(Observer o:subscribers){
            System.out.println(o);
        }
    }
}
