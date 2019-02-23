
import java.util.Scanner;

/**
 * create by Bykov V. V
 */

public class Base {

    public static void main(String[] args) {
        Double d;
        Double d2;

        d = inputDouble("1");
        if (d == null) return;
        d2 = inputDouble("2");
        if (d2 == null) return;

        System.out.print("test end =" +(d+d2));
    }

    private static Double inputDouble(String n) {
        Double d = null;
        for (int i = 1; i < 4; i++) {
            System.out.print("Введите " + n + "-e число : ");
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            if (!sc.hasNextDouble()) { // возвращает истинну если с потока ввода можно считать число
                if (i == 3) {
                    System.out.print("Превышено допустимое количетво попыток ввода");
                    break;
                } else System.out.println("Вы ввели не число, повторите ввод");
            } else {
                d = sc.nextDouble(); // считывает целое число с потока ввода и сохраняем в переменную
                System.out.println("Вы ввели число: " + d);
                break;
            }
        }
        return d;
    }

}

