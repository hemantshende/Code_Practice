package Design_patterns.Structural_design_pattern.Flyweight;

public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    private UserIntrinsicState userIntrinsicState;

    public UserExtrinsicState(Colour colour, int currentGameStreak, UserIntrinsicState userIntrinsicState) {
        this.colour = colour;
        this.currentGameStreak = currentGameStreak;
        this.userIntrinsicState = userIntrinsicState;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public int getCurrentGameStreak() {
        return currentGameStreak;
    }

    public void setCurrentGameStreak(int currentGameStreak) {
        this.currentGameStreak = currentGameStreak;
    }

    public UserIntrinsicState getUserIntrinsicState() {
        return userIntrinsicState;
    }

    public void setUserIntrinsicState(UserIntrinsicState userIntrinsicState) {
        this.userIntrinsicState = userIntrinsicState;
    }
}
