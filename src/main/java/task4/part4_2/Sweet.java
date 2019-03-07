package task4.part4_2;

/**
 * Created by BVV on 06.03.2019
 */

public abstract class Sweet {
    String name;
    String type;
    double price = -1;
    double wight = 0;

    public Sweet(String name) {
        this.name = name;
    }

    public Sweet(String name, double price, double wight) {
        this.name = name;
        this.price = price;
        this.wight = wight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWight() {
        return wight;
    }

    public abstract String description();

    public abstract String type();

}
