
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * create by Bykov V.V.
 */

public class Base  {

    public static void main(String[] args) {
        int result = startMenu();
        if (result == 1) Calc.calc();
        if (result == 2) StringArray.stringArray();
    }

    public static int startMenu() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Здравствуйте! Сделайте выбор:\n" +
                "1)Запустить Калькулятор.\n" +
                "2)Поиск максимального элемента в масиве.\n" +
                "3)Выход");
        while (true) {
            try {
                int result = Integer.valueOf(reader.readLine());
                if (result == 1 || result == 2 || result == 3)
                    return result;
                else throw new IOException();
            } catch (IOException | NumberFormatException ex) {
                System.out.println("Ошибка выбора операции. Сделайте выбор и введите номер операции!");
                System.out.println("1)Запустить Калькулятор.\n" +
                        "2)Поиск максимального элемента в масиве.\n" +
                        "3)Выход");
            }
        }
    }

    public static Double inputNumber(String n, boolean isCalc) {
        Double d = null;
        for (int i = 1; i < 4; i++) {
            if (isCalc)System.out.print("Введите " + n + "-e число: ");
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

