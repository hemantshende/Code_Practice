package Design_patterns.Structural_design_pattern.Flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChessUserFlyweightRegistry implements FlyweightRegistry{

    private Map<String,UserIntrinsicState> map=new ConcurrentHashMap<>();

    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        map.putIfAbsent(flyweight.getEmail(), flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return map.get(email);
    }
}
