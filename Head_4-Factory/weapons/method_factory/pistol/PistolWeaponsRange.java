package weapons.method_factory.pistol;

import weapons.method_factory.Weapons;
import weapons.method_factory.WeaponsRange;

public class PistolWeaponsRange extends WeaponsRange{
    @Override
    public Weapons shooseWeapons(String type) {
        if(type.equals("magnum"))
            return new PistolMagnum();
        else if(type.equals("beretta"))
            return new PistolBeretta();
        else
            return null;
    }
}
