package weapons.method_factory;

//Оружие
public abstract class Weapons {
    private String name;
    private double coliber;

    //взять
    public void taken(){
        System.out.println("Taken "+getName());
    }

    //перезаридить
    public void recharge(){
        System.out.println("Recharge weapons cartridges of caliber "+getColiber());
    }

    //выстрелить
    public void shot(){
        System.out.println("Shot");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getColiber() {
        return coliber;
    }

    public void setColiber(double coliber) {
        this.coliber = coliber;
    }
}
