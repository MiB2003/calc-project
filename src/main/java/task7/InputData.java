package task7;

import java.util.Scanner;

/**
 * Created by BVV on 03.03.2019
 */

public class InputData {
    /**
     * Returns the number entered by the user
     *
     * @param n number of input
     * @return returns the number entered by the user
     * @author Bykov V.V.
     */
    public static Double inputNumber(String n) {
        Double d = null;
        for (int i = 1; i < 4; i++) {
            System.out.print("Введите " + n + "-e число: ");
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            if (!sc.hasNextDouble()) { // возвращает истинну если с потока ввода можно считать число
                if (i == 3) {
                    System.out.print("Превышено допустимое количество попыток ввода...");
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

    public static String inputOperations() {
        String oper = null;
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите знак требуемой операции: + (сложение), - (вычетание), * (умножение), / (деление)");
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            oper = sc.nextLine();
            if (!(oper.equals("+") || oper.equals("-") || oper.equals("/") || oper.equals("*"))) {
                if (i == 3) {
                    System.out.print("Превышено допустимое количетво попыток ввода...");
                    break;
                } else System.out.println("Вы ввели не допустимый символ операции, повторите ввод");
            } else {
                System.out.println("Вы выбрали: " + oper);
                break;
            }
        }
        return oper;
    }
}
