package StateExample;

public class StateBuyable implements State  {

    @Override
    public State buyGame() {
        System.out.println("StateBuyable: Game was purchased successfully.");
        return new StateInstallable();
    }

    @Override
    public State installGame() {
        System.out.println("StateBuyable: Must buy first.");
        return new StateBuyable();
    }

    @Override
    public State playGame() {
        System.out.println("StateBuyable: Must buy first.");
        return new StateBuyable();
    }
}
