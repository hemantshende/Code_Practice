package Design_patterns.Structural_design_pattern.Flyweight;

public interface FlyweightRegistry {
    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}
