package task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by BVV on 03.03.2019
 */

public class StartMenu {
    public static int startMenu() {
        int result;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Здравствуйте! Сделайте выбор:\n" +
                "1)Запустить Калькулятор.\n" +
                "2)Выход");
        while (true) {
            try {
                result = Integer.valueOf(reader.readLine());
                if (result == 1 || result == 2 )
                    return result;
                else throw new IOException();
            } catch (IOException | NumberFormatException ex) {
                System.out.println("Ошибка выбора операции.");
               result = -1;
               return  result;
            }
        }
    }
}
