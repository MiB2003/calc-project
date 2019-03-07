package task4.part4_2;

/**
 * Created by BVV on 06.03.2019
 */

public class Candy extends Sweet {

    public Candy(String name) {
        super(name);
    }

    public Candy(String name, double price, double wight) {
        super(name, price, wight);
    }

    public String type() {
        return "Конфеты";
    }

    public String description() {
        return "Конфеты: " + name + ", весом: " + wight + "гр. по цене: " + price + " руб.";
    }
}
