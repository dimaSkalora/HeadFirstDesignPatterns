package template_method;

//Абстрактный класс, он должен субкласироватся, представляющий реализацию операции
public abstract class AbstractClass {
    //Шаблонный метод, обьявляется с ключевым словом final,
    //что бы субкласы не могли изменить последователдьность шагов в алгоритме
    final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        createOperation();
        hook();
    }

    abstract void primitiveOperation1();
    abstract void primitiveOperation2();
    final void createOperation(){
        //Реализация
    }
    //Субклассы могут переопределять такие методы(называемые"перехватчиками"), но не обязаны это делать
    void hook(){}
}
