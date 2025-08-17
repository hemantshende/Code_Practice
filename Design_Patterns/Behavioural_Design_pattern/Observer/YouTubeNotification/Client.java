package Design_patterns.Behavioural_Design_pattern.Observer.YouTubeNotification;

public class Client {
    public static void main(String[] args) {
        YouTubeChannel channel=new YouTubeChannel();

        Observer subscriber1=new Subscriber("hemant");
        Observer subscriber2=new Subscriber("xyz");
        Observer subscriber3=new Subscriber("abc");

        channel.attach(subscriber1);
        channel.attach(subscriber2);
        channel.attach(subscriber3);

//        channel.printListOfObserver();

        channel.detach(subscriber3);

        channel.printListOfObserver();

        channel.notifyObserver("new video uploaded");

    }
}
