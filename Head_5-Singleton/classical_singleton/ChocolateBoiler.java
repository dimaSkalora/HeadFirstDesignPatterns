package classical_singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiler;

    private static ChocolateBoiler chocolateBoiler;

    public static ChocolateBoiler getInstance(){
        if(chocolateBoiler == null)
            chocolateBoiler = new ChocolateBoiler();
        return chocolateBoiler;
    }

    private ChocolateBoiler() {
        empty=true;
        boiler=false;
    }

    public void fill(){
        if(isEmpty()){
            empty=false;
            boiler=false;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiler())
            boiler=true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiler() {
        return boiler;
    }
}
