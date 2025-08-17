package Design_patterns.Behavioural_Design_pattern.Strategy.VideoQualityStrategy;

public class Client {
    public static void main(String[] args) {

        // Inject video and strategy into manager
        VideoStreamingManager manager =
                new VideoStreamingManager(
                        new Video("https://example.com/video.mp4", VideoQuality.LOW),
                        new LowQualityStrategy());

        Video video=manager.streamVideo();

        System.out.println(video.getVideoQuality());
    }
}
