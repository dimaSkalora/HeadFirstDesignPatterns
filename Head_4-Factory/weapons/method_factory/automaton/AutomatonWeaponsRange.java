package weapons.method_factory.automaton;

import weapons.method_factory.Weapons;
import weapons.method_factory.WeaponsRange;

public class AutomatonWeaponsRange extends WeaponsRange{
    @Override
    public Weapons shooseWeapons(String type) {
        if(type.equals("mp5"))
            return new AutomatomMP();
        else if(type.equals("rmk7"))
            return new AutomatonRMK();
        else
            return null;
    }
}
