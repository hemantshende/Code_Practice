package Design_patterns.Behavioural_Design_pattern.Observer.YouTubeNotification;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver(String message);
}
