package classical_singleton;

public class Singleton {
    //Статическая переменая для хранения единственого экземпляра
    private static Singleton ourInstance;

    //Создает и возвращает экземпляр
    public static Singleton getInstance() {
        if(ourInstance == null)
            ourInstance = new Singleton();
        return ourInstance;
    }

    //Приватный конструктор, только Singleton может создавать экземпляры этого класса
    private Singleton() {
    }
}
