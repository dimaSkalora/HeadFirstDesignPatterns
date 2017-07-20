package singleton;

public class SingletonVolatile {
    //Статическая переменая для хранения единственого экземпляра
    //Ключевое слолво volatile гарантирует что паралельнные програмные потоки будут правильно
    //работать с переменой ourInstance при ее инициализаци экземпляром SingletonVolatile
    private volatile static SingletonVolatile ourInstance;

    //Создает и возвращает экземпляр
    public static SingletonVolatile getInstance() {
        if(ourInstance == null){
            synchronized (SingletonVolatile.class){
                if(ourInstance == null)
                    ourInstance = new SingletonVolatile();
            }
        }
        return ourInstance;
    }

    //Приватный конструктор, только Singleton может создавать экземпляры этого класса
    private SingletonVolatile() {
    }
}
