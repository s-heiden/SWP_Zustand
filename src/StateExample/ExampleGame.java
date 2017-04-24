package StateExample;

public class ExampleGame implements Game {

    private State state = new StateBuyable();

    @Override
    public void buyGame() {
        state = state.buyGame();
    }

    @Override
    public void installGame() {
        state = state.installGame();
    }

    @Override
    public void playGame() {
        state = state.playGame();
    }

}
