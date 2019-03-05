package task4;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by BVV on 04.03.2019
 */

public class Base4_1 {
    public static void main(String[] args) {
        int maxMinusValue = Integer.MIN_VALUE;
        int minPlusValue = Integer.MAX_VALUE;
        int maxMinusCount = 0, minPlusCount = 0, maxMinusIndex = 0, minPlusIndex = 0;

        Random random = new Random(); // создаем объект класса Random
        int[] array = new int[20]; // создаем массив размерностью 20

        // заполняем массив случайными целыми числами из диапазона -10 до 10
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(21) - 10;

        // Поиск максимального отрицательного и минимального положительного элемента массива и их количества
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number < 0 && number > maxMinusValue) {
                maxMinusValue = number;
                maxMinusCount = 1;
                maxMinusIndex = i;
            } else if (number == maxMinusValue) maxMinusCount++;
            if (number > 0 && number < minPlusValue) {
                minPlusValue = number;
                minPlusCount = 1;
                minPlusIndex = i;
            } else if (number == minPlusValue) minPlusCount++;
        }
        System.out.println("Массив заполнен.");
        System.out.println("Максимальное отрицательное число = " + maxMinusValue + ", встречается  " + maxMinusCount + " раз(а)");
        System.out.println("Минимльное положительное число = " + minPlusValue + ", встречается  " + minPlusCount + " раз(а)");
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        // Поменять их местами. (меняеться местами первая найденая пара)
        array[minPlusIndex] = maxMinusValue;
        array[maxMinusIndex] = minPlusValue;
        System.out.print("Массив после замены: ");
        System.out.println(Arrays.toString(array));
    }
}

