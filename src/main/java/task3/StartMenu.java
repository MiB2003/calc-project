package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by BVV on 03.03.2019
 */

public class StartMenu {
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
}
