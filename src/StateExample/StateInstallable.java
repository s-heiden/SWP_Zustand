package StateExample;

public class StateInstallable implements State {

    @Override
    public State buyGame() {
        System.out.println("StateInstallable: Game was already purchased.");
        return new StateInstallable();
    }

    @Override
    public State installGame() {
        System.out.println("StateInstallable: Game was installed successfully.");
        return new StatePlayable();
    }

    @Override
    public State playGame() {
        System.out.println("StateInstallable: Must install first.");
        return new StateInstallable();
    }
}
