package Design_patterns.Behavioural_Design_pattern.Strategy.VideoQualityStrategy;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();
    Video adjust(Video video);
}
