package gumball_state_winner;

public interface State {
    //Действия Бросить монетку
    void insertQuarter();
    //Вернуть монетку
    void ejectQuarter();
    //Дергнуть за рычаг
    void turnCrank();
    //Выдача шарика
    void dispense();
}
