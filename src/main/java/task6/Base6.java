package task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by BVV on 09.03.2019
 */

public class Base6 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\IdeaProjects\\calc\\src\\main\\resources\\testText.txt");
        Scanner scanner = null;
        int worldCount = 0;
        Integer maxNumberWord = 0;
        String word = null;
        Map<String, Integer> statistics = new TreeMap<>();
        try {
            scanner = new Scanner(file);
            System.out.println("Из файла прочитаны следующие слова отсортированные в алфавитном порядке:");
            while (scanner.hasNext()) {
                worldCount = worldCount + 1;
                word = scanner.useDelimiter("\\s+").next();
                Integer count = statistics.get(word);
                if (count == null) count = 0;
                statistics.put(word, ++count);
                if (count > maxNumberWord) {
                    maxNumberWord = count;
                }
            }
            System.out.println(statistics);
            System.out.println("Всего в списке слов: " + worldCount);
            System.out.print("Чаще всего, " + maxNumberWord + " раз(а) встречается слово(ва): ");
            Set<Map.Entry<String, Integer>> entrySet = statistics.entrySet();
            for (Map.Entry<String, Integer> pair : entrySet) {
                if (maxNumberWord.equals(pair.getValue())) {
                    System.out.print("[" + pair.getKey() + "] ");// нашли наше значение и возвращаем  ключ
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}

