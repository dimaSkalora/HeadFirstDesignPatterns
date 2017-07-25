package gumball_monitor;

import java.io.Serializable;

//Все возвращаемые типы должны быть примитивными или Serializable
public interface State extends Serializable{
    //Действия Бросить монетку
    void insertQuarter();
    //Вернуть монетку
    void ejectQuarter();
    //Дергнуть за рычаг
    void turnCrank();
    //Выдача шарика
    void dispense();
}
