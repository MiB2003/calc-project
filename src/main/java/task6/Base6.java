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
        List<String> strings = new ArrayList<String>();
        Scanner sc = null;
        int count = 0;
        int maxNumberWord = 0;
        String maxWord = null;
        int lineNumber = 0;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                lineNumber = lineNumber + 1;
                String line = sc.nextLine().toLowerCase().trim();  //приводим все слова к нижнему регистру и убераем пробелы в начале и конце строки
                System.out.println("Из файла прочитана строка " + lineNumber + ":");
                System.out.println("'" + line + "'"); //печать строки в стандартный вывод.
                System.out.println("Вид строки после сортировки:");
                List<String> words = new LinkedList<String>(Arrays.asList(line.split("\\s+")));
                Collections.sort(words); // сортировка списка
                System.out.println("'" + words + "'"); //печать отсортированного списка слов.
                System.out.println("В ней встречаются слова седующее число раз:");
                HashMap<String, Integer> wordToCount = new HashMap<>();
                for (String word : words) {
                    count++;
                    if (!wordToCount.containsKey(word)) {
                        wordToCount.put(word, 0);
                    }
                    wordToCount.put(word, wordToCount.get(word) + 1);
                }
                for (String word : wordToCount.keySet()) {
                    if (wordToCount.get(word) > maxNumberWord) {
                        maxWord = word;
                        maxNumberWord = wordToCount.get(word);
                    }
                    System.out.println(word + " -" + wordToCount.get(word) + " раз(а)");
                }
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
        System.out.println("Слово \"" + maxWord + "\" встречается чаще, всего: " + maxNumberWord + " раз(а)");
        System.out.println("Всего слов: " + count);
    }
}

