package Design_patterns.Behavioural_Design_pattern.Strategy.VideoQualityStrategy;

public class HighQualityStrategy implements QualityAdjustmentStrategy{
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.HIGH;
    }

    @Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video;
    }
}
