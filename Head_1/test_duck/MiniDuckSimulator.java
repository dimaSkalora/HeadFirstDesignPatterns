package test_duck;

import test_duck.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        //Первый вызов performFly() передается реализации, заданой в конструктаре
        //ModelDuck - тоесть экземпляру FlyNoWay
        model.performFly();
        //Вызывваем set- метод, унаследованный классом ModelDuck и утка - применка
        //вдруг взлетает на реактивном двигателе!
        model.setFlyBehavior(new FlyRocketPowered());
        //Способность утки - приманки к полету переключается динамически!
        //Если бы реализация находиласть в иурархии Duck, то такое было бы не возможно
        model.performFly();
    }
}
