package adapter.duck;

//Необходимо реализовать интерфейс того типа на который расчитан ваш клиен
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    //Затем следует получить ссылку на адаптируемый обьект, обычно это делается в конструктаре
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //Адаптер должен реализовать все методы интерфейса
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i<5;i++)
            turkey.fly();
    }
}
