package weapons.method_factory;

//Оружейный тир
public abstract class WeaponsRange {
    //получить оружые
    public Weapons getWeapons(String type){
        Weapons weapons;
        weapons=shooseWeapons(type);

        weapons.taken();
        weapons.recharge();
        weapons.shot();

        return weapons;
    }

    //Фабричный метод стал абстрактным методом WeaponsRange
    //Вся отвественность за создание экземпляров Weapons перемещенна в метод, действующий как фабрика
    //Фабричный метод отвечает за создание обьектов и инкапсулирует эту операцию в субклассу.
    //Таким образом клиентский код в суперклассе отделяется от кода создания обьекта в субклассе.
    //выбрать оружие
    public abstract Weapons shooseWeapons(String type);
}
