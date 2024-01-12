package Characters;
import Interfaces.*;

public class Dogs extends Essence implements IRunningTo, IReact {
    public Dogs(String name) {
        super(name);
    }

    @Override
    public void runTo(Essence essTo, String intention) {
        System.out.println("К "+essTo.getName()+" подбежала "+this.getName()+" с намерением "+intention);
    }

    @Override
    public void react(Essence ess, String reason) {
        System.out.println(this.getName()+" хотел было ринуться в бой с "+ess.getName()+" ,"+reason);
    }

    @Override
    public void breath() {
        System.out.println("собака дышит");
    }
}
