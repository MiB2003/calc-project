package task4.part4_2;

/**
 * Created by BVV on 06.03.2019
 */

public class App {
    public static void main(String[] args) {
        GiftBox box = new GiftBox();
        box.addItem(new Candy("Ясная поляна", 250, 200));
        box.addItem(new Candy("Мишка на севере", 270, 100));
        box.addItem(new Cookie("Мария", 170, 700));
        box.addItem(new Candy("Раковая шейка", 200, 450));
        box.addItem(new Chocolate("Машенька", 150, 100));
        box.ptintItems();
        box.ptintTotal();
    }


}
