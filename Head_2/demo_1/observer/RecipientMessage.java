package demo_1.observer;

import demo_1.subject.Subject;

//Получатель сообщений
public class RecipientMessage implements Observer, Display{
    private String text;
    private String name;
    private Subject subject;

    //Конструктору передается обьект SenderMessage, который используется для
    //регистрации элемента в качестве наблюдателя
    public RecipientMessage(Subject subject,String name) {
        this.subject = subject;
        this.name=name;
        subject.registerObserver(this);
    }

    //Метод display() просто выводит текущее значения температуры и влажности
    @Override
    public void display() {
        System.out.println(String.format("Сообщения от SenderMessage: %s, кому пришло сообщения %s",text,name ));
    }

    //При вызове update() мы сохраняем значение температуры и влажности, после чего вызываем display()
    @Override
    public void update(String text) {
        this.text=text;
        display();
    }
}
