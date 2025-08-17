package Design_patterns.Structural_design_pattern.Flyweight;

public class Client {
    public static void main(String[] args) {
        // Create the Flyweight Registry
        FlyweightRegistry registry = new ChessUserFlyweightRegistry();

        // Shared photo
        Byte[] samplePhoto = new Byte[]{1, 2, 3};

        // Add shared user (intrinsic state)
        UserIntrinsicState user1 = new UserIntrinsicState(
                "Hemant", 29, "Male", "hemant@example.com", "1234567890", samplePhoto
        );
        registry.addFlyweight(user1);

        // Fetch shared user from registry
        UserIntrinsicState fetchedUser = registry.getFlyweight("hemant@example.com");

        // Create extrinsic states for two different games
        UserExtrinsicState game1 = new UserExtrinsicState(Colour.WHITE, 3, fetchedUser);
        UserExtrinsicState game2 = new UserExtrinsicState(Colour.BLACK, 5, fetchedUser);

        // Output for verification
        System.out.println("Game 1: " + game1.getUserIntrinsicState().getName() + ", Colour: " + game1.getColour() + ", Streak: " + game1.getCurrentGameStreak());
        System.out.println("Game 2: " + game2.getUserIntrinsicState().getName() + ", Colour: " + game2.getColour() + ", Streak: " + game2.getCurrentGameStreak());
    }
}

