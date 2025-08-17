package Design_patterns.Behavioural_Design_pattern.Strategy.VideoQualityStrategy;

public class VideoStreamingManager {
    private Video video;
    private QualityAdjustmentStrategy strategy;

    public VideoStreamingManager(Video video,QualityAdjustmentStrategy strategy) {
        this.video=video;
        this.strategy=strategy;
    }

    public Video streamVideo(){
        strategy.supportsType();
        strategy.adjust(video);
        return video;
    }
}
