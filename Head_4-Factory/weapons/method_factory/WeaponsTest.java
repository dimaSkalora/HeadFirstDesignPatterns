package weapons.method_factory;

import weapons.method_factory.automaton.AutomatonWeaponsRange;
import weapons.method_factory.pistol.PistolWeaponsRange;

public class WeaponsTest {
    public static void main(String[] args) {
        WeaponsRange pistol = new PistolWeaponsRange();
        WeaponsRange automaton = new AutomatonWeaponsRange();

        System.out.println("---------------------------------------------------");
        System.out.println("Pistol 1");
        Weapons magnum = pistol.getWeapons("magnum");
        System.out.println("Pistol 2");
        Weapons beretta = pistol.getWeapons("beretta");

        System.out.println("---------------------------------------------------");
        System.out.println("Automaton 1");
        Weapons rmk7 = automaton.getWeapons("rmk7");
        System.out.println("Automaton 2");
        Weapons mp5 = automaton.getWeapons("mp5");
    }
}
