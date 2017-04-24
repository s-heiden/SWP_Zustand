package StateExample;

public class StatePlayable implements State {

    @Override
    public State buyGame() {
        System.out.println("StatePlayable: Game was already purchased.");
        return new StatePlayable();
    }

    @Override
    public State installGame() {
        System.out.println("StatePlayable: Game was already installed.");
        return new StatePlayable();
    }

    @Override
    public State playGame() {
        System.out.println("StatePlayable: Playing…");
        return new StatePlayable();
    }
}
