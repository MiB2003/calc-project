package task4.part4_2;

/**
 * Created by BVV on 06.03.2019
 */

public class Chocolate extends Sweet {

    public Chocolate(String name) {
        super(name);
    }

    public Chocolate(String name, double price, double wight) {
        super(name, price, wight);
    }

    public String type() {
        return "Шоколад";
    }

    public String description() {
        return "Шоколад: " + name + ", весом: " + wight + "гр. по цене: " + price + " руб.";
    }
}
