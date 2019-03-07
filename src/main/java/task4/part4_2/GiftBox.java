package task4.part4_2;

/**
 * Created by BVV on 06.03.2019
 */

public class GiftBox {
    Sweet[] nSweets = new Sweet[0];
    double fullPrice = 0;
    double fullWight = 0;

    public void addItem(Sweet sweet) {
        int oldItem = nSweets.length;
        Sweet[] newSweets = new Sweet[oldItem + 1];
        for (int i = 0; i < oldItem; i++) {
            newSweets[i] = nSweets[i];
        }
        newSweets[oldItem] = sweet;
        nSweets = newSweets;
        fullPrice += sweet.price;
        fullWight += sweet.wight;
    }

    public void ptintItemsFormat() {
        StringBuilder result = new StringBuilder("");
        result.append("\nПЕРЕЧЕНЬ СЛАДОСТЕЙ В НАБОРЕ:\n");
        result.append("=====+==================+==============================+=========+========\n")
                .append(String.format(" %-3s| %-16s | %-28s |%-7s| %-35s\n", "№", "Вид сладости", "Наименование", "Цена,руб.", "Вес,гр."))
                .append("=====+==================+==============================+=========+========\n");
        for (int i = 0; i < nSweets.length; i++) {
            result.append(String.format(" %-3s | %-16s | %-28s | %-7s | %-35s\n", i + 1, nSweets[i].type(), nSweets[i].getName(), nSweets[i].getPrice(), nSweets[i].getWight()));
        }
        result.append("=====+==================+==============================+=========+========\n");
        System.out.print(result);
    }

    public void ptintTotalFormat() {
        StringBuilder result = new StringBuilder("");
        result.append(String.format("%54s | %-7s | %-35s\n", "Общая стоимость и вес набора ", getFullPrice(), getFullWight()))
                .append("=======================================================+=========+========\n");
        System.out.println(result);
    }

    public void ptintItems() {
        System.out.println("Подарок содержит:");
        System.out.println("======================================================");
        for (int i = 0; i < nSweets.length; i++) {
            System.out.println(nSweets[i].description());
        }
    }

    public void ptintTotal() {
        System.out.println("======================================================");
        System.out.println("Общая стоимость подарка: " + getFullPrice() + " руб., вес подарка: " + getFullWight() + " гр.");
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public double getFullWight() {
        return fullWight;
    }
}
