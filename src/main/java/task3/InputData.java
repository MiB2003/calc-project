package task3;

import java.util.Scanner;

/**
 * Created by BVV on 03.03.2019
 */

public class InputData {
    /**
     * Returns the number entered by the user
     *
     * @param n      number of input
     * @param isCalc mode of operation (true - a calculator, false- others.)
     * @return returns the number entered by the user
     * @author Bykov V.V.
     */
    public static Double inputNumber(String n, boolean isCalc) {
        Double d = null;
        for (int i = 1; i < 4; i++) {
            if (isCalc) System.out.print("Введите " + n + "-e число: ");
            else System.out.print("Введите размер массива: ");
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            if (!sc.hasNextDouble()) { // возвращает истинну если с потока ввода можно считать число
                if (i == 3) {
                    System.out.print("Превышено допустимое количетво попыток ввода...");
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
