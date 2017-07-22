package adapter.iterator_enumeration;

import java.util.Enumeration;
import java.util.Iterator;

//Чтобы адаптер воспринимался клиенстским кодом как итератор, он реализует интерфейс iterator
public class EnumerationIterator implements Iterator{
    Enumeration enumeration;

    //Адаптируемый обьект Enumeration сохраняется в переменной
    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    //Метод hashNext() интерфейса iterator передает управление методу hasMoreElements() интерфейса Enumeration
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    //передает управления nextElements()
    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    //К сожелению, поддержать метод remove() интерфейса iterator  не удастся, поэтому мы просто иницируем исключение
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
