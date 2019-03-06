package task4.part4_2;

/**
 * Created by BVV on 06.03.2019
 */

public class Cookie extends Sweet {

    public Cookie(String name) {
        super(name);
    }

    public Cookie(String name, double price, double wight) {
        super(name, price, wight);
    }

    @Override
    public String description() {
        return "Печенье: " + name + ", весом: " + wight + "гр. по цене: " + price + " руб.";
    }
}
