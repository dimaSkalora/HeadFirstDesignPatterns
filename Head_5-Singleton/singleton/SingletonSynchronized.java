package singleton;

public class SingletonSynchronized {
    //Статическая переменая для хранения единственого экземпляра
    private static SingletonSynchronized ourInstance;

    //Создает и возвращает экземпляр
    //Мы заставляем каждый поток дождатся своей очереди для входа в негою
    //Иначе говоря, два потока не смолгут войти в метод одновременно
    public static synchronized SingletonSynchronized getInstance() {
        if(ourInstance == null)
            ourInstance = new SingletonSynchronized();
        return ourInstance;
    }

    //Приватный конструктор, только Singleton может создавать экземпляры этого класса
    private SingletonSynchronized() {
    }
}
